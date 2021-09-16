import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {


        // String numberAsText = "35";
        // int number = Integer.parseInt(numberAsText);

        // System.out.println(number);

        Scanner scanner = new Scanner(System.in);
        String pinCode = scanner.nextLine();
        if(pinCode.equals("-x")){
            int theRealPinCode = Integer.parseInt(pinCode);
            System.out.println("Pin code is " + pinCode);
        } else {
            System.out.println("Success!");
        }




    }
}

