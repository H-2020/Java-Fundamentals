import java.util.Scanner;

public class NewCodeBlocks {

    public static void main(String[] args) {

        // Read text data from the keyboard ..
        Scanner textScanner = new Scanner(System.in);
        String textData = textScanner.nextLine();
        System.out.println("Text data is " + textData);

        // Read a (non-decimal) number from the keyboard ..
        Scanner numberScanner = new Scanner(System.in);
        int numberData = numberScanner.nextInt();
        System.out.println("Integer is " + numberData);

        // Read a decimal number from the keyboard ..
        Scanner decimalScanner = new Scanner(System.in);
        double decimalData = decimalScanner.nextDouble();
        System.out.println("Double is " + decimalData);

        // Convert text data to non-decimal number ..
        // For type conversions you must be sure that text data never contains
        // a non-digit character !!
        String textData2 = "35";
        int numberData2 = Integer.parseInt(textData2);
        System.out.println("Converted integer from text is " + numberData2);

        // Convert text data to decimal number ...
        // For type conversions you must be sure that text data never contains
        // a non-digit character !!
        String textData3 = "70.50";
        double numberData3 = Double.parseDouble(textData3);
        double myDecimal = 50.56;
        System.out.println("Converted double from text is " + numberData3);

        // Get a certain character from a text data
        String textData4 = "yalmaz";
        // textData4 -> 7sd6278vf6ef ->  "yilmaz"
        // textData4.charAt(0) -> fv6w8fwfdwe9g -> "y"
        // charData4 -> 213hgdkfs342 -> "y"
        char charData4 = textData4.charAt(0);
        int indexOfA = textData4.indexOf('a');
        // textData4 -> 7sd6278vf6ef ->  "yalmaz"
        // textData4.indexOf('a') -> fe7w86vwevw -> 1
        System.out.println("Char from the first index is " + charData4);
        System.out.println("Index of a is " + indexOfA);


    }
}
