public class herhal {

    public static void main(String[] args) {

        int[][] table=new int[4][6];
        char[] characters = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G'
        };

        System.out.print(" "+"|  ");
        for(int index=0;index< 6;index++){
            System.out.print(characters[index]+ " | ");
        }
        System.out.println();

        for(int row=0;row< table.length;row++){

            System.out.print((row+1)+" | ");

            for(int colom=0;colom<table[row].length;colom++){
                int mul=(row+1)*(colom+1);

                if (mul < 10) {
                    System.out.print(" " + "0" + mul + " |");
                } else {
                    System.out.print(" " + mul + " |");
                }

            }
            System.out.println();
        }



    }
}
