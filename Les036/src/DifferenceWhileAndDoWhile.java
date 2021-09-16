import java.util.Scanner;

public class DifferenceWhileAndDoWhile {

    public static void main(String[] args) {

        int counter1=5;
        while(counter1==0){
            System.out.println("Counter1 is now" + counter1);

        }
        System.out.println("--------------------------");

        int counter2=5;
        do{
            System.out.println("Counter2 is now" + counter2);

        }while(counter2==0);

        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to Choco! Are you sure you want to install the app:");
        char chosenCharacter=scanner.nextLine().charAt(0);

        int progress=0;
        do{
            progress++;
            System.out.println("Installing " + progress + "%");
            if(progress==100){
                break;
            }
        }while(chosenCharacter=='y');

        while(true){
            char chosenCharacter2=scanner.nextLine().charAt(0);
            if(chosenCharacter2=='y') {
                progress++;
                System.out.println("Installing " + progress + "%");
            }else if(chosenCharacter2!='y'&& chosenCharacter2!='n'){
                System.out.println("Please choose a valid option");
            }else if(chosenCharacter2=='n');
            break;
        }

    }
}
