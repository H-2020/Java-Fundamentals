public class Herhalen {

    /* OP01 : if jokes contain offensive words, remove the joke and set it to null
              stupid, old, amateur, bad, kaka, koko, trump, edison, musk
    * */
    public static void main(String[] args) {


        //DECLARE AND INSTANTIATE AN ARRAY
        String[] jokes = new String[12];
        jokes[0] = "Why Java developers cannot work at nights? Because they cannot C#";
        jokes[1] = "Where's Elon Musk from? Mad at gas car..";
        jokes[2] = "What do you call a train carrying bubblegum? A chew-chew train";
        jokes[3] = "Why does C get all the girls, and Java gets none? Because C does not treat them as objects.";
        jokes[4] = "What did Stephen Hawking say when his computer crashed? Nothing";
        jokes[5] = "Did you hear about the Italian chef died ? He pasta-way";
        jokes[6] = "Why did the old man fall in the well? Because he couldn't see that well.";
        jokes[7] = "Why are Communists bad Java programmers? They don't like classes.";
        jokes[8] = "My wife beamed at me with pride and said, Wow! I never thought our son would go that far!" +
                "I said, “This catapult is amazing! Go get our daughter.”";
        jokes[9] = "Sinan heeft geen jokes";
        jokes[10] = "Stupid joke";
        jokes[11] = "An amateur joke";

        //FOR(JOKES)
        for (String joke : jokes) {
            System.out.println(joke);
        }
        String SEPERATOR="*********************************";
        System.out.println(SEPERATOR);

        //CREATE ->offensive words
        String[] offensiveWords = {
                "Stupid", "old", "amateur", "bad", "kaka", "koko", "trump", "edison", "musk", "intec"
        };
        //FOR_OUTER(JOKES_LENGTH)
        for(int outerIndex=0; outerIndex< jokes.length;outerIndex++){
            //FOR_INNER(OFFENSIVE_WORDS_LENGTH)
            for(int innerIndex=0; innerIndex< offensiveWords.length;innerIndex++){
                if(jokes[outerIndex].contains(offensiveWords[innerIndex])){
                    jokes[outerIndex]=" ";
                }
            }

        }
        for (String joke : jokes) {
            System.out.println(joke);
        }

    }
}