import java.util.Scanner;

public class Petty {

    public static void main(String[] args) {
        //primitive data types
        //complex data types

        //Pet Adoption App

        //PRINT
        System.out.println("Welcome to our lovely pets world");

        //PRINT
        System.out.println("Please choose a name for your pet");

        //INPUT(NAME)
        Scanner scanner = new Scanner(System.in);
        String petName = scanner.nextLine();

        //CAT
        System.out.println("Is that a cat? y/n");
        String isThatCat = scanner.nextLine();


        //DOG
        System.out.println("Is that a cat? y/n");
        String isThatDog = scanner.nextLine();

        //BUNNY
        System.out.println("Is that a cat? y/n");
        String isThatBunny = scanner.nextLine();

        //JELLYFISH
        System.out.println("Is that a jellyfish? y/n");
        String isThatJellyFish = scanner.nextLine();

        //LIFESPANS_OF_EACH_ANIMAL
        int lifeSpanOfCat = 20;
        int lifeSpanOfDog = 15;
        int lifeSpanOfBunny = 12;
        int lifeSpanOfJellyFish = Integer.MAX_VALUE;
        //double maxValueOfDecimalNumberInJava = Double.MAX_VALUE

        //PRINT
        //System.out.println("What is the age of your " + theSortOfAnimal + "?");

    }
}
