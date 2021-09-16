import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {

        // PRINT()
        System.out.println("Welcome to Kalka");
        // PRINT()
        System.out.println("Please choose the first number:");
        // READ(NUMBER)
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        // PRINT() > "Please enter the operation: + - / x"
        System.out.println("Please choose the operation");
        // READ(OPERATION)
        char operation = scanner.next().charAt(0);
        // PRINT()
        System.out.println("The operation is " + operation + ".");
        System.out.println("Please enter the second number: ");
        // READ(NUMBER)
        double number2 = scanner.nextDouble();
        // CALCULATE()
        double sum = number1 + number2;
        double extraction = number1 - number2;
        double multiply = number1 * number2;
        double division = number1 / number2;
        // PRINT()
        System.out.println("Sum of " + number1 + " and " + number2 + " is " + sum);
        System.out.println("Extraction of " + number1 + " from " + number2 + " is " + extraction);
        System.out.println("Multiplication of " + number1 + " with " + number2 + " is " + multiply);
        System.out.println("Division of " + number1 + " to " + number2 + " is " + division);
        // IF OPERATION IS +
        // SUM
        // ELSE
        // EXTRACT
        // PRINT()
    }

}