import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Want to talk to Bob?");
        String userInput = scanner.next();
        while (userInput.length() > 1) {
            System.out.println("What would you like to say to Bob?");
            String userResponse = scanner.next();

            if (userResponse.endsWith("?")) {
                System.out.println("Sure.");
            } if (userResponse.endsWith("!")) {
                System.out.println("Woah, chill out!");
            } if (userResponse.equals("")) {
                System.out.println("Fine, be that way.");
            }
        }
    }
}
