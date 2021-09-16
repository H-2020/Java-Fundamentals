public class OpdrachtArrays {

    public static void main(String[] args) {

        int[] numbers={
                7,14,21,28,35,
                42,49,56,63,70,
                77,84,91,98,105,
                112,119,126,133,140
        };

        for(int index=0; index< numbers.length;index++) {
            System.out.println(numbers[index]);
        };

        System.out.println("******************************");

        int lengthIndex=numbers.length-1;
        for(int index=lengthIndex; index>=0;index--) {
            System.out.println(numbers[index]);
        };

        System.out.println("****************************");

        boolean[] booleanWords= {
                false,true,true,true,false
        };
        for(int index=0; index< booleanWords.length;index++) {
            System.out.println(booleanWords[index]);
        };
        System.out.println("**********************************");

        int[] numbersDivision={
                2,3,5,7
        };
        /*for(int index=0; index< numbers.length;index++) {
                if(numbers[index]=){
                int[] priemGetallen= new int[5];
                for(int index2=0; index< priemGetallen.length;index2++)
                priemGetallen[index2]=numbers[index];
                System.out.println(priemGetallen[index2]);
            }

        };*/

        int[] priemGetallen= {
                2,3,5,7
        };
        for (int outerIndex = 0; outerIndex < numbers.length; outerIndex++) {

            // FOR_INNER(OFFENSIVE_WORDS_LENGTH)
            for (int innerIndex = 0; innerIndex < priemGetallen.length; innerIndex++) {

                // IF(JOKE_CONTAINS_AN_OFFENSIVE_WORD)
                if (numbers[outerIndex]%(priemGetallen[innerIndex])==0) {


                }
                else{
                    System.out.println(numbers[outerIndex]);
                }

            }

        }
        /*int i=0;
        for(int index=0; index< numbers.length;index++) {
            i=i+7;
            System.out.println(i);
        };*/

    }
}
