import java.time.Year;
import java.util.Scanner;

public class WhileLoop {

    /*
        OP01: Print all even numbers from 1 to 100 using a WHILE LOOP
        OP02: [ ] Calculate your Martian age.
              [ ] Make sure the user enters a year between 1900 and the year of now
                  If the user enters another number, the system needs to keep asking a correct input
                  until the input is valid.
            Expected Input:
                Welcome
                - Year of birth:
            Expected output:
                Your Martian age is: ____
                Goodbye
    */

    public static void main(String[] args) {

        // PRINT -> "Welcome"
        System.out.println("Welcome to even numbers printer");

        // WHILE(100)
        int counter = 0;
        while (counter < 100) {

            // INCREMENT -> +2
            counter += 2;

            // PRINT -> "The even number is" + counter
            System.out.println("The even number is " + counter);
        }

        // PRINT -> "Goodbye"
        System.out.println("Goodbye from even numbers printer");

        String SEPARATOR = "\n-------------------------------------------------\n";

        System.out.println(SEPARATOR);

        // PRINT -> "Welcome"
        System.out.println("Welcome to Martian age calculator");

        // PRINT
        System.out.println("Enter the Earth year of birth: ");

        // CREATE -> Scanner
        Scanner scanner = new Scanner(System.in);

        /*
        int earthYearOfBirth = 0;
        // WHILE(USER_INPUT_IS_INVALID)
        while (true) {
            // INPUT(EARTH_YEAR_OF_BIRTH)
            earthYearOfBirth = scanner.nextInt();

            // IF(EARTH_YEAR_OF_BIRTH_IS_BETWEEN_1900_AND_NOW)
            int yearOfNow = Year.now().getValue();
            if (earthYearOfBirth > 1900 && earthYearOfBirth < yearOfNow) {
                break;
            }
        }
        */

        /*
        // WHILE(USER_INPUT_IS_INVALID)
        boolean isUserInputInvalid2 = true;
        while (isUserInputInvalid2){
            // INPUT(EARTH_YEAR_OF_BIRTH)
            int earthYearOfBirth2 = scanner.nextInt();
            int yearOfNow2 = Year.now().getValue();
            if(earthYearOfBirth2 > 1900 && earthYearOfBirth2 < yearOfNow2){
                isUserInputInvalid2 = false;
            }

        }
        */

        // CALCULATE -> AGE

        int earthYearOfBirth = scanner.nextInt();
        do {
            // IT WILL BE AT LEAST ONE TIME INSTRUCTED..
            System.out.println("User input is " + earthYearOfBirth);

        }while (!(earthYearOfBirth > 1900 && earthYearOfBirth < Year.now().getValue()));


        /*
        // PRINT -> Earth years
        System.out.println("You Earth age in years: " + earthAgeInYears);

        // CALCULATE_EARTH_DAYS
        double earthAgeInDays = earthAgeInYears * 365.25;

        // PRINT -> Earth days
        System.out.println("Your Earth age in days: " + earthAgeInDays);

        // CALCULATE_MARTIAN_DAYS
        double martianAgeInDays = earthAgeInDays / 1.027;

        // PRINT -> Martian days
        System.out.println("Your Martian age in days: " + martianAgeInDays);

        // CALCULATE_MARTIAN_YEAR
        double martianAgeInYears = martianAgeInDays / 668.599;
        long martianAgeInYearsRounded = Math.round(martianAgeInYears);

        // PRINT -> Martian years
        System.out.println("Your martian age in years: " + martianAgeInYears);
        System.out.println("Your martian age in years rounded: " + martianAgeInYearsRounded);

        */

        // PRINT -> "Goodbye"
        System.out.println("Goodbye from the martian age calculator");


    }
}
