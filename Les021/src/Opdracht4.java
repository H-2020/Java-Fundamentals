import java.util.Scanner;

public class Opdracht4 {

    public static void main(String[] args) {
        //PRINT
        System.out.println("Welcome to the Summa Nation App:");

        //PRINT
        System.out.println("Enter a number");

        //INPUT(NUMBER)
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();
        int sum = 0;
        //FOR
        for(int i=0; i<=num; i=i+1){
            sum = sum+i;
         }
        //PRINT
        System.out.println("The result of the summation:");
        //FOR
        for (int k = 1; k < num; k = k + 1) {
            System.out.print(k +"+");
        }
        System.out.println(num + "=" +sum);
        //PRINT
        System.out.println("Thank you for choosing our app.");
    }
}
