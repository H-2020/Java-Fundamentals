import java.util.Scanner;

public class Herhalen3 {

    public static void main (String[] args){

        //1-DONDISSI
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

        //2-AGE
        //PRINT(HELLO_MESSAGE)
        System.out.println("Welcome to age calculator");

        //system in
        Scanner scanner =  new Scanner(System.in);

        //TYPE(NAME)
        //var name = " name";
        //System.out.println("Write the name " + name );


        //TYPE(YEAR_OF_BIRTH): Read de keyboard input
        System.out.println("Please enter the now year and birth, EX:2021 1977");
        //keyboard.nextInt()/keyboard.nextDouble()/keyboard.nextLine()/keyboard.net()


        //System.out.println("Searching " + yearOfBirth);

        //TYPE(YEAR-OF-NOW):Read the keyboard input


        //System.out.println("Searching " + yearOfNow);

        int now = scanner.nextInt();
        int birth = scanner.nextInt();

        //CALCULATE_AGE()

        int realage = now - birth ;
        int soulage = realage - 10 ;


        //PRINT(AGE)
        System.out.println("your real age is " + realage );
        System.out.println("your soulage is " + soulage );

    }
}


