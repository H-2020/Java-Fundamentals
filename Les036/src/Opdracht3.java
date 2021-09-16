public class Opdracht3 {

    public static void main(String[] args) {
        short aShort=5;
        int anInt;
        anInt=aShort;
        System.out.println(aShort);
        System.out.println(anInt);

        System.out.println("**************************");

        short aShort2;
        int anInt2=600_000;
        aShort2=(short)anInt2;
        System.out.println(aShort2);
        System.out.println(anInt2);

        System.out.println("*****************************");

        char aChar='a';
        anInt=aChar;
        System.out.println(anInt);

        byte aByte;
        aByte=(byte)aShort;
        System.out.println(aByte);

    }
}
