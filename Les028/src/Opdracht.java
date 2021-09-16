public class Opdracht {
    public static void main(String[] args) {


        for (int counter=0;(counter% 2 ==0) && (counter<100); counter=counter+2) {
            //PRINT->CHILD
            System.out.println("Counter is now" + counter);
            System.out.println("The number " + counter + " is even");
        }
    }
}
