import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String word= scanner.nextLine();
        //PRINT
        System.out.println("The length of the word is " + word.length());
        int charLength =word.length();
        int charIndex = 0;
        boolean textIsAPalindrome=(word.charAt(charIndex) == word.charAt(charLength-charIndex));
        boolean textIsNotAPalindrome=(word.charAt(charIndex) != word.charAt(charLength-charIndex));
    }
}
