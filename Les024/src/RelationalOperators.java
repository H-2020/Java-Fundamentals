import java.util.Scanner;

public class RelationalOperators {

    public static void main(String[] args) {

        // operand 1 (variable1)   relation   operand 2(variable 2)
        //write an program that checks if input is greater than 10
        //if the number is greater print "Greater"
        //if the number is smalller print "Smaller"
        //read another number from the input(user)
        //if the second number is 5 times smaller than the first number
        //print "

        //PRINT
        System.out.println("Welcome to Relational app");
        //PRINTThe second number is TOO small"
        System.out.println("Select the number1");
        //INPUT(NUMBER1)
        Scanner scanner=new Scanner(System.in);
        long number1= scanner.nextLong();

        //PRINT
        System.out.println("Welcome to Relational app");
        //PRINT
        System.out.println("Select the number2");
        //INPUT(NUMBER1)
        long number2= scanner.nextLong();


        //IF(CONDITION)>PARENT
        boolean condition1= (number1>10);
        if(condition1){
            //number1 is 5 times smaller than number2
            //2 times 5 is smaller tahn 40
            //2*5<40
            boolean number2is5TimesSmallerThanNumber1=(number2*5<number1);
            if(number2is5TimesSmallerThanNumber1){
                System.out.println("The second number is TOO small");
            }
            //PRINT->CHILD

            System.out.println(number1 + " is greater");
        }
        //ELSE>PARENT
        else{
            //...->CHILD
            System.out.println(number1 + " is smaller");
        }

        System.out.println("Thank you for using app");
    }
}
