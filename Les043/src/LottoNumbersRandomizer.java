import java.util.Random;
import java.util.Scanner;

public class LottoNumbersRandomizer {

    public static void main(String[] args) {

        // LOTTO APP -> 6 numbers with max 45 as value


        String SEPARATOR = "--------------------------------------";

        /*
          int[] lottoNumbers = new int[6];

        lottoNumbers[0] = 44;
        lottoNumbers[1] = 34;
        lottoNumbers[2] = 12;
        lottoNumbers[3] = 22;
        lottoNumbers[4] = 5;
        lottoNumbers[5] = 14;

        System.out.println("Random number self-assigned index 0 -> " + lottoNumbers[0]);
        System.out.println("Random number self-assigned index 1 -> " + lottoNumbers[1]);
        System.out.println("Random number self-assigned index 2 -> " + lottoNumbers[2]);
        System.out.println("Random number self-assigned index 3 -> " + lottoNumbers[3]);
        System.out.println("Random number self-assigned index 4 -> " + lottoNumbers[4]);
        System.out.println("Random number self-assigned index 5 -> " + lottoNumbers[5]);

        System.out.println(SEPARATOR);

        Random randomizer = new Random();
        int lottoNumber0 = randomizer.nextInt(45);
        int lottoNumber1 = randomizer.nextInt(45);
        int lottoNumber2 = randomizer.nextInt(45);
        int lottoNumber3 = randomizer.nextInt(45);
        int lottoNumber4 = randomizer.nextInt(45);
        int lottoNumber5 = randomizer.nextInt(45);

        System.out.println("Random number auto-generated index 0 -> " + lottoNumber0);
        System.out.println("Random number auto-generated index 1 -> " + lottoNumber1);
        System.out.println("Random number auto-generated index 2 -> " + lottoNumber2);
        System.out.println("Random number auto-generated index 3 -> " + lottoNumber3);
        System.out.println("Random number auto-generated index 4 -> " + lottoNumber4);
        System.out.println("Random number auto-generated index 5 -> " + lottoNumber5);

        System.out.println(SEPARATOR);

         */

        System.out.println("How many lotto numbers would you like to generate? ");
        Scanner scanner = new Scanner(System.in);
        int lottoLength = scanner.nextInt();

        int[] lottoNumbers = new int[lottoLength];
        Random randomizer = new Random();

        for (int index = 0; index < lottoNumbers.length; index++) {
            lottoNumbers[index] = randomizer.nextInt(45);
            System.out.println("Lotto number " + index + " is " + lottoNumbers[index]);
        }


    }

}

