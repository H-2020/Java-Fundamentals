public class LogicalOperators {

    public static void main(String[] args) {

        /*
        boolean condition1 = false;
        boolean condition2 = true;
        boolean condition3 = false;

        // AND AND -> if condition1 is true && condition2 is trye && condition3 is true
        if(condition1 && condition2 && condition3){

        }

        // OR OR ->  if condition1 is true or condition2 is true or condition3 is true
        if(condition1 || condition2 || condition3){

        }

        // NOT -> if not the condition -> if condition1 not is true
        if(!condition1){

        }
         */


        String sentence = "The for sweet love remember'd such wealth brings, " +
                "then I scorn to change my state with Kings. W.Shakespeare.";

        // if in the sentence there are certainly sweet and potato
        if (sentence.contains("sweet") || sentence.contains("potato")) {
            System.out.println("This sentence contains 'sweet' and 'potato' together");
        }

        if (sentence.contains("King") || sentence.contains("Queen")) {
            System.out.println("Welcome to dynasty..!");
        }


    }

}
