public class RelationalOperator {

    public static void main(String[] args) {
        int number1=8;
        int number2=-6;
        System.out.println("number1:"+ number1);
        System.out.println("number2:" + number2);

        boolean n1=number1 < number2;
        boolean n2=number1 <= number2;
        boolean n3=number1 > number2;
        boolean n4=number1 >= number2;
        boolean n5=number1 == number2;
        boolean n6=number1 != number2;


        System.out.println("number1 < number2   :"+n1);
        System.out.println("number1 <= number2  :"+n2);
        System.out.println("number1 > number2   :"+n3);
        System.out.println("number1 >= number2  :"+n4);
        System.out.println("number1 == number2  :"+n5);
        System.out.println("number1 != number2  :"+n6);
        }

}
