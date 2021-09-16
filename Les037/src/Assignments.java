
public class Assignments {
    public static void main(String[] args) {

        /*  OP01/Create an array of 10 numbers by your choice.
            OP02/Create an array of 20 scientist,
                Assign the index 5 of the array to "Nikola Tesla"
                Assign the 20th element of the array to "Thomas Edison"

         */
        //ARRAY
        // DECLARE AND INSTANTIATE AN ARRAY
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;

        //PRINT
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);
        System.out.println(numbers[6]);
        System.out.println(numbers[7]);
        System.out.println(numbers[8]);
        System.out.println(numbers[9]);
        System.out.println("***************************");
        String[] leds = new String[3];
        leds[0] = "0x123131xx21";
        leds[1] = "21x121231xx21";
        leds[2] = "51231x31xx21";

        String led1 = leds[0];
        System.out.println(led1);
    }
}




