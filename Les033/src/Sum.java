import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //PRINT ->HELLO
        System.out.println("Welcome to App");

        //PRINT
        System.out.println("Enter the first number:");

        //CREATE_SCANNER
        Scanner scanner = new Scanner(System.in);

        //INPUT(NUMBER_1)
        int number1= scanner.nextInt();

        //PRINT
        System.out.println("Enter the second number:");

        //INPUT(NUMBER_2)
        int number2= scanner.nextInt();

        //CALCULATE(NUMBER1+NUMBER2)
        int sum= number1+number2;

        //PRINT ->SUM
        System.out.println(" The sum is: " + sum);

        //CLOSE_SCANNER
        scanner.close();


        //PRINT->GOODBYE
        System.out.println("Thank you for using App");
    }

}
