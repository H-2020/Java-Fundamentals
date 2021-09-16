    import java.util.Scanner;

    public class Herhalen2 {

            public static void main(String[] args){
            //1-CALCULATOR
                // PRINT
            System.out.println("Welcome to calculator");

            //PRINT
            System.out.println("Select number:");

            //INPUT(NUMBER)
            Scanner scanner = new Scanner(System.in);
            int number1 = scanner.nextInt();

            //PRINT
            System.out.println("Operation:");

            //INPUT(OPERATION)
            char operation = scanner.next().charAt(0);

            //PRINT
            System.out.println("Select number2:");

            //INPUT(NUMBER)
            int number2 = scanner.nextInt();
            //IF
            if (operation == '+') {
                int sum = number1 + number2;
                System.out.println("sum of these numbers: " + sum);
            }
            if (operation == '-') {
                int min = number1 - number2;
                System.out.println("Extraction: " + min);
            }
            if (operation == '*') {
                int multipy = number1 * number2;
                System.out.println("Multiplication of the numbers: " + multipy);
            }
            if (operation == '/') {
                int division = number1 / number2;
                System.out.println("Division: " + division);
            }
            //PRINT
            System.out.println("Thank you for using calculator");


            // 2- keywords:public,class,static,void,String

                //I WANT TO PRINT MY FULL NAME

                System.out.println("Hilal Demir");

                //I want to print my age

                //Data types in Java: primitive data types        //KEYWORD VARIABLE_NAME = VALUE;
                //String:used for text data
                String ageAsText="2021--1977";
                System.out.println(ageAsText);
                //int:used for numbers
                int ageAsNumber= 2021-1977;
                System.out.println(ageAsNumber);
                //byte 1 byte -128 to 127,
                //short 2 bytes -32768 to 32767,
                // int 4 bytes -2,147,483,648 to,
                // long 8 bytes -9,223,372,036,854,775,808L(virgulleri sil L ile kullanirken) to,
                // float 4 bytes decimal 1.25845f(altijd f)
                // double 8 bytes 1.46564d(niet altijd, de meeste double gebruik)
                // boolean 1 bit true or false,
                // char 2 bytes ,

                byte number01 = 127;
                System.out.println(number01);
                short number02 = 32000;
                System.out.println(number02);
                int number03 = 2000000000;
                System.out.println(number03);
                long number04 = 9223372036854775807L;
                System.out.println(number04);
                float number05 = 1.46486488f;
                System.out.println(number05);
                double number06 = 1.4648648;
                System.out.println(number06);


            }
    }


