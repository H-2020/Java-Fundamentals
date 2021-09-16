import java.util.Scanner;

public class Opdracht1 {
    public static void main(String[] args) {
        //PRINT
        System.out.println("Welcome to the Hash Drawer app:");
        //PRINT
        System.out.println("Enter height:");
        //INPUT(HEIGHT)
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        //PRINT
        System.out.println("Enter width:");
        //INPUT(WIDTH)
        int width = scanner.nextInt();
        //FOR
        for(int i=0; i<height ; i=i+1) {
            String s= "#";
            //FOR CHILD
            for (int k = 0; k < width; k = k + 1) {
                System.out.print(s);
            }
            System.out.println();
        }
        //PRINT
        System.out.println("Thank you for using this program");
    }
}
