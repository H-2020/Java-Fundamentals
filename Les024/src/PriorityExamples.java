public class PriorityExamples {

    public static void main(String[] args) {

        // PRINT
        System.out.println("Welcome to Priority App");

        // CALCULATION
        int i1 = 10; // i1 -> 10
        int i2 = 25; // i2 -> 25
        int i3 = i1 + i2; // i3 -> 10 + 25


        // CALCULATION
        // i3 = i3 + 1; // i3 -> 35 + 1
        // i3++;
        //++i3;

        //System.out.println("3rd number is " + (++i3) );
        // ++ -> increment(operand: variable) -> variable = variable + 1
        // System.out.print() -> print : "3rd number is 36"

        System.out.println("3rd number is " + (i3++));
        // i3 -> 35
        // System.out.print() -> "3rd number is 35"
        // increment -> i3++ : i3 = i3 + 1

        int i4 = 20;
        System.out.println("4th number is " + (i4++) );


        // PRINT
        System.out.println("1st number is " + i1);
        System.out.println("2nd number is " + i2);
        System.out.println("3rd number is " + i3);
        // System.out.println("3rd number is " + (i3 + 1)); // 12387fdfsgf -> (i3 + 1)

        // PRINT
        System.out.println("Thank you for choosing our app..");

    }
}
