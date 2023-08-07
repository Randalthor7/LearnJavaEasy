import java.util.Scanner;

public class Madlibs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String adj1 = "";
        String adj2 = "";
        String noun = "";
        String noun2 = "";
        String pastTen = "";
        String playAgain = "";

        do {
            System.out.println(" Welcome to Mad libs, please enter two adjectives, two nouns and a past tense verb.");

            System.out.println(" Please enter adjective 1:");
            adj1 = scan.next();

            System.out.println(" Please enter adjective 2: ");
            adj2 = scan.next();

            System.out.println(" Please enter noun 1:");
            noun = scan.next();

            System.out.println(" Please enter noun 2:");
            noun2 = scan.next();

            System.out.println(" Please enter past tense verb 1:");
            pastTen = scan.next();

            System.out.println("The " + adj1 + " " + noun + " " + pastTen + " the " + adj2 + " " + noun2);

            System.out.println(" Would you like to play again y/n? :");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));
        scan.close();
    }
}
