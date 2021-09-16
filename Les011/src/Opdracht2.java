import java.util.Scanner;

public class Opdracht2 {

    public static void main (String[] args) {

        //PRINT(HELLO_MESSAGE)
        System.out.println("HELLO");

        //TYPE(YEAR_OF_BIRTH): Read de keyboard input
        Scanner keyboard = new Scanner(System.in);
        String input1 = keyboard.nextLine();
        int ifade1 = Integer.valueOf(input1);
        System.out.println("Searching " + input1);


        //TYPE(YEAR-OF-NOW):Read the keyboard input
        Scanner keyboard2 = new Scanner(System.in);
        String input2 = keyboard.nextLine();
        int ifade2 = Integer.valueOf(input2);
        System.out.println("Searching " + input2);


        //CALCULATE_AGE()
        int age = ifade2 - ifade1;
        System.out.println("Calculate" + age );

        //PRINT(AGE)
        System.out.println("print " + age );
    }
}
