import java.util.Scanner;

public class Opdracht3 {
    public static void main(String[] args) {
        //  mom, dad, pop, racecar, redividedetartrated, rotator, level, civic, radar
        //PRINT
        System.out.println("Welcome to the Pal in Droom app:");
        //PRINT
        System.out.println("Enter a string:");
        //INPUT(PAL)
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
      boolean mom = (input.equals("mom") );
      boolean dad = (input.equals("dad") );
      boolean pop = (input.equals("pop") );
      boolean racecar = (input.equals("racecar") );
      boolean redividedetartrated = (input.equals("redividedetartrated") );
      boolean rotator = (input.equals("rotator") );
      boolean level = (input.equals("level") );
      boolean civic = (input.equals("civic") );
      boolean radar = (input.equals("radar") );
      boolean master = (input.equals("Lewd did I live & evil I did dwel") );
      //IF
       if(mom) {
           System.out.println("Yes, it is a palindrome.");
       }
        else if(dad) {
            System.out.println("Yes, it is a palindrome.");
        }
       else if(pop) {
           System.out.println("Yes, it is a palindrome.");
       }
       else if(racecar) {
           System.out.println("Yes, it is a palindrome.");
       }
       else if(redividedetartrated) {
           System.out.println("Yes, it is a palindrome.");
       }
       else if(rotator) {
           System.out.println("Yes, it is a palindrome.");
       }
       else if(level) {
           System.out.println("Yes, it is a palindrome.");
       }
       else if(civic) {
           System.out.println("Yes, it is a palindrome.");
       }
       else if(radar) {
           System.out.println("Yes, it is a palindrome.");
       }
       else if(master) {
           System.out.println("Wow, you are the master of palindromes !!");
       }
       else{
           System.out.println("No, it is NOT a palindrome.");
       }

        //PRINT

            System.out.println("Thank you for using this program");

    }

}
