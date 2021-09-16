import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.List;

public class Bombastik {

    public static class AbstractCharacter {
        private final static int SIZE = 30;
        private int x;
        private int y;
        private int pixelsPerStep;

        protected AbstractCharacter(int x, int y, int pixelsPerStep) {
            this.x = x;
            this.y = y;
            this.pixelsPerStep = pixelsPerStep;
        }

        public enum Move {
            DOWN(0, 1),
            UP(0, -1),
            RIGHT(1, 0),
            LEFT(-1, 0);

            private final int deltaX;
            private final int deltaY;

            Move(final int deltaX, final int deltaY) {
                this.deltaX = deltaX;
                this.deltaY = deltaY;
            }
        }

        public void moveCharacter(Move move) {
            y += move.deltaY * pixelsPerStep;
            x += move.deltaX * pixelsPerStep;
        }

        public void moveBack(Move currentDirection) {
            if (currentDirection == Move.DOWN) {
                moveCharacter(Move.UP);
            } else if (currentDirection == Move.UP) {
                moveCharacter(Move.DOWN);
            } else if (currentDirection == Move.LEFT) {
                moveCharacter(Move.RIGHT);
            } else if (currentDirection == Move.RIGHT) {
                moveCharacter(Move.LEFT);
            }
        }

        public int getSize() {
            return SIZE;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getColIndex() {
            return Floor.pixelToSquare(x);
        }

        public int getRowIndex() {
            return Floor.pixelToSquare(y);
        }
    }


    public enum FloorTile    // Inspector complains on enum not being used, which is not the case.
    {
        /**
         * This enum-type represents the FLOOR on which the AbstractCharacters can move and drop bombs.
         */
        FLOOR,
        /**
         * This enum-type represents the UNBREABLEBLOCKs which serves as a frame and blocks that cannot
         * be destroyed or walked over.
         */
        UNBREAKABLEBLOCK,
        /**
         * This enum-type represents the BREABLEBLOCKs can be destroyed by bombs and potentially drop powerups.
         */
        BREAKABLEBLOCK
    }

    /**
     * This Interface class is excluded to one method, floorChanged which is implemented in BombermanComponent
     * where the method repaints the game.
     */
    public interface FloorListener {
        void floorChanged();
    }


    public static class Floor {
        // Constants are static by definition.
        private final static double CHANCE_FOR_BREAKABLE_BLOCK = 0.4;
        private final static double CHANCE_FOR_RADIUS_POWERUP = 0.2;
        private final static double CHANCE_FOR_COUNTER_POWERUP = 0.8;
        private final FloorTile[][] tiles;
        private int width;
        private int height;
        private Collection<FloorListener> floorListeners = new ArrayList<>();
        private Player player = null;
        private Collection<Enemy> enemyList = new ArrayList<>();
        private List<Bomb> bombList = new ArrayList<>();
        private Collection<AbstractPowerup> powerupList = new ArrayList<>();
        private Collection<Bomb> explosionList = new ArrayList<>();
        private Collection<Explosion> explosionCoords = new ArrayList<>();
        private boolean isGameOver = false;

        public Floor(int width, int height, int nrOfEnemies) {
            this.width = width;
            this.height = height;
            this.tiles = new FloorTile[height][width];
            placeBreakable();
            placeUnbreakableAndGrass();
            spawnEnemies(nrOfEnemies);
        }

        public static int pixelToSquare(int pixelCoord) {
            return ((pixelCoord + BombermanComponent.getSquareSize() - 1) / BombermanComponent.getSquareSize()) - 1;
        }

