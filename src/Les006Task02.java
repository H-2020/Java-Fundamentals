public class Les006Task02 {

    public static void main(String args[]) {


        System.out.println("Hello Java");

        // Definieer kleurconstanten
        String TEXT_RESET = "\u001B[0m";
        String TEXT_BLACK = "\u001B[30m";
        String TEXT_RED = "\u001B[31m";
        String TEXT_GREEN = "\u001B[32m";
        String TEXT_YELLOW = "\u001B[33m";
        String TEXT_BLUE = "\u001B[34m";
        String TEXT_PURPLE = "\u001B[35m";
        String TEXT_CYAN = "\u001B[36m";
        String TEXT_WHITE = "\u001B[37m";


        // Implementatie
        System.out.println(TEXT_BLUE + "Hello Java" + TEXT_RESET);
        System.out.println(TEXT_BLUE + "HILAL" + TEXT_RESET);
        System.out.println(TEXT_GREEN + "DEMIR" + TEXT_RESET);
        System.out.println(TEXT_RED + "ONTWIKKELAAR" + TEXT_RESET);
    }
}
