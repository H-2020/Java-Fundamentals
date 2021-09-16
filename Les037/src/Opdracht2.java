public class Opdracht2 {
    /*             OP02/Create an array of 20 scientist,
                Assign the index 5 of the array to "Nikola Tesla"
                Assign the 20th element of the array to "Thomas Edison"

         */
    public static void main(String[] args) {
        //ARRAY
        String[] scientist= new String[20];
        scientist[5]="Nikola Tesla";
        scientist[19]="Thomas Edison";

        String index5=scientist[5];

        //PRINT
        System.out.println("The scientist at index 5 is:"+ index5);
        System.out.println(scientist[19]);

        int scientistCount=scientist.length;
        //FOR()
        for(int index=0;index < scientistCount; index++){
            System.out.println("Scientist index is "+index);
            System.out.println(scientist[index]);
        }


    }

}

