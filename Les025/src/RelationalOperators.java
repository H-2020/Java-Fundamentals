import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {

        //write a program that checks if you are still young..
        //if your age is greater than 99 then print "Ok,I admit you are old"
        //if your age is equal to 40 then print "You are somewhere in the middle"
        //if your age is smaller than 40 then but also 16 then print
        // "Cool, you are young!"
        // if your age is smaller than 16 then print
        //"We don't allow kiddos here .. "print "Ok,I admit you are old"

        //PRINT
        System.out.println("Welcome to age app");
        //PRINT
        System.out.println("Write your age:");
        //INPUT(AGE)
        Scanner scanner= new Scanner(System.in);
        int age= scanner.nextInt();

        //IF
        boolean condition1= age>99;
        boolean condition2= age==40;
        boolean condition3= ((age<40) && (age>16));
        boolean condition4= age<16;

        if(condition1){
            System.out.println("Ok,I admit you are old");
        }
        else if(condition2){
            System.out.println("You are somewhere in the middle");
        }
        else if(condition3){
            System.out.println("Cool, you are young!");
        }
        else if(condition4){
            System.out.println("We don't allow kiddos here .. ");
            System.out.println("Ok,I admit you are old");
        }
        //PRINT
        System.out.println("Thank you for using");
        String SEPERATOR="**************************";
        System.out.println(SEPERATOR);

       /* switch(){
            case condition1:

            break;

            case condition1:

            break;

            default:
        }*/

    }
}
