public class Opdracht07 {

    /*
     * Create a program with 2 boolean variables and give them a value.
     * Use logical operators and print the expected output.
     *  */
    public static void main(String[] args) {

        boolean value1 = true;
        boolean value2 = false;

        System.out.println("value1\t\t\t\t : " + value1);
        System.out.println("value2\t\t\t\t : " + value2);

        System.out.println("value1 && value2\t : " + (value1 && value2));
        System.out.println("value1 || value2\t : " + (value1 || value2));

        System.out.println("!value1\t\t\t\t : " + (!value1));
        System.out.println("!value2\t\t\t\t : " + (!value2));

        /*
         *   [     b1 true      |     b2 false      ]
         *     b1 && b2               b2 && b1            true && false -> false
         *     b1 || b2               b2 || b1            true || false -> true
         *     !b1 && b2              b2 && !b1           !true (false) && false -> false
         *     !b1 || b2              b2 || !b1          !true(false) || false -> false
         *
         *     true || false   false || true   true || true  -> true
         *     false || false -> false
         *
         *     TRUE    FALSE
         *     TRUE && TRUE  = TRUE
         *     TRUE && FALSE = FALSE
         *     FALSE && TRUE = FALSE
         *     FALSE && FALSE = FALSE
         *     TRUE || TRUE = TRUE
         *     TRUE || FALSE = TRUE
         *     FALSE || TRUE = TRUE
         *     FALSE || FALSE = FALSE
         *
         * */


    }
}
