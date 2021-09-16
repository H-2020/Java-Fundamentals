import java.util.Scanner;

    public class Opdracht2 {

    public static void main(String[] args) {
            //PRINT
        System.out.println("Welcome to the Number Guesser app:");

        Scanner scanner = new Scanner(System.in);
        int pin = 12345;
        for (int i = 0; i < 3; i = i + 1) {
            //PRINT
            System.out.println("Please enter pin: ");
            //INPUT
            int nieuw_pin = scanner.nextInt();
            boolean condition = nieuw_pin == pin;
            boolean condition2 = (i == 2);
            if (condition) {
                System.out.println("Correct, welcome back.");
                break;
            }
            else if (condition2) {
                System.out.println("Sorry but you have been locked out.");
            }
            else{
                System.out.println("Incorrect, try again.");
            }
        }
            //PRINT
            System.out.println("Thank you for choosing our app..");
    }
}