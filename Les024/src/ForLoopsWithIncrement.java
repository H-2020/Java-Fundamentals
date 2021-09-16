public class ForLoopsWithIncrement {

    public static void main(String[] args) {
        //PRINT
        System.out.println("Welcome to For Looper");
        String SEPERATOR="*************************";

        // FOR(10)
        for (int counter = 0; counter < 10; ) {
        // CALCULATE & PRINT
            System.out.println("Hello " + (++counter) + " times.");
            System.out.println("Using counter with ++counter" + counter);
        // loop 1
        // 0 = 0 + 1
        // System.out.println("Hello 1 times.") // loop 2
        // 1 = 1 + 1
        // System.out.println("Hello 2 times.")
        }
        System.out.println(SEPERATOR);
        // FOR(10)
        for (int counter = 0; counter < 10; ) {
            // CALCULATE & PRINT
            System.out.println("Hello " + (counter++) + " times.");
            System.out.println("Using counter with counter++" + counter);
        // loop 1
        // System.out.println("Hello 0 times.")
        // 0 = 0 + 1 // loop 2
        // System.out.println("Hello 1 times.")
        // 1 = 1 + 1
        }






    }
}
