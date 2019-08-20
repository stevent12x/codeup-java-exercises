import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Codeup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something");
        String userInput = scanner.nextLine();
        System.out.println("You entered " + userInput);
        if (StringUtils.isNumeric(userInput) == false) {
            System.out.println(userInput + " is not a number.");
        } else {
            System.out.println(userInput + " is a number");
        }
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));
    }
}
