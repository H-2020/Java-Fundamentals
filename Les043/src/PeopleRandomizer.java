import java.util.Random;

public class PeopleRandomizer {

    public static void main(String[] args) {

        // 10 people with Full Name
        // generate ID numbers between 1000 and 9999

        String[] people = new String[10];
        people[0] = "Yilmaz Mustafa";
        people[1] = "Sameerun Acchukatla";
        people[2] = "Irina Afanassenko";
        people[3] = "Joey De Kort";
        people[4] = "Ahmed Faqiri";
        people[5] = "Rahime Yildiz";
        people[6] = "Hilal Demir";
        people[7] = "Sinan Hubeyb Cam";
        people[8] = "Alexandru Tudorache";
        people[9] = "Ali Jamal Alwasseti";

        for (int index = 0; index < people.length; index++) {
            System.out.println(people[index]);
        }

        Random randomizer = new Random();

        // RANDOM_BETWEEN_1000_AND_9999
        int min = 1000;
        int max = 9999;

        for (int index = 0; index < people.length; index++) {

            // GENERATE_RANDOM_NUMBER_BETWEEN_1000_AND_9999
            int randomID = randomizer.nextInt(max);
            if (randomID < min) {
                randomID += min;
            }

            // APPEND_ID_NUMBER_TO_PERSON
            String fullName = people[index];
            people[index] = randomID + ": " + fullName;
        }

        String SEPARATOR = "--------------------------------------------------------";

        System.out.println(SEPARATOR);

        // FOR(PEOPLE_LENGTH)
        for (int index = 0; index < people.length; index++) {
            // PRINT -> person
            System.out.println(people[index]);
        }

        // FOR(PEOPLE_LENGTH)
        for (int index = 0; index < people.length; index++) {
            // APPEND_EXTRA_INFO_TO_PERSON
            if (people[index].contains("Yilmaz Mustafa")) {
                people[index] = people[index] + " is an instructor";
            } else {
                people[index] = people[index] + " is a student";
            }
        }

        System.out.println(SEPARATOR);

        // FOR(PEOPLE_LENGTH)
        for (int index = 0; index < people.length; index++) {
            // PRINT -> person with extra info
            System.out.println(people[index]);
        }

    }

}
