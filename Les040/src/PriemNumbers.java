public class PriemNumbers{
    public static void main(String[] args) {

        //CREATE_AN_ARRAY
        int[] numbers = {
                7, 3, 11, 28, 35,
                42, 49, 56, 63, 70,
                77, 84, 91, 98, 105,
                112, 119, 2, 133, 140
        };

        //CREATE_AN_ARRAY
        int[] numbersPrime=new int [20];

        //INPUT->Index_prime
        int indexPrime=0;
        for (int outerIndex = 0; outerIndex < numbers.length; outerIndex++) {

            // IF(Numbers are 2,3,5,7)
            if(numbers[outerIndex]==2 ||numbers[outerIndex]==3||numbers[outerIndex]==5||numbers[outerIndex]==7){
                numbersPrime[indexPrime]=numbers[outerIndex];
                indexPrime=indexPrime+1;
            }//ELSE IF(numbers mod2, mod3,mod5,mod7= 0)
            else if (numbers[outerIndex]%2==0 || numbers[outerIndex]%3==0||numbers[outerIndex]%5==0 ||numbers[outerIndex]%7==0) {
                System.out.println(numbers[outerIndex]+ " is not a prime number");
            }//ELSE(Create numbersprime
            else{
                    numbersPrime[indexPrime]=numbers[outerIndex];
                    indexPrime=indexPrime+1;
            }


        }

        //PRINT->Array numbersprime
        for (int numberPrime :numbersPrime) {

            System.out.println(numberPrime);
        }
    }
}
