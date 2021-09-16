import java.util.Scanner;

public class opdracht1 {
    public static void main(String[] args) {
        //PRINT ->HELLO
        System.out.println("Welcome to App");

        //PRINT
        System.out.println("Please enter your full name");

        //INPUT(FULL_NAME)
        Scanner scanner= new Scanner(System.in);
        String fullName= scanner.nextLine();

        //PRINT
        System.out.println("Hello"+ " " + fullName);

        //PRINT ->GOODBYE
        System.out.println("Thank you for choosing our app..");
    }
}
