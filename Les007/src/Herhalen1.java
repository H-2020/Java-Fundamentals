public class Herhalen1 {
    public static void main (String[]args) {

        // 1-Java program to demonstrate boolean data type Taak01Voorbeeld01
        boolean b = true;
        if (b == true)
            System.out.println("Hi Geek");

        // 2-byte is 8 bit value Taak01Voorbeeld02
        byte a = 126;
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);
        // Looping back within the range
        a++;
        System.out.println(a);

        // 3-declaring character Taak01Voorbeeld03
        char c = 'G';
        // Integer data type is generally
        // used for numeric values
        int i = 89;
        // use byte and short
        // if memory is a constraint
        byte e = 4;
        // this will give error as number is
        // larger than byte range
        // byte b1 = 7888888955;
        short s = 56;
        // this will give error as number is
        // larger than short range
        // short s1 = 87878787878;
        // by default fraction value
        // is double in java
        double d = 4.355453532;
        // for float use 'f' as suffix
        float f = 4.7333434f;
        System.out.println("char: " + c);
        System.out.println("integer: " + i);
        System.out.println("byte: " + e);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
    }
}
