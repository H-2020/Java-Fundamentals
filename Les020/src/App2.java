import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {

        //PRINT
        System.out.println("Welkom to Bake App2");

        //PRINT
        System.out.println("Enter the amount of flour");
        //INPUT(FLOUR)
        Scanner scanner = new Scanner(System.in);
        double flour = scanner.nextDouble();

        //PRINT
        System.out.println("Enter the amount of milk");
        //INPUT(MILK)
        double milk = scanner.nextDouble();

        //PRINT
        System.out.println("Enter the amount of eggs");
        //INPUT(MILK)
        int eggs = scanner.nextInt();
        scanner.nextLine();


        //PRINT
        System.out.println("Would you like to start baking(y/n)?");
        //System.out.println();
        //INPUT(ANSWER)
        String answer = scanner.nextLine();
        boolean condition = answer.equals("y");



        //IF
        if(condition){
            //FOR
            for(int counter= 0; counter<10; counter= counter+1 ){
                //PRINT
                System.out.println("Baking pancakes:"+ counter);
            }
        }

        //PRINT
        System.out.println("Thank you for chosing");
    }
}
