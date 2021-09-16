public class SandBox2 {

    public static void main(String[] args) {

        // PRINT -> Welcome
        System.out.println("Welcome");

        int[] numbers = new int[100];
        // [100] -> [0] [0] [0] [0] ...... [0] [0]
        numbers[0] = 1986;
        // [100] -> [1986] [0] [0] [0] ...... [0] [0]
        numbers[99] = 2021;
        // [100] -> [1986] [0] [0] [0] ...... [0] [2021]

        int length = numbers.length;
        for (int index = 0; index < length; index++) {
            System.out.println("Index " + index + " is " + numbers[index]);
        }

        String SEPARATOR = "--------------------------------------";

        System.out.println(SEPARATOR);

        boolean[] choices = new boolean[4];
        // [4] -> [false] [false] [false] [false]
        choices[0] = true;
        // [4] -> [true] [false] [false] [false]
        choices[2] = true;
        // [4] -> [true] [false] [true] [false]

        int lengthOfChoices = choices.length;
        for (int index = 0; index < lengthOfChoices; index++) {
            System.out.println("Index " + index + " is " + choices[index]);
        }

        System.out.println(SEPARATOR);

        char[] alphabet = {
                'A', 'B', 'C', 'D', 'E',
                'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O',
                'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z'
        };

        /*
         * OP03: Print the alphabet in reverse order
         *       optional: change all letters to lowercase
         * */

        int lengthOfAlphabet = alphabet.length; // length is 26
        int theLastIndexOfAlphabet = alphabet.length - 1; // the last index is 25

        for (int index = 0; index < lengthOfAlphabet; index++) {
            System.out.print(alphabet[index]);
            if (index == theLastIndexOfAlphabet) {
                System.out.print("\n");
                break;
            }
            System.out.print(" __ ");
        }

        // 1. ANALYZE
        // 2. PSEUDO_CODE
        // 3. SOURCE_CODE

        System.out.println(SEPARATOR);

        // Algorithm: is a way of solving problems
        // FOR(LENGTH) -> index = theLastIndex
        // sout(theLastIndex), sout(theLastIndex-1), sout(theLastIndex-2)..
        for (int index = theLastIndexOfAlphabet; index >= 0; index--) {
            // PRINT -> letter in reverse
            System.out.print(Character.toLowerCase(alphabet[index]));
            // IF(INDEX_IS_ZERO)
            if (index == 0) {
                // PRINT
                System.out.print("\n");
                // BREAK
                break;
            }
            // PRINT
            System.out.print(" __ ");
        }


        // PRINT -> Goodbye
        System.out.println("Goodbye");


    }

}

