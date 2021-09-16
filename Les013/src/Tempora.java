import java.util.Scanner;

public class Tempora {

    public static void main(String[] args) {

        //PRINT()
        System.out.println("Welcome to Temperature Converter App");

        //PRINT()
        System.out.println("Please write the Temperature in Fahrenheit");

        //READ(TEMP)
        Scanner tempscanner =new Scanner(System.in);
        double fahre = tempscanner.nextDouble();

        //CALCULATE_CELC()
        double celc = (fahre/212)*100;

        //PRINT(CELC)
        System.out.println(fahre + "degree Fahrenheit is equal to " + celc +  "in Celsius");

    }
}
