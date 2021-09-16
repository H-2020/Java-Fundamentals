public class Opdracht1 {

    public static void main(String[] args) {

        int[] numbers1D=new int[5];
        for(int index=0;index< numbers1D.length;index++){
            numbers1D[index]=1;
            System.out.println(numbers1D[index]);
        }

        int[] numbers1= new int[6];
        int[] numbers2= new int[2];
        int[] numbers3= new int[4];
        int[] numbers4= new int[8];
        int[] numbers5= new int[99];
        int[][] empty2D= {
                numbers1,numbers2,numbers3,numbers4,numbers5
        };

        System.out.println(empty2D.length);

        for(int index=0;index< empty2D.length;index++){
            for(int innerIndex=0;innerIndex< empty2D[index].length;innerIndex++){
                empty2D[index][innerIndex]=200;
                int empty=empty2D[index][innerIndex];
                System.out.println(empty);
            }

        }

    }
}
