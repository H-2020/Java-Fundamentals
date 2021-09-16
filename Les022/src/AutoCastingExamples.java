public class AutoCastingExamples {

    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;
        int i3 = i1 + i2;
        int i4 = i3;
        int i5 = i3;
        int i6 = i1 - i2; // default casting type is int

        // WHAT IS GOING TO HAPPEN WHEN 2.000.000.000 + 2_000_000_001 = 4.000.000.001

        // max value of int = 2.14b // 2.14 Billion
        // max value of long = 9.223.372.036.854.775.807 // 9.22 Quintillion

        long l1 = 2_147_483_647;
        int l2 = 2_000_000_001;
        long l3 = l1 + l2;
        long l4 = l3;
        long l5 = l3;
        long l6 = l1 - l2;

        //  DATA TYPE      | MEMORY ADDRESS     | VALUE
        //  int i1           8231bjfdsa23          20
        //  int i2           5asd4acdgrb2          10
        //  int (i1 + i2)    v78wfe89f7qw          30
        //  int i3           sdf4a6s76ada          30
        //  int i4           ds7f6v5svsd6          30
        //  int i5           va90dpaf9v8sd         30
        //  (i2 - i1)        9df8fqdwqdgv6        -10
        //  int i6           sa8v9f7wefeqw         10
        //  long l1          fvwf8we7fwfwe8       2.000.000.000
        //  int l2          6wefwfwf8wef8w        2.000.000.001
        //  long (l1 + l2)   v6rw6wfef5wefw       4.000.000.001

        double d1 = 2_000_000_000.250;
        int d2 = 2_000_000_001;
        double d3 = d1 + d2;

        String SEPERATOR = "------------------------------------";

        System.out.println(SEPERATOR);

        System.out.println("int 1 " + i1);
        System.out.println("int 2 " + i2);
        System.out.println("int 3 " + i3);
        System.out.println("int 4 " + i4);
        System.out.println("int 5 " + i5);
        System.out.println("int 6 " + i6);

        System.out.println(SEPERATOR);

        System.out.println("long 1 " + l1);
        System.out.println("long 2 " + l2);
        System.out.println("long 3 " + l3);
        System.out.println("long 4 " + l4);
        System.out.println("long 5 " + l5);
        System.out.println("long 6 " + l6);
    }
}
