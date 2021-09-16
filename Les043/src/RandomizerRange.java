import java.util.Random;

public class RandomizerRange {

    public static void main(String[] args) {

        int min=10;
        int max=99;

        Random randomizer= new Random();
        int randomNumber=randomizer.nextInt(max);
        if(randomNumber<min){
            randomNumber+=min;
        }
        System.out.println(randomNumber);
    }
}