        public FloorTile getFloorTile(int rowIndex, int colIndex) {
            return tiles[rowIndex][colIndex];
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public Player getPlayer() {
            return player;
        }

        public Collection<Enemy> getEnemyList() {
            return enemyList;
        }

        public Iterable<Bomb> getBombList() {
            return bombList;
        }

        public int getBombListSize() {
            return bombList.size();
        }

        public Iterable<AbstractPowerup> getPowerupList() {
            return powerupList;
        }

        public Iterable<Explosion> getExplosionCoords() {
            return explosionCoords;
        }

        public boolean getIsGameOver() {
            return isGameOver;
        }

        public void setIsGameOver(boolean value) {
            isGameOver = value;
        }

        public void addToBombList(Bomb bomb) {
            bombList.add(bomb);
        }

        public void createPlayer(BombermanComponent bombermanComponent, Floor floor) {
            player = new Player(bombermanComponent, floor);
        }

        public int squareToPixel(int squareCoord) {
            return squareCoord * BombermanComponent.getSquareSize();
        }

        public void moveEnemies() {
            if (enemyList.isEmpty()) {
                isGameOver = true;
            }
            for (Enemy e : enemyList) {
                AbstractCharacter.Move currentDirection = e.getCurrentDirection();

                if (currentDirection == AbstractCharacter.Move.DOWN) {
                    e.moveCharacter(AbstractCharacter.Move.DOWN);
                } else if (currentDirection == AbstractCharacter.Move.UP) {
                    e.moveCharacter(AbstractCharacter.Move.UP);
                } else if (currentDirection == AbstractCharacter.Move.LEFT) {
                    e.moveCharacter(AbstractCharacter.Move.LEFT);
                } else {
                    e.moveCharacter(AbstractCharacter.Move.RIGHT);
                }

                if (collisionWithBlock(e)) {
                    e.changeDirection();
                }

                if (collisionWithBombs(e)) {
                    e.changeDirection();
                }

                if (collisionWithEnemies()) {
                    isGameOver = true;
                }
            }
        }

        public void addFloorListener(FloorListener bl) {
            floorListeners.add(bl);
        }

        public void notifyListeners() {
            for (FloorListener b : floorListeners) {
                b.floorChanged();
            }
        }

        /**
         * This method creates a bomb if the given demands are satisfied.
         */
        public void bombCountdown() {
            Collection<Integer> bombIndexesToBeRemoved = new ArrayList<>();
            explosionList.clear();
            int index = 0;
            for (Bomb b : bombList) {
                b.setTimeToExplosion(b.getTimeToExplosion() - 1);
                if (b.getTimeToExplosion() == 0) {
                    bombIndexesToBeRemoved.add(index);
                    explosionList.add(b);
                }
                index++;
            }
            for (int i : bombIndexesToBeRemoved) {
                bombList.remove(i);
            }
        }

        public void explosionHandler() {
            Collection<Explosion> explosionsToBeRemoved = new ArrayList<>();
            for (Explosion e : explosionCoords) {
                e.setDuration(e.getDuration() - 1);
                if (e.getDuration() == 0) {
                    explosionsToBeRemoved.add(e);
                }
            }
            for (Explosion e : explosionsToBeRemoved) {
                explosionCoords.remove(e);
            }

            for (Bomb e : explosionList) {
                int eRow = e.getRowIndex();
                int eCol = e.getColIndex();
                boolean northOpen = true;
                boolean southOpen = true;
                boolean westOpen = true;
                boolean eastOpen = true;
                explosionCoords.add(new Explosion(eRow, eCol));
                for (int i = 1; i < e.getExplosionRadius() + 1; i++) {
                    if (eRow - i >= 0 && northOpen) {
                        northOpen = bombCoordinateCheck(eRow - i, eCol, northOpen);
                    }
                    if (eRow - i <= height && southOpen) {
                        southOpen = bombCoordinateCheck(eRow + i, eCol, southOpen);
                    }
                    if (eCol - i >= 0 && westOpen) {
                        westOpen = bombCoordinateCheck(eRow, eCol - i, westOpen);
                    }
                    if (eCol + i <= width && eastOpen) {
                        eastOpen = bombCoordinateCheck(eRow, eCol + i, eastOpen);
                    }
                }
            }
        }

        public void playerInExplosion() {
            for (Explosion tup : explosionCoords) {
                if (collidingCircles(player, squareToPixel(tup.getColIndex()), squareToPixel(tup.getRowIndex()))) {
                    isGameOver = true;
                }
            }
        }

        public void enemyInExplosion() {
            for (Explosion tup : explosionCoords) {
                Collection<Enemy> enemiesToBeRemoved = new ArrayList<>();
                for (Enemy e : enemyList) {
                    if (collidingCircles(e, squareToPixel(tup.getColIndex()), squareToPixel(tup.getRowIndex()))) {
                        enemiesToBeRemoved.add(e);
                    }
                }
                for (Enemy e : enemiesToBeRemoved) {
                    enemyList.remove(e);
                }
            }
        }

        public void characterInExplosion() {
            playerInExplosion();
            enemyInExplosion();
        }

        private void placeBreakable() {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    double r = Math.random();
                    if (r < CHANCE_FOR_BREAKABLE_BLOCK) {
                        tiles[i][j] = FloorTile.BREAKABLEBLOCK;
                    }
                }
            }
            clearSpawn();
        }

        private void clearSpawn() {
            tiles[1][1] = FloorTile.FLOOR;
            tiles[1][2] = FloorTile.FLOOR;
            tiles[2][1] = FloorTile.FLOOR;
        }

        private void spawnPowerup(int rowIndex, int colIndex) {
            double r = Math.random();
            if (r < CHANCE_FOR_RADIUS_POWERUP) {
                powerupList.add(new BombRadiusPU(squareToPixel(rowIndex) + BombermanComponent.getSquareMiddle(), squareToPixel(colIndex) + BombermanComponent.getSquareMiddle()));
            } else if (r > CHANCE_FOR_COUNTER_POWERUP) {
                powerupList.add(new BombCounterPU(squareToPixel(rowIndex) + BombermanComponent.getSquareMiddle(), squareToPixel(colIndex) + BombermanComponent.getSquareMiddle()));
            }
        }

