import java.sql.SQLOutput;
import java.util.Scanner;

public class Dondissi {
    public static void main(String[] args) {

        //PRINT
        System.out.println("What is the name of Mr.Tesla?");
        //READ(INPUT)
        Scanner namescanner = new Scanner (System.in);
        String name = namescanner.nextLine();

        //IF(CONDITION)
        boolean conditionForname = name.equals("Nikola") ;
        if(conditionForname) {
            System.out.println("Yes!!");
        }
        else{
            System.out.println("Noo:(You better read and learn about one of " +
                    "the greatest engineer");
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        //GUESSING THE NUMBERS
        //PRINT
        System.out.println("Welcome to Dondissi numbers");

        //PRINT
        System.out.println("Guess the number");

        //READ(INPUT)
        Scanner numberscanner = new Scanner (System.in);
        int number = numberscanner.nextInt();

        //IF(CONDITION)
        var conditionForNumber = number == 5;
        if(conditionForNumber) {
            System.out.println("You got it right");

        }
        else{
            System.out.println("You don't have any idea :P");

        }






    }
}
