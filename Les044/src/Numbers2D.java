public class Numbers2D {

    public static void main(String[] args) {

        // CREATE_2D_ARRAY
        int[][] numbers2D = {
                {3, 6, 7, 8},
                {2, 1},
                {8, 0, 5, 4, 2},
                {4, 6, 9}
        };



        /*
        // add another sub element of array with 99 elements
        int[][] empty2D = {
                {0, 0, 0, 0, 0, 0},
                {0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
         */

        int[] numbers1 = new int[6];
        int[] numbers2 = new int[2];
        int[] numbers3 = new int[4];
        int[] numbers4 = new int[8];
        int[] numbers5 = new int[99];

        String SEPARATOR = "------------------------------------------";

        System.out.println(SEPARATOR);

        int[][] empty2D = {
                numbers1, numbers2, numbers3, numbers4, numbers5
        };


        /*
        int[] numbers1D = new int[50];

        // FOR(NUMBERS_LENGTH)
        for (int index = 0; index < numbers1D.length; index++) {
            numbers1D[index] = 100;
            System.out.println(numbers1D[index]);
        }
         */

        System.out.println(SEPARATOR);

        System.out.println("The length of each array in the 2D array");

        int lengthOfIndex0Array = empty2D[0].length;
        int lengthOfIndex1Array = empty2D[1].length;
        int lengthOfIndex2Array = empty2D[2].length;
        int lengthOfIndex3Array = empty2D[3].length;
        int lengthOfIndex4Array = empty2D[4].length;


        System.out.println(lengthOfIndex0Array);
        System.out.println(lengthOfIndex1Array);
        System.out.println(lengthOfIndex2Array);
        System.out.println(lengthOfIndex3Array);
        System.out.println(lengthOfIndex4Array);

        System.out.println(SEPARATOR);

        // OUTER_FOR(NUMBERS_2D_LENGTH)
        for (int outerIndex = 0; outerIndex < empty2D.length; outerIndex++) {

            System.out.println("Outer index is " + outerIndex);

            // INNER_FOR(NUMBERS_2D_ARRAY_ELEMENT_LENGTH)
            for (int innerIndex = 0; innerIndex < empty2D[outerIndex].length; innerIndex++) {
                empty2D[outerIndex][innerIndex] = 100;
                System.out.println(empty2D[outerIndex][innerIndex]);
            }

        }

        // 1st ARRAY -> 1st element
        System.out.println(empty2D[0][0]);
        System.out.println(empty2D[0][1]);
        System.out.println(empty2D[0][2]);

        System.out.println(empty2D[1][1]);
        System.out.println(empty2D[2][1]);
        System.out.println(empty2D[3][1]);
        System.out.println(empty2D[4][1]);


    }

}

