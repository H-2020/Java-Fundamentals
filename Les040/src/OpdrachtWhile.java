import java.util.Scanner;

public class OpdrachtWhile {
    public static void main(String[] args) {
        // WHILE(TRUE)
        // IF(SCANNER_HAS_NO_INPUT)
        // BREAK;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your full name:");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("exit") || input.isEmpty()) {
                break;
            } else {
                // ALL OTHER STATEMENT TO CONTINUE WILL BE RUN HERE...
                System.out.println("Your name: " + input);
            }
        }
        // +18
        System.out.println("Please enter the year of birth: ");
        while (true) {
            int number = scanner.nextInt();

            if (number == -1 || number > 999) {
                break;
            } else {
                System.out.println("Number is " + number);
            }
        }
        // SCANNER_PROBLEM_SOLUTION
        scanner.nextLine();

        System.out.println("Are you sure? (y/n): ");
        while (true) {
            char c = scanner.nextLine().charAt(0);

            if (c == 'y') {
                System.out.println("You have chosen yes");
            } else if (c == 'n') {
                System.out.println("You have chosen no");
            } else {
                System.out.println("You have NOT chosen a valid option");
            }
        }
    }
}
