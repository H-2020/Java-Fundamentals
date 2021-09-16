public class New {
    public static void main(String[] args) {

    // create an app that prints even numbers: 0 2 4 6 ..
        // print the even numbers between 0 and 100
    String SEPERATOR = "--------------------------------------";
        // counter = counter + 1 -> ++counter
        // counter = counter + 1 -> counter++
        // counter = counter - 1 -> counter--
        // counter = counter - 1 -> --counter


        // counter = counter + 2 -> counter += 2;
        // counter = counter - 2 -> counter -= 2;
        // counter = counter / 2 -> counter /= 2;
        // counter = counter * 2 -> counter *= 2;
        //int calculation=(counter*=3)+(counter/=5)
        //int calculation=0;
        //counter=counter*3;
        //calculation=calculation+counter;
        //counter=counter/5;
        //calculation=calculation+counter;

        // FOR(50)
        System.out.println(SEPERATOR);
        for (int counter = 0; counter < 100; counter = counter + 2) {
            System.out.println("Even number is " + counter);
        }// FOR(50)
        System.out.println(SEPERATOR);
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number is " + i);
            }
        }
        System.out.println(SEPERATOR);
        //INT VALUE
        int n = 100; //FOR(50)
        for (int i = 0; i <= n; i++) {

        //IF
            if (i % 2 == 0) {

                System.out.println("Even number is " + i);
            }

        }


    }
}
