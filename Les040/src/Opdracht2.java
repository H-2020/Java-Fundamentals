import java.util.Scanner;

public class Opdracht2 {

    public static void main(String[] args) {
        //PRINT->Welcome
        System.out.println("Welcome to App");
        //CREATE->Scanner
        Scanner scanner=new Scanner(System.in);
        //PRINT
        System.out.println("Enter your sentence");
        //INPUT(Text)
        String text= scanner.nextLine();
        //SPLIT
        String[] words=text.split(" ");
        //FOR
        for(String word:words){
            //PRINT
            System.out.println(word);
        }
        //PRINT-
            System.out.println("Thank you for using this application");
    }
}
