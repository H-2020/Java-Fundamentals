import java.util.Random;
import java.util.Scanner;

public class HigherLower {

    public static void main(String[] args) {

        // PRINT -> WELCOME
        System.out.println("Welcome to Higher Lower App..");

        // CREATE_SCANNER
        Scanner scanner = new Scanner(System.in);

        // GENERATE_A_RANDOM_NUMBER
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        //INPUT boolean
        boolean doesNotMatch = true;

        //WHILE
        while(doesNotMatch){
            //PRINT
            System.out.println("Guess the number:");
            // INPUT(GUESSED_NUMBER)
            int guessedNumber = scanner.nextInt();

            // IF(GUESSED_NUMBER_IS_SMALLER_THAN_RANDOM_NUMBER)
            if(guessedNumber < randomNumber) {
                System.out.println("Higher");
            }

            // ELSE IF(GUESSED_NUMBER_IS_GREATER_THAN_RANDOM_NUMBER)
            else if(guessedNumber >randomNumber) {
                System.out.println("Lower");
            }

            // ELSE (GUESSED_NUMBER_IS_EQUAL_TO_RANDOM_NUMBER)
            else {
                System.out.println("Congrats!");
                doesNotMatch = false;
            }

        }

        // PRINT
        System.out.println("Thank you for choosing our app..");

    }
}
