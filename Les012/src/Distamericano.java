import java.util.Scanner;

public class Distamericano {

    public static void main(String[] args) {
        System.out.println("Welcome Distamericano:");
        System.out.println("Choose the number:");
        Scanner scannumber = new Scanner(System.in);
        double inch = scannumber.nextDouble();
        double meter = inch * (0.0254 );
        System.out.println(inch + " inch is " + meter + " meter");
        System.out.println("Thank you for using");
    }
}