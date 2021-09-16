import java.sql.SQLOutput;

public class Calculator {



    public static void main (String[] args ) {

        int number1 = 10;
        int number2 = 5;
        int sum = number1+ number2;
        int multipy = number1 * number2;
        int min = number1 - number2;
        int division = number1 / number2;


        System.out.println("Number 1:" + number1);
        System.out.println("Number 2:" + number2);
        System.out.println("sum of these numbers " + sum);
        System.out.println("Multiplication of the numbers"  +multipy);
        System.out.println("Extraction" + min);
        System.out.println("Division " + division);
        System.out.println("Number 1 is" + number1 + ",number 2 is" + number2);

    }
}
