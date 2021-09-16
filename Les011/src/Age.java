import java.util.Scanner;

        public class Age {
            public static void main(String[] args) {

                //PRINT(HELLO_MESSAGE)
                System.out.println("Welcome to age calculator");

                //system in
                Scanner scanner =  new Scanner(System.in);

                //TYPE(NAME)
                //var name = " name";
                //System.out.println("Write the name " + name );


                //TYPE(YEAR_OF_BIRTH): Read de keyboard input
                System.out.println("Please enter the now year and birth, EX:2021 1977");
                //keyboard.nextInt()/keyboard.nextDouble()/keyboard.nextLine()/keyboard.next()


                //System.out.println("Searching " + yearOfBirth);

                //TYPE(YEAR-OF-NOW):Read the keyboard input


                //System.out.println("Searching " + yearOfNow);

                int now = scanner.nextInt();
                int birth = scanner.nextInt();

                //CALCULATE_AGE()

                int realage = now - birth ;
                int soulage = realage - 10 ;


                //PRINT(AGE)
               System.out.println("your real age is " + realage );
               System.out.println("your soulage is " + soulage );

                //memort for output messages
                //System.out.flush();

    }
}
