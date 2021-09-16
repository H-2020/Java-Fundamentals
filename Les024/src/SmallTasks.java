import java.util.Scanner;

public class SmallTasks {

    public static void main(String[] args) {

        //create an app that prints even numbers
        //print the ven numbers between 0 and 100
        //PRINT
        System.out.println("Welcome the even app");

       //FOR(50)
        for(int counter=0;counter<100; counter = counter+2){
            System.out.println("Even number is:" + counter);
        }

        for(int counter=0;counter<100; counter++){
            if (counter% 2==0){
            System.out.println("Even number is:" + counter);
        }
        }


        //PRINT
        System.out.println("Thank you for using this app");
    }
}
