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


    }
}
