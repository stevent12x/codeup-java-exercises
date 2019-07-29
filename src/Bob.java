import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to say to Bob?");

        boolean talking = true;
        do {

            String userQuestion = scanner.nextLine();

            if (userQuestion.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userQuestion.endsWith("!")) {
                System.out.println("Woah, chill out!");
            } else if (userQuestion.isEmpty()) {
                System.out.println("Fine, be that way.");
            } else if (userQuestion.equalsIgnoreCase("bye") || userQuestion.equalsIgnoreCase("bye.")) {
                System.out.println("Peace out.");
                talking = !true;
            } else {
                System.out.println("Whatever...");
            }
        } while (talking);
    }
};
