import java.util.Scanner;

public class SwitchCaseLogic {

    public static void main(String[] args) {
        //read the pre-defined pin code from the user

        //if the user sets the pre-defined pincode smaller or equal than 0
        //set the pincode 1234
        //if the user set the code to -x we will stop the application..

        //read the pin code with max 6 digits
        //assign it a variable
        //check the pin code 4 times
        //if the pin code is correct print "Voila'
        //if it is incorrect the print "Nooo"
        //if the user already tried 4 times and non of this pin codes were correct
        //print "Account Blocked"
        //if the user enters the password reversed then the police


        //int pinCode=1234;
        //PRINT
        System.out.println("Welcome to Pin Code");

        //PRINT
        System.out.println("Please enter the pin code:");

        //INPUT(PIN_CODE)
        Scanner scanner = new Scanner(System.in);
        String preDefinedPinCode= scanner.nextLine();

        //IF(PRE_DEFINED_CODE)
        int preDefinedPinCodeAsInteger =Integer.parseInt(preDefinedPinCode);
        String exitCommand="-x";
        boolean codeIsExitCommand=(preDefinedPinCode==exitCommand);

        boolean codeIsSmallerOrEqualToZero=(preDefinedPinCodeAsInteger <=0);
        if(codeIsSmallerOrEqualToZero){
            //PRINT
        }
        else if(codeIsExitCommand){
            //EXIT
        }



        //PRINT
        System.out.println("Enter your pin code:");
        //INPUT(PIN_CODE)
        //Scanner scanner = new Scanner(System.in);
        int guessedCode= scanner.nextInt();


        boolean isCorrect= ( guessedCode== 1234);
        boolean isCodeReserved= ( guessedCode== 4321);

        //IF
        if( isCorrect){
            System.out.println("Voila");
        }
        else if(isCodeReserved){
            System.out.println("Calling the police");
        }
        //ELSE
        else{
            System.out.println("Nooo");

        }



        //SWITCH CASE



        switch(guessedCode) {

            case 1234:
                System.out.println("Voila");
                break;

            case 4321:
                System.out.println("Calling the police");
                break;



            default:
                System.out.println("Noooo");

        }
    }
}
