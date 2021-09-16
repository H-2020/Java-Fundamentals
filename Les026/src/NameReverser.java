public class NameReverser {

    public static void main(String[] args) {
        String standardText = "Yilmaz";

        // Step 1 : charIndex = 0, recentCharacter = Y
        // Step 2 : charIndex = 1, recentCharacter = i
        // Step 3 : charIndex = 2, recentCharacter = l
        // Step 4 : charIndex = 3, recentCharacter = m
        // Step 5 : charIndex = 4, recentCharacter = a
        // Step 6 : charIndex = 5, recentCharacter = z

        System.out.println("The length of the standard text is " + standardText.length());
        int charLength =standardText.length();
        for (int charIndex = 0; charIndex < standardText.length(); charIndex++) {
            char recentCharacter = standardText.charAt(charLength-charIndex);
            // Step 1 : charIndex = 0, recentCharacter = char index  6-0
            // Step 2 : charIndex = 1, recentCharacter = char index  6-1
            // Step 3 : charIndex = 2, recentCharacter = char index
            // Step 4 : charIndex = 3, recentCharacter = char index
            // Step 5 : charIndex = 4, recentCharacter = char index
            // Step 6 : charIndex = 5, recentCharacter =char index
            System.out.println(recentCharacter);
        }


        for (int charIndex = standardText.length(); charIndex >= 0; charIndex--) {
            System.out.println("index of the character " + charIndex);
        }

    }
}
