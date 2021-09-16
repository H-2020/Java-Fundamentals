
import java.util.Scanner;

    public class App {
        public static void main(String[] args) { // 1. Get sum of 2 numbers..
    // 2. Ask 10 more numbers and add them to the sum.. // LOOPS // IF -> PARENT NODE
    // PRINT -> CHILD NODE
    // CALCULATE -> CHILD NODE
    // ELSE
    // PRINT -> CHILD NODE // FOR(10) -> PARENT NODE
    
    Scanner scanner =new Scanner(System.in);
    double sum = 0;

    for(int counter = 0; counter < 12 ; counter = counter + 1){
        System.out.println("Step:" + counter);
        // PRINT -> CHILD NODE
        int userCounter = counter + 1;
        System.out.println("Number" + userCounter +":");

        // INPUT(NUMBER) -> CHILD NODE
        double number = scanner.nextDouble();

        // CALCULATE -> CHILD NODE
        sum = sum +number;

        // PRINT -> CHILD NODE
        System.out.println("Sum is:"+ sum);
    }
            System.out.println("Here stopped my for loop");
    // PRINT
    /*System.out.println("Welcome to PLUS PLUS App");
    Scanner scanner = new Scanner(System.in);
    double sum = 0;
    // PRINT
    System.out.println("1st number: ");
    // INPUT(NUMBER)
    double number = scanner.nextDouble();
    // CALCULATE
    sum = sum + number;
    // PRINT
    System.out.println("2st number: ");
    // INPUT(NUMBER)
    number = scanner.nextDouble();
    // CALCULATE
    sum = sum + number;
    // PRINT
    System.out.println("Sum is " + sum);
    // PRINT
    System.out.println("3st number: ");
    // INPUT(NUMBER)
    number = scanner.nextDouble();
    // CALCULATE
    sum = sum + number;
    // PRINT
    System.out.println("Sum is " + sum); // PRINT
    System.out.println("4st number: "); // INPUT(NUMBER)
    number = scanner.nextDouble(); // CALCULATE
    sum = sum + number;
    // PRINT
    System.out.println("Sum is " + sum); // PRINT
    System.out.println("5st number: "); // INPUT(NUMBER)
    number = scanner.nextDouble(); // CALCULATE
    sum = sum + number;
    // PRINT
    System.out.println("Sum is " + sum); // PRINT
    System.out.println("6st number: "); // INPUT(NUMBER)
    number = scanner.nextDouble(); // CALCULATE
    sum = sum + number;
// PRINT
    System.out.println("Sum is " + sum); // PRINT
    System.out.println("7st number: "); // INPUT(NUMBER)
    number = scanner.nextDouble(); // CALCULATE
    sum = sum + number;
// PRINT
    System.out.println("Sum is " + sum); // PRINT
    System.out.println("8st number: "); // INPUT(NUMBER)
    number = scanner.nextDouble(); // CALCULATE
    sum = sum + number;
// PRINT
    System.out.println("Sum is " + sum); // PRINT
    System.out.println("9st number: "); // INPUT(NUMBER)
    number = scanner.nextDouble(); // CALCULATE
    sum = sum + number; // PRINT
    System.out.println("Sum is " + sum); // PRINT
    System.out.println("10st number: "); // INPUT(NUMBER)
    number = scanner.nextDouble(); // CALCULATE
    sum = sum + number; // PRINT
    System.out.println("Sum is " + sum); // PRINT
    System.out.println("11st number: "); // INPUT(NUMBER)
    number = scanner.nextDouble(); // CALCULATE
    sum = sum + number; // PRINT
    System.out.println("Sum is " + sum); // PRINT
    System.out.println("Thank you for choosing PLUS PLUS.."); */
    }

}

