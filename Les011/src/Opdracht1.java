import java.util.Scanner;

public class Opdracht1 {
        public static void main(String[] args) {

            //PRINT(HELLO_MESSAGE)
            System.out.println("Welcome to age calculator");

            //system in
            Scanner scanner =  new Scanner(System.in);


            //TYPE(YEAR_OF_BIRTH): Read de keyboard input
            System.out.println("Please enter the year of birth");
            //keyboard.nextInt()/keyboard.nextDouble()/keyboard.nextLine()/keyboard.net()

            int yearOfBirth = scanner.nextInt();
            //System.out.println("Searching " + yearOfBirth);

            //TYPE(YEAR-OF-NOW):Read the keyboard input
            System.out.println("Please enter the year of now");
            int yearOfNow = scanner.nextInt();
            //System.out.println("Searching " + yearOfNow);


            //CALCULATE_AGE()
            int realage = yearOfNow - yearOfBirth;
            int soulage = yearOfNow - yearOfBirth - 10 ;


            //PRINT(AGE)
            System.out.println("your real age is " + realage );
            System.out.println("your soulage is " + soulage );

            //memory for output messages
            //System.out.flush();

            System.out.println("Thank you for using");
        }

    
}
