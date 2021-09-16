public class CastingExamples {

    public static void main(String[] args) {

        // byte sandbox

        // the default data type value of each numbers that we do NOT define will be int
        // var number3 = 50;
        // var number4 = 999;
        // var number5 = 100_000_000_000L;

        byte b1 = 10;
        byte b2 = 20;
        // CASTING
        byte b3 =  (byte)(b1 + b2); // 1st step: b1 -> 10 ... 2nd step: b2 -> ???
        byte b4 = b3;
        byte b5 = b3;
        byte b6 = (byte) (b2 - b1);

        //  DATA TYPE      | MEMORY ADDRESS     | VALUE
        //  byte b1           8231bjfdsa23          20
        //  byte b2           5asd4acdgrb2          10
        //  byte (b1 + b2)    v78wfe89f7qw          30
        //  byte b3           sdf4a6s76ada          30
        //  byte b4           ds7f6v5svsd6          30
        //  byte b5           va90dpaf9v8sd         30
        //  (b2 - b1)         9df8fqdwqdgv6         10
        //  byte b6           sa8v9f7wefeqw         10


        System.out.println("b1 is " + b1);
        System.out.println("b2 is " + b2);
        System.out.println("b3 is " + b3);
        System.out.println("b4 is " + b4);
        System.out.println("b5 is " + b5);
        System.out.println("b6 is " + b6);


    }
}
