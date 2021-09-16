import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        // SEPARATOR
        String SEPARATOR = "------------------------------";

        /*
        for(initialization, condition, operation){
            // instructions (statements)
        }
         */

        // FOR(COUNTER_IS_SMALLER_THAN_5)
        for (int counter = 0; counter < 5; counter++) {
            // PRINT -> COUNTER
            System.out.println("Counter is now " + counter);
        }

        /*
        initialization
        while(condition){
            // instructions (statements)
            operation
        }
         */

        System.out.println(SEPARATOR);

        // WHILE(COUNTER_IS_SMALLER_THAN_5)
        int counter = 0;
        while (counter < 5) {
            // PRINT -> COUNTER
            System.out.println("Counter is now " + counter);
            counter++;
        }

        System.out.println(SEPARATOR);

        // WHILE(USER_INPUT_IS_NOT_10)
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;
        while (condition) {

            // PRINT
            System.out.println("Please enter a number: ");

            // INPUT(NUMBER)
            int number = scanner.nextInt();

            // IF(NUMBER_IS_10)
            if(number == 10) {
                condition = false;
            }

            // PRINT -> "It is not 10, please type 10, I am obsessed with 10"
            System.out.println("Number you entered is " + number);
            // System.out.println("It is not 10, please type 10, I am obsessed with 10");
        }

    }

}
