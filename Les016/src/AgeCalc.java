import java.util.Scanner;

public class AgeCalc {

    public static void main(String[] args) {

        //PRINT
        System.out.println("Welcome to age calculator programma");

        //PRINT
        System.out.println("Write the age");

        //INPUT(AGE)
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        boolean condition_age = (age >= 18);

        //IF
        if (condition_age) {
            System.out.println("You are an adult");
        }

        //ELSE
        else  {
            System.out.println("You are a child");
        }

        //PRINT
        System.out.println("Thank you for using the programma");

    }
}
