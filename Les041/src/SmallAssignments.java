public class SmallAssignments {
    // op01: create an array of 100 numbers and print all

    public static void main(String[] args) {

        //DECLARE_AND_INSTANTIE_AN_ARRAY(100)
        int[] numbers=new int[100];

        //FOR(100)
        for (int index = 0; index < numbers.length; index++){
            //INSTANTIATE_ARRAY_ELEMENT
            numbers[index]=index;
            //PRINT->numbers
            System.out.println(numbers[index]);
        }

        String SEPERATOR="********************************";
        System.out.println(SEPERATOR);

        // op02: print all the characters at "ch€f" in apart new lines
        // print also using another for loop all characters in reverse order

        //INPUT
        String word = "Chef";

        //CREATE AN ARRAY
        char[] newChef = word.toCharArray();

        //FOR
        for (int index2 = 0; index2 < newChef.length; index2++){
            System.out.println(newChef[index2]);
        }

        System.out.println(SEPERATOR);
        //CALCULATE->lengthIndex
        int lengthIndex=newChef.length-1;
        //FOR->Reverse
        for (int indexReverse=lengthIndex; indexReverse >=0; indexReverse--){
            System.out.println(newChef[indexReverse]);
        }


        System.out.println(SEPERATOR);

        // op03: create an array of student scores (can contain decimal numbers)
        // print all the student scores in a new line
        // print the sum of all students scores'
        // print average of the scores: averageScore = totalScoreOfStudents / numberOfStudents

        //DECLARE AND INSTANTIE AN ARRAY
        double[] studentScores= new double[5];
        studentScores[0]=80.50;
        studentScores[1]=90.50;
        studentScores[2]=70.50;
        studentScores[3]=60.50;
        studentScores[4]=95.50;

        //INPUT
        double sumScores=0;

        //FOR
        for (int indexScores = 0; indexScores< studentScores.length; indexScores++){
            System.out.println(studentScores[indexScores]);
        }
        //FOR->Calculate_sum_of_the_scores
        for (int indexScores = 0; indexScores< studentScores.length; indexScores++){
            sumScores=sumScores+ studentScores[indexScores];
        };
        //PRINT
        System.out.println(sumScores);

        //CALCULATE->Average_Score
        double averageScore = sumScores / 5;

        //PRINT->Average_Score
        System.out.println(averageScore);

        //PRINT
        System.out.println("Thank you for using this application");

    }
}
