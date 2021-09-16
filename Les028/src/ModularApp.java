public class ModularApp {

    public static void main(String[] args) {
        int number1=10;
        int number2=3;
        int number3=4;
        int mod1= number1 % number2;
        //mod1 = 10/3=3
        //mod1=10-9=1

        int mod2= number1 % number3;
        System.out.println("mod 1:"+ mod1);
        System.out.println("mod 2:"+ mod2);

        //PRINT REAMINDERS OF NUMBER/5 BETWEEN 1 AND 100 IN A LOOP
        //FOR(100)
        for(int number=0;number<100;number++){
            //IF(CONDITION)->IF NUMBER / 5 HAS A REMAINDER? EX:11 MOD 5+1
            boolean isNumberMod5GreaterThan0= (number % 5>0);
            if(isNumberMod5GreaterThan0){
                System.out.println("Yes,your mod works");
            }else{
                System.out.println("No,your mod result is zero");
            }
        }
        
    }
}
