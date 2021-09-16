public class Opdracht12PrioritiesRegels {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;

// op1 = op2    16 ( )
// ++op1         3 ( )
// op1 * op2     5 ( )
// op1--         2 (X)
// op1 + op2     6 ( )
// op1 - op2     6 ( )
// --op1         3 ( )
// op1 + op2     6 ( )
        int result1 = ++number1 * number2-- + 2 - --number1 + 1;
//  number1 -> 2, number1 -> 1
//  2 * 2 + 2 - 1 + 1
//  4 + 2 = 6
        System.out.println("Result 1 is " + result1);

        number2 = 10;
// op1 = op2  (16)
// op1++      (02) (X)
// op1 + op2  (06)
// --op1      (03) (X)
        int result2 = number2++ + --number2;
        System.out.println("Result 2 is " + result2);
        System.out.println("Number 2 is " + number2);
        number2++;
        System.out.println("Number 2 is " + number2);
// f6fwefw7fwe8 -> number2 -> 10
//  result2 = 11 + --number2
        int number3 = 5;
//  op1 = op2   (16)   ( )
//  op1++       (02)   (X)
//  op1 - op2   (06)   ( )
//  op1 / op2   (05)   ( )
//  op1 + op2   (06)   ( )
//  op1 * op2   (05)   ( )
        number3 = number3++ - number3 / 5 + number3 * 4;
        
// number3 = 5++ - 5 / 5 + 5 * 4;
// number3 = 25;
        System.out.println("Number3 is now " + number3);

        int number4 = 5;
        number4 = number4++ - number4 / 5 + number4 * 4;

        int number5 = 100;
// op1 = op2  (16)
// op1++      (02)
// op1 + op2  (06)
// number5 = number5 + 1;
// number5++;
        number5 = (number5 = number5 + 1) + 1;
        System.out.println("Number 5 after number5 = number5 + 1 is " + number5);

// (number5 = number5 + 1) -> number5++   (NOT CORRECT)
// (number5 = number5 + 1) -> ++number    (CORRECT)
        int number6 = 100;
        int number7 = 0;
        number7 = ++number6 + 1;
        System.out.println("Number 6 is " + number6);
        System.out.println("Number 7 is " + number7);
// System.out.println("Number 6 is " + (number6 = number6 + 1)); // 103
//  System.out.println("Number 6 after (number5++ + 1) is " + number6);
    }
}
