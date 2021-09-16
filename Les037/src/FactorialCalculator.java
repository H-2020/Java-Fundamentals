// Java program to calculate factorial of any number
import java.util.Scanner;
public class FactorialCalculator{

    public static void main(String args[]){

        // PRINT -> Welcome
        System.out.println( "Welcome");

        // CREATE -> Scanner
        Scanner scanner = new Scanner(System.in);
        // PRINT
        System.out.print("Enter the any number: ");

        // INPUT()
        int number = scanner.nextInt();

        // CREATE -> Factorial
        /*int factorial = 1;
        // FOR(NUMBER)
        for (int counter = number ; counter > 0 ; counter-- ) {
            factorial = factorial * counter;
        }
        */
        /*int factorial = 1;
        int counter=number;
        while(counter>0){
            factorial = factorial * counter;
            counter--;
        }*/
        System.out.println("*****************************");
        //int counter=number;
        int factorial = 1;
        while(number>0){
            factorial*=number--;
        }

        // PRINT -> Factorial
        System.out.println( "Factorial is : " + factorial);

        // PRINT -> Goodbye
        System.out.println( "Goodbye");

    }

}