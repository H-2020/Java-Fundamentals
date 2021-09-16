public class Strings2D {

    public static void main(String[] args) {


        String[][] employees2DPreDefined = {
                {"Yilmaz Mustafa", "Patrick Gaudens"},
                {"Nikola Tesla", "Thomas Edison", "Maria Curie", "Albert Einstein"},
                {"Donald Trump", "Xi Jinping", "Vladimir Putin"}
        };

        employees2DPreDefined[2][1] = "Jack Ma";

        String[][] employees2DExtendable = new String[4][5];

        String[][] employees2DExtendableBetter = {
                new String[4],
                new String[5],
                new String[1],
                new String[8]
        };

        // PRINT -> array of arrays .

        // OUTER_FOR(employees2DPreDefined_length)
        for (int outerIndex = 0; outerIndex < employees2DPreDefined.length; outerIndex++) {

            // INNER_FOR(employees2DPreDefined_element_length)
            for (int innerIndex = 0; innerIndex < employees2DPreDefined[outerIndex].length; innerIndex++) {
                // nameOf2DArray[outerIndex][innerIndex]
                if(employees2DPreDefined[outerIndex][innerIndex].contains("Donald Trump")){
                    employees2DPreDefined[outerIndex][innerIndex] = "XXXXXXXXXXXXXX";
                }
                System.out.println(employees2DPreDefined[outerIndex][innerIndex]);
            }

        }

        String SEPARATOR = "-------------------------------------------------------";
        System.out.println(SEPARATOR);

        // OUTER_FOR(employees2DExtendable_length)
        for (int outerIndex = 0; outerIndex < employees2DExtendable.length; outerIndex++) {
            System.out.println("Outer index " + outerIndex);
            // INNER_FOR(employees2DExtendable_element_length)
            for (int innerIndex = 0; innerIndex < employees2DExtendable[outerIndex].length; innerIndex++) {
                // nameOf2DArray[outerIndex][innerIndex]
                System.out.println("Inner index " + innerIndex);
                employees2DExtendable[outerIndex][innerIndex] = "Hello";
                System.out.println(employees2DExtendable[outerIndex][innerIndex]);
            }
        }

    }
}
