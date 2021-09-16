import java.util.Scanner;

public class RealWorld {

    public static void main(String[] args) {

        //PRINT:Welcome to the calculator
        System.out.println("Welcome to the calculator");

        //PRINT:Please enter the equation
        System.out.println("Please enter the equation");

        //INPUT(EQUATION):Ex: 10x5=?
                    //Ex: 999-25=?
        Scanner scanner = new Scanner(System.in);
        double number1= scanner.nextDouble();
        String operation= scanner.next();
        double number2 = scanner.nextDouble();

        //IF(CONDITION)
            //CALCULATE
            //PRINT

        //ELSE
            //PRINT: "You cannot enter a number greater tah 999..


    }
}