        private void placeUnbreakableAndGrass() {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    //Makes frame of unbreakable
                    if ((i == 0) || (j == 0) || (i == height - 1) || (j == width - 1) || i % 2 == 0 && j % 2 == 0) {
                        tiles[i][j] = FloorTile.UNBREAKABLEBLOCK;
                        //Every-other unbreakable
                    } else if (tiles[i][j] != FloorTile.BREAKABLEBLOCK) {
                        tiles[i][j] = FloorTile.FLOOR;
                    }
                }
            }
        }

        private void spawnEnemies(int nrOfEnemies) {
            for (int e = 0; e < nrOfEnemies; e++) {
                while (true) {
                    int randRowIndex = 1 + (int) (Math.random() * (height - 2));
                    int randColIndex = 1 + (int) (Math.random() * (width - 2));
                    if (getFloorTile(randRowIndex, randColIndex) != FloorTile.FLOOR) {
                        continue;
                    }
                    if (randRowIndex == 1 && randColIndex == 1 || randRowIndex == 1 && randColIndex == 2 || randRowIndex == 2 && randColIndex == 1) {
                        continue;
                    }
                    if ((randRowIndex % 2) == 0) {
                        enemyList.add(new Enemy(squareToPixel(randColIndex) + BombermanComponent.getSquareMiddle(), squareToPixel(randRowIndex) + BombermanComponent.getSquareMiddle(), true));
                    } else {
                        enemyList.add(new Enemy(squareToPixel(randColIndex) + BombermanComponent.getSquareMiddle(), squareToPixel(randRowIndex) + BombermanComponent.getSquareMiddle(), false));
                    }
                    break;
                }
            }
        }


        public boolean collisionWithEnemies() {
            for (Enemy enemy : enemyList) {
                if (collidingCircles(player, enemy.getX() - BombermanComponent.getSquareMiddle(), enemy.getY() - BombermanComponent.getSquareMiddle())) {
                    return true;
                }
            }
            return false;
        }

        public boolean collisionWithBombs(AbstractCharacter abstractCharacter) {
            boolean playerLeftBomb = true;

            for (Bomb bomb : bombList) {
                if (abstractCharacter instanceof Player) {
                    playerLeftBomb = bomb.isPlayerLeft();
                }
                if (playerLeftBomb && collidingCircles(abstractCharacter, squareToPixel(bomb.getColIndex()), squareToPixel(bomb.getRowIndex()))) {
                    return true;
                }
            }
            return false;
        }


        public boolean collisionWithBlock(AbstractCharacter abstractCharacter) {
            //Maybe create if statements to only check nearby squares
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (getFloorTile(i, j) != FloorTile.FLOOR) {
                        boolean isIntersecting = squareCircleInstersect(i, j, abstractCharacter);
                        if (isIntersecting) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public void collisionWithPowerup() {
            for (AbstractPowerup powerup : powerupList) {
                if (collidingCircles(player, powerup.getX() - BombermanComponent.getSquareMiddle(), powerup.getY() - BombermanComponent.getSquareMiddle())) {
                    powerup.addToPlayer(player);
                    powerupList.remove(powerup);
                    break;
                }
            }
        }


        public boolean squareHasBomb(int rowIndex, int colIndex) {
            for (Bomb b : bombList) {
                if (b.getRowIndex() == rowIndex && b.getColIndex() == colIndex) {
                    return true;
                }
            }
            return false;
        }


        public void checkIfPlayerLeftBomb() {
            for (Bomb bomb : bombList) {
                if (!bomb.isPlayerLeft()) {
                    if (!collidingCircles(player, squareToPixel(bomb.getColIndex()), squareToPixel(bomb.getRowIndex()))) {
                        bomb.setPlayerLeft(true);
                    }
                }
            }
        }

        private boolean bombCoordinateCheck(int eRow, int eCol, boolean open) {
            if (tiles[eRow][eCol] != FloorTile.FLOOR) {
                open = false;
            }
            if (tiles[eRow][eCol] == FloorTile.BREAKABLEBLOCK) {
                tiles[eRow][eCol] = FloorTile.FLOOR;
                spawnPowerup(eRow, eCol);
            }
            if (tiles[eRow][eCol] != FloorTile.UNBREAKABLEBLOCK) {
                explosionCoords.add(new Explosion(eRow, eCol));
            }
            return open;
        }

        private boolean collidingCircles(AbstractCharacter abstractCharacter, int x, int y) {
            int a = abstractCharacter.getX() - x - BombermanComponent.getSquareMiddle();
            int b = abstractCharacter.getY() - y - BombermanComponent.getSquareMiddle();
            int a2 = a * a;
            int b2 = b * b;
            double c = Math.sqrt(a2 + b2);
            return (abstractCharacter.getSize() > c);
        }

        private boolean squareCircleInstersect(int row, int col, AbstractCharacter abstractCharacter) {
            //http://stackoverflow.com/questions/401847/circle-rectangle-collision-detection-intersection
            int characterX = abstractCharacter.getX();
            int characterY = abstractCharacter.getY();

            int circleRadius = abstractCharacter.getSize() / 2;
            int squareSize = BombermanComponent.getSquareSize();
            int squareCenterX = (col * squareSize) + (squareSize / 2);
            int squareCenterY = (row * squareSize) + (squareSize / 2);

            int circleDistanceX = Math.abs(characterX - squareCenterX);
            int circleDistanceY = Math.abs(characterY - squareCenterY);

            if (circleDistanceX > (squareSize / 2 + circleRadius)) {
                return false;
            }
            if (circleDistanceY > (squareSize / 2 + circleRadius)) {
                return false;
            }

            if (circleDistanceX <= (squareSize / 2)) {
                return true;
            }
            if (circleDistanceY <= (squareSize / 2)) {
                return true;
            }

            int cornerDistance = (circleDistanceX - squareSize / 2) ^ 2 +
                    (circleDistanceY - squareSize / 2) ^ 2;

            return (cornerDistance <= (circleRadius ^ 2));
        }
    }

    /**
     * This class represents the explosion, or the "fireballs", that are capable of killing an Enemy or a Player,
     * as well as destroying BREAKABLEBLOCKs. It needs a row and column -index that is used for logic and painting.
     * Its duration represents how many timesteps it will exist before it is removed.
     */
    public static class Explosion {
        private int rowIndex;
        private int colIndex;
        private int duration = 5;

        public Explosion(int rowIndex, int colIndex) {
            this.rowIndex = rowIndex;
            this.colIndex = colIndex;
        }

        public int getRowIndex() {
            return rowIndex;
        }

        public int getColIndex() {
            return colIndex;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(final int duration) {
            this.duration = duration;
        }
    }

    public static final class Engine {
        private static final int TIME_STEP = 30;
        private static int width = 10;
        private static int height = 10;
        private static int nrOfEnemies = 5;
        private static Timer clockTimer = null;

        private Engine() {
        }

        public static void main(String[] args) {
            startGame();
        }

        public static void startGame() {
            Floor floor = new Floor(width, height, nrOfEnemies);
            BombermanFrame frame = new BombermanFrame("Bomberman", floor);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            floor.addFloorListener(frame.getBombermanComponent());

            Action doOneStep = new AbstractAction() {
                public void actionPerformed(ActionEvent e) {
                    tick(frame, floor);
                }
            };
            clockTimer = new Timer(TIME_STEP, doOneStep);
            clockTimer.setCoalesce(true);
            clockTimer.start();
        }

        private static void gameOver(BombermanFrame frame, Floor floor) {
            clockTimer.stop();
            frame.dispose();
            startGame();
        }

        private static void tick(BombermanFrame frame, Floor floor) {
            if (floor.getIsGameOver()) {
                gameOver(frame, floor);
            } else {
                floor.moveEnemies();
                floor.bombCountdown();
                floor.explosionHandler();
                floor.characterInExplosion();
                floor.notifyListeners();
            }
        }
    }

    public static class Enemy extends AbstractCharacter {
        private Move currentDirection;

        public Enemy(int x, int y, boolean vertical) {
            super(x, y, 1);
            currentDirection = randomDirection(vertical);
        }

        public void changeDirection() {
            if (currentDirection == Move.DOWN) {
                currentDirection = Move.UP;
            } else if (currentDirection == Move.UP) {
                currentDirection = Move.DOWN;
            } else if (currentDirection == Move.LEFT) {
                currentDirection = Move.RIGHT;
            } else {
                currentDirection = Move.LEFT;
            }
        }

        public Move getCurrentDirection() {
            return currentDirection;
        }

        private Move randomDirection(boolean vertical) {
            assert Move.values().length == 4;
            int pick = (int) (Math.random() * (Move.values().length - 2));
            if (vertical) {
                return Move.values()[pick];
            } else {
                return Move.values()[pick + 2];
            }

        }
    }

    /**
     * This class extends AbstractPowerup and receives fundamental methods such as getters for its coordinates and size. This class
     * has an addToPlayer-method which adjusts the bombRadius of the player.
     */
    public static class BombRadiusPU extends AbstractPowerup {

        public BombRadiusPU(int rowIndex, int colIndex) {
            super(colIndex, rowIndex);
        }

        public void addToPlayer(Player player) {
            int currentExplosionRadius = player.getExplosionRadius();
            player.setExplosionRadius(currentExplosionRadius + 1);
        }

        public String getName() {
            final String name = "BombRadius";
            return name;
        }
    }


    public static class BombermanFrame extends JFrame {
        private Floor floor;
        private BombermanComponent bombermanComponent;

        public BombermanFrame(final String title, Floor floor) throws HeadlessException {
            super(title);
            this.floor = floor;
            this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            bombermanComponent = new BombermanComponent(floor);
            floor.createPlayer(bombermanComponent, floor);
            setKeyStrokes();

            this.setLayout(new BorderLayout());
            this.add(bombermanComponent, BorderLayout.CENTER);
            this.pack();
            this.setVisible(true);
        }

        public BombermanComponent getBombermanComponent() {
            return bombermanComponent;
        }

        private boolean askUser(String question) {
            return JOptionPane.showConfirmDialog(null, question, "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        }

        private void setKeyStrokes() {

            KeyStroke stroke = KeyStroke.getKeyStroke(KeyEvent.VK_W, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());
            bombermanComponent.getInputMap().put(stroke, "q");
            bombermanComponent.getActionMap().put("q", quit);
        }

        private final Action quit = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                dispose();

            }
        };
    }


    public static class BombermanComponent extends JComponent implements FloorListener {
        // Constants are static by definition.
        private final static int SQUARE_SIZE = 40;
        private final static int CHARACTER_ADJUSTMENT_FOR_PAINT = 15;
        private final static int SQUARE_MIDDLE = SQUARE_SIZE / 2;
        private final static int BOMB_ADJUSTMENT_1 = 5;
        private final static int BOMB_ADJUSTMENT_2 = 10;
        // Defining painting parameters
        private final static int PAINT_PARAMETER_13 = 13;
        private final static int PAINT_PARAMETER_15 = 15;
        private final static int PAINT_PARAMETER_17 = 17;
        private final static int PAINT_PARAMETER_18 = 18;
        private final static int PAINT_PARAMETER_19 = 19;
        private final static int PAINT_PARAMETER_20 = 20;
        private final static int PAINT_PARAMETER_24 = 24;
        private final Floor floor;
        private final AbstractMap<FloorTile, Color> colorMap;

        public BombermanComponent(Floor floor) {
            this.floor = floor;

            colorMap = new EnumMap<>(FloorTile.class);
            colorMap.put(FloorTile.FLOOR, Color.GREEN);
            colorMap.put(FloorTile.UNBREAKABLEBLOCK, Color.BLACK);
            colorMap.put(FloorTile.BREAKABLEBLOCK, Color.RED);
        }

        // This method is static since each square has the same size.
        public static int getSquareSize() {
            return SQUARE_SIZE;
        }

        // This method is static since each square has the same size.
        public static int getSquareMiddle() {
            return SQUARE_MIDDLE;
        }

        public Dimension getPreferredSize() {
            super.getPreferredSize();
            return new Dimension(this.floor.getWidth() * SQUARE_SIZE, this.floor.getHeight() * SQUARE_SIZE);
        }

        public void floorChanged() {
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            final Graphics2D g2d = (Graphics2D) g;

            for (int rowIndex = 0; rowIndex < floor.getHeight(); rowIndex++) {
                for (int colIndex = 0; colIndex < floor.getWidth(); colIndex++) {
                    g2d.setColor(colorMap.get(this.floor.getFloorTile(rowIndex, colIndex)));
                    if (floor.getFloorTile(rowIndex, colIndex) == FloorTile.BREAKABLEBLOCK) {
                        paintBreakableBlock(rowIndex, colIndex, g2d);
                    } else if (floor.getFloorTile(rowIndex, colIndex) == FloorTile.UNBREAKABLEBLOCK) {
                        paintUnbreakableBlock(rowIndex, colIndex, g2d);
                    } else {
                        paintFloor(rowIndex, colIndex, g2d);
                    }
                }
            }
            // Paint player:
            paintPlayer(floor.getPlayer(), g2d);

            //Paint enemies
            for (Enemy e : floor.getEnemyList()) {
                paintEnemy(e, g2d);
            }

            //Paint powerups
            for (AbstractPowerup p : floor.getPowerupList()) {
                if (p.getName().equals("BombCounter")) {
                    g2d.setColor(Color.BLACK);
                } else if (p.getName().equals("BombRadius")) {
                    g2d.setColor(Color.RED);
                }
                g2d.fillOval(p.getX() - CHARACTER_ADJUSTMENT_FOR_PAINT, p.getY() - CHARACTER_ADJUSTMENT_FOR_PAINT, p.getPowerupSize(), p.getPowerupSize());
            }

            //Paint bombs
            for (Bomb b : floor.getBombList()) {
                g2d.setColor(Color.RED);
                int bombX = floor.squareToPixel(b.getColIndex());
                int bombY = floor.squareToPixel(b.getRowIndex());
                g2d.fillOval(bombX + BOMB_ADJUSTMENT_1, bombY + BOMB_ADJUSTMENT_1, Bomb.getBOMBSIZE(), Bomb.getBOMBSIZE());
                g2d.setColor(Color.ORANGE);
                g2d.fillOval(bombX + BOMB_ADJUSTMENT_2, bombY + BOMB_ADJUSTMENT_1, BOMB_ADJUSTMENT_1, BOMB_ADJUSTMENT_2);
            }

            //Paint explosions
            g2d.setColor(Color.ORANGE);
            for (Explosion tup : floor.getExplosionCoords()) {
                g2d.fillOval(floor.squareToPixel(tup.getColIndex()) + BOMB_ADJUSTMENT_1, floor.squareToPixel(tup.getRowIndex()) +
                        BOMB_ADJUSTMENT_1, Bomb.getBOMBSIZE(), Bomb.getBOMBSIZE());
            }
        }

        private void paintBreakableBlock(int rowIndex, int colIndex, Graphics g2d) {
            g2d.setColor(Color.lightGray);
            g2d.fillRect(colIndex * SQUARE_SIZE, rowIndex * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
            g2d.setColor(Color.BLUE);
            g2d.drawLine(colIndex * SQUARE_SIZE + 1, rowIndex * SQUARE_SIZE + 10, colIndex * SQUARE_SIZE + SQUARE_SIZE, rowIndex * SQUARE_SIZE + 10);
            g2d.drawLine(colIndex * SQUARE_SIZE + 1, rowIndex * SQUARE_SIZE + SQUARE_MIDDLE, colIndex * SQUARE_SIZE + SQUARE_SIZE, rowIndex * SQUARE_SIZE + SQUARE_MIDDLE);
            g2d.drawLine(colIndex * SQUARE_SIZE + 1, rowIndex * SQUARE_SIZE + SQUARE_MIDDLE + 10, colIndex * SQUARE_SIZE + SQUARE_SIZE, rowIndex * SQUARE_SIZE + SQUARE_MIDDLE + 10);
            g2d.drawLine(colIndex * SQUARE_SIZE + 1, rowIndex * SQUARE_SIZE + SQUARE_SIZE, colIndex * SQUARE_SIZE + SQUARE_SIZE, rowIndex * SQUARE_SIZE + SQUARE_SIZE);

            g2d.drawLine(colIndex * SQUARE_SIZE + 10, rowIndex * SQUARE_SIZE + 1, colIndex * SQUARE_SIZE + 10, rowIndex * SQUARE_SIZE + 10);
            g2d.drawLine(colIndex * SQUARE_SIZE + SQUARE_MIDDLE + 10, rowIndex * SQUARE_SIZE + 1, colIndex * SQUARE_SIZE + SQUARE_MIDDLE + 10, rowIndex * SQUARE_SIZE + 10);

            g2d.drawLine(colIndex * SQUARE_SIZE + 1, rowIndex * SQUARE_SIZE + 10, colIndex * SQUARE_SIZE + 1, rowIndex * SQUARE_SIZE + SQUARE_MIDDLE);
            g2d.drawLine(colIndex * SQUARE_SIZE + SQUARE_MIDDLE + 1, rowIndex * SQUARE_SIZE + 10, colIndex * SQUARE_SIZE + SQUARE_MIDDLE + 1, rowIndex * SQUARE_SIZE + SQUARE_MIDDLE);

            g2d.drawLine(colIndex * SQUARE_SIZE + 10, rowIndex * SQUARE_SIZE + 1 + SQUARE_MIDDLE, colIndex * SQUARE_SIZE + 10, rowIndex * SQUARE_SIZE + SQUARE_MIDDLE + 10);
            g2d.drawLine(colIndex * SQUARE_SIZE + SQUARE_MIDDLE + 10, rowIndex * SQUARE_SIZE + 1 + SQUARE_MIDDLE, colIndex * SQUARE_SIZE + SQUARE_MIDDLE + 10, rowIndex * SQUARE_SIZE + SQUARE_MIDDLE + 10);

            g2d.drawLine(colIndex * SQUARE_SIZE + 1, rowIndex * SQUARE_SIZE + SQUARE_MIDDLE + 10, colIndex * SQUARE_SIZE + 1, rowIndex * SQUARE_SIZE + SQUARE_SIZE);
            g2d.drawLine(colIndex * SQUARE_SIZE + SQUARE_MIDDLE + 1, rowIndex * SQUARE_SIZE + SQUARE_MIDDLE + 10, colIndex * SQUARE_SIZE + SQUARE_MIDDLE + 1, rowIndex * SQUARE_SIZE + SQUARE_SIZE);
        }

        private void paintUnbreakableBlock(int rowIndex, int colIndex, Graphics g2d) {
            g2d.fillRect(colIndex * SQUARE_SIZE, rowIndex * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
            g2d.setColor(Color.DARK_GRAY);
            g2d.drawLine(colIndex * SQUARE_SIZE, rowIndex * SQUARE_SIZE, colIndex * SQUARE_SIZE + SQUARE_SIZE, rowIndex * SQUARE_SIZE);
            g2d.drawLine(colIndex * SQUARE_SIZE, rowIndex * SQUARE_SIZE + SQUARE_SIZE, colIndex * SQUARE_SIZE + SQUARE_SIZE, rowIndex * SQUARE_SIZE + SQUARE_SIZE);
            g2d.drawLine(colIndex * SQUARE_SIZE, rowIndex * SQUARE_SIZE, colIndex * SQUARE_SIZE, rowIndex * SQUARE_SIZE + SQUARE_SIZE);
            g2d.drawLine(colIndex * SQUARE_SIZE + SQUARE_SIZE, rowIndex * SQUARE_SIZE, colIndex * SQUARE_SIZE + SQUARE_SIZE, rowIndex * SQUARE_SIZE + SQUARE_SIZE);
        }

        private void paintFloor(int rowIndex, int colIndex, Graphics g2d) {
            g2d.setColor(Color.white);
            g2d.fillRect(colIndex * SQUARE_SIZE, rowIndex * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
            g2d.setColor(Color.CYAN);
            g2d.drawLine(colIndex * SQUARE_SIZE + 5, rowIndex * SQUARE_SIZE + 10, colIndex * SQUARE_SIZE + 10, rowIndex * SQUARE_SIZE + 5);
            g2d.drawLine(colIndex * SQUARE_SIZE + 5, rowIndex * SQUARE_SIZE + SQUARE_MIDDLE, colIndex * SQUARE_SIZE + SQUARE_MIDDLE, rowIndex * SQUARE_SIZE + 5);
            g2d.drawLine(colIndex * SQUARE_SIZE + 5, rowIndex * SQUARE_SIZE + SQUARE_MIDDLE + 10, colIndex * SQUARE_SIZE + SQUARE_MIDDLE + 10, rowIndex * SQUARE_SIZE + 5);
        }

        private void paintEnemy(Enemy e, Graphics g2d) {
            // Paint body
            g2d.setColor(Color.orange);
            g2d.fillOval(e.getX() - CHARACTER_ADJUSTMENT_FOR_PAINT, e.getY() - CHARACTER_ADJUSTMENT_FOR_PAINT, e.getSize(), e.getSize());
            // Paint brows
            g2d.setColor(Color.BLACK);
            // Paint eyes
            g2d.fillOval(e.getX() - CHARACTER_ADJUSTMENT_FOR_PAINT + 4, e.getY() - CHARACTER_ADJUSTMENT_FOR_PAINT + 9, 7, 7);
            g2d.fillOval(e.getX() - CHARACTER_ADJUSTMENT_FOR_PAINT + PAINT_PARAMETER_19, e.getY() - CHARACTER_ADJUSTMENT_FOR_PAINT + 9, 7, 7);
            // Paint mouth
            g2d.fillOval(e.getX() - CHARACTER_ADJUSTMENT_FOR_PAINT + 5, e.getY() - CHARACTER_ADJUSTMENT_FOR_PAINT + PAINT_PARAMETER_20, PAINT_PARAMETER_20, 2);
            // Fill eyes
            g2d.setColor(Color.RED);
            g2d.fillOval(e.getX() - CHARACTER_ADJUSTMENT_FOR_PAINT + 5, e.getY() - CHARACTER_ADJUSTMENT_FOR_PAINT + 10, 5, 5);
            g2d.fillOval(e.getX() - CHARACTER_ADJUSTMENT_FOR_PAINT + PAINT_PARAMETER_20, e.getY() - CHARACTER_ADJUSTMENT_FOR_PAINT + 10, 5, 5);

        }

        private void paintPlayer(Player player, Graphics g2d) {
            // Paint hat
            g2d.setColor(Color.BLUE);
            g2d.fillOval(player.getX() - CHARACTER_ADJUSTMENT_FOR_PAINT + PAINT_PARAMETER_15, player.getY() - CHARACTER_ADJUSTMENT_FOR_PAINT - 2, PAINT_PARAMETER_15, PAINT_PARAMETER_15);
            // Paint body
            g2d.setColor(Color.LIGHT_GRAY);
            g2d.fillOval(player.getX() - CHARACTER_ADJUSTMENT_FOR_PAINT, player.getY() - CHARACTER_ADJUSTMENT_FOR_PAINT, player.getSize(), player.getSize());
            // Paint face
            g2d.setColor(Color.PINK);
            g2d.fillOval(player.getX() - CHARACTER_ADJUSTMENT_FOR_PAINT + 3, player.getY() - CHARACTER_ADJUSTMENT_FOR_PAINT + 3, player.getSize() - 6, player.getSize() - 6);
            // Paint eyes
            g2d.setColor(Color.BLACK);
            g2d.drawLine(player.getX() - CHARACTER_ADJUSTMENT_FOR_PAINT + 10, player.getY() - CHARACTER_ADJUSTMENT_FOR_PAINT + 10, player.getX() - CHARACTER_ADJUSTMENT_FOR_PAINT + 10, player.getY() - CHARACTER_ADJUSTMENT_FOR_PAINT + PAINT_PARAMETER_18);
            g2d.drawLine(player.getX() - CHARACTER_ADJUSTMENT_FOR_PAINT + PAINT_PARAMETER_20, player.getY() - CHARACTER_ADJUSTMENT_FOR_PAINT + 10, player.getX() - CHARACTER_ADJUSTMENT_FOR_PAINT + PAINT_PARAMETER_20, player.getY() - CHARACTER_ADJUSTMENT_FOR_PAINT + PAINT_PARAMETER_18);
        }
    }

    /**
     * This class extends AbstractPowerup and receives fundamental methods such as getters for its coordinates and size. This class
     * has an addToPlayer-method which adjusts the bombCount of the player.
     */
    public static class BombCounterPU extends AbstractPowerup {

        public BombCounterPU(int rowIndex, int colIndex) {
            super(colIndex, rowIndex);
        }

        public void addToPlayer(Player player) {
            int currentBombCount = player.getBombCount();
            player.setBombCount(currentBombCount + 1);
        }

        public String getName() {
            final String name = "BombCounter";
            return name;
        }
    }

    public static class Bomb {
        // Constants are static by definition.
        private final static int BOMBSIZE = 30;
        private final static int STARTCOUNTDOWN = 100;
        private int timeToExplosion = STARTCOUNTDOWN;
        private final int rowIndex;
        private final int colIndex;
        private int explosionRadius;
        private boolean playerLeft;

        public Bomb(final int rowIndex, final int colIndex, int explosionRadius) {
            this.rowIndex = rowIndex;
            this.colIndex = colIndex;
            this.explosionRadius = explosionRadius;
            playerLeft = false;
        }

        public int getRowIndex() {
            return rowIndex;
        }

        public int getColIndex() {
            return colIndex;
        }

        // This method is static since every bomb has the same size.
        public static int getBOMBSIZE() {
            return BOMBSIZE;
        }

        public int getTimeToExplosion() {
            return timeToExplosion;
        }

        public void setTimeToExplosion(final int timeToExplosion) {
            this.timeToExplosion = timeToExplosion;
        }

        public int getExplosionRadius() {
            return explosionRadius;
        }

        public boolean isPlayerLeft() {
            return playerLeft;
        }

        public void setPlayerLeft(final boolean playerLeft) {
            this.playerLeft = playerLeft;
        }
    }

    /**
     * This class is the basis for powerups, and the contents are shared between the different types of powerups that extends
     * AbstractPowerup. The classes that extend this class is BombCounterPU and BombRadiusPU. The constructor needs an x and y
     * coordinate that will be the placement for the powerup.
     */
    public static class AbstractPowerup {
        // Constants are static by definition.
        private final static int POWERUP_SIZE = 30;
        private final int x;
        private final int y;
        private String name = null;

        public AbstractPowerup(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void addToPlayer(Player player) {
        }

        public int getPowerupSize() {
            return POWERUP_SIZE;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public String getName() {
            return name;
        }
    }

    public static class Player extends AbstractCharacter {

        private final static int PLAYER_START_X = 60;
        private final static int PLAYER_START_Y = 60;
        private final static int PLAYER_PIXELS_BY_STEP = 4;
        private int explosionRadius;
        private int bombCount;
        private Floor floor;

        public Action up = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                movePlayer(Move.UP);

            }
        };

        public Action right = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                movePlayer(Move.RIGHT);

            }
        };

        public Action down = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                movePlayer(Move.DOWN);

            }
        };

        public Action left = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                movePlayer(Move.LEFT);

            }
        };


        public Action dropBomb = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                if (!floor.squareHasBomb(getRowIndex(), getColIndex()) && floor.getBombListSize() < getBombCount()) {
                    floor.addToBombList(new Bomb(getRowIndex(), getColIndex(), getExplosionRadius()));
                }
                floor.notifyListeners();
            }
        };

        public Player(BombermanComponent bombermanComponent, Floor floor) {
            super(PLAYER_START_X, PLAYER_START_Y, PLAYER_PIXELS_BY_STEP);
            explosionRadius = 1;
            bombCount = 1;
            this.floor = floor;
            setPlayerButtons(bombermanComponent);
        }

        public void setPlayerButtons(BombermanComponent bombermanComponent) {
            bombermanComponent.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "moveRight");
            bombermanComponent.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "moveLeft");
            bombermanComponent.getInputMap().put(KeyStroke.getKeyStroke("UP"), "moveUp");
            bombermanComponent.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "moveDown");
            bombermanComponent.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "dropBomb");
            bombermanComponent.getActionMap().put("moveRight", right);
            bombermanComponent.getActionMap().put("moveLeft", left);
            bombermanComponent.getActionMap().put("moveUp", up);
            bombermanComponent.getActionMap().put("moveDown", down);
            bombermanComponent.getActionMap().put("dropBomb", dropBomb);
        }

        public int getBombCount() {
            return bombCount;
        }

        public void setBombCount(int bombCount) {
            this.bombCount = bombCount;
        }

        public int getExplosionRadius() {
            return explosionRadius;
        }

        public void setExplosionRadius(int explosionRadius) {
            this.explosionRadius = explosionRadius;
        }

        private void movePlayer(Move move) {
            moveCharacter(move);
            if (floor.collisionWithBlock(this)) {
                moveBack(move);
            }
            if (floor.collisionWithBombs(this)) {
                moveBack(move);
            }
            if (floor.collisionWithEnemies()) {
                floor.setIsGameOver(true);
            }

            floor.checkIfPlayerLeftBomb();
            floor.collisionWithPowerup();
            floor.notifyListeners();
        }

    }


}