public class SimpleCalculations {

    public static void main(String[] args) {

        //+ - / * % ++ --

        int n1=1;
        int n2=2;
        int n3=3;
        int n4=4;
        int n5=5;
        int n6=6;

        //PRINT
        System.out.println("Calculation operators");

        int sum= n1+n2;
        System.out.println("n1+n2=" +sum);
        int min=n1-n2;
        System.out.println("n1-n2=" +min);
        int div=n1/n2;
        System.out.println("n1/n2=" + div);
        int mul=n1*n2;
        System.out.println("n1xn2=" +mul);
        int mod= n1%n2;
        System.out.println("n1 mod n2=" + mod);

        System.out.println("n1++=" + (n1++));
        System.out.println("++n1=" +(++n1));
        System.out.println("n1--=" +(n1--));
        System.out.println("--n1=" +(--n1));


    }
}
