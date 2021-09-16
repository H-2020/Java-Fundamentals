import java.util.Scanner;

public class SmallTasks {
    public static void main(String[] args) {

           for (int counter=0;counter<100; counter++){
            //IF ->CHILD THE NUMBER IS EVEN

            boolean condition = counter % 2 == 0;

            //condition=(0%2 == 0)
            //condition=(1%2 == 1)
            //condition=(2%2 == 0)
            //condition=(3%2 == 1)

            if (condition) {
            //PRINT ->CHILD
            System.out.println("The number " + counter + " is even");
            }
        }
           //FOR (MOD,100)
        for (int counter=0;((counter% 2 ==0) && (counter<100)); counter=counter+2) {
            //PRINT->CHILD
            System.out.println("Counter is now" + counter);
            System.out.println("The number " + counter + " is even");
        }

    }
}
