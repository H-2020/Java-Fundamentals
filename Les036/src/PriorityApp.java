public class PriorityApp {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int result=0;
        int c=++a * b-- +b;
        System.out.println(c);
        //int result = ++a * b-- +b < 2 ? --a : ++b;
        if (++a * b-- +b<2){
            result= --a;
        }
        else{
            result=++b;
        }
        System.out.println(result);
    }
}
