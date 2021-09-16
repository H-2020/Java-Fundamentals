public class InnerForLoops {
    public static void main(String[] args) {
        // FOR(5)
        //Repetition 1: parentCounter=1,innerCounter=1=>1x1=1
        //Repetition 2: parentCounter=1,innerCounter=2=>1x2=2
        //Repetition 3: parentCounter=2,innerCounter=1=>2x1=2
        //Repetition 4: parentCounter=2,innerCounter=2=>2x2=4
        //Repetition 5: parentCounter=3,innerCounter=1=>3x1=3
        //Repetition 4: parentCounter=3,innerCounter=2=>3x2=6
        int repeatCount=0;
        for (int parentCounter = 0; parentCounter < 5; parentCounter++) {
            // System.out.println("Parent loop " + parentCounter);
            // FOR(2)
            for (int innerCounter = 0; innerCounter < 2; innerCounter++) {
                // System.out.println("Inner loop " + innerCounter);
               System.out.println("This loop is repeated " + (++repeatCount)  + "times");
            }


        }
        // This loop is repeated 1 time
        // This loop is repeated 2 times
        // This loop is repeated 3 times
        // This loop is repeated 4 times
        // This loop is repeated 10 times
    }
}
