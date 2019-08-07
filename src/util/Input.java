package util;
import java.util.Scanner;

public class Input {

    public Scanner scanner;
    public Input() {this.scanner = new Scanner(System.in); }

    public String getString() {
        System.out.println("Enter a string");
        String userInput = this.scanner.nextLine();
        return userInput;
    }

    public boolean yesOrNo() {
        System.out.println("Enter yes or no");
        String userInput = this.scanner.nextLine();
        do {
            if (userInput.toUpperCase().contains("Y")) {
                return true;
            } else {
                return false;
            }
        } while (true);
    }

    public int getInt(int min, int max) {
        do {
            System.out.printf("Enter a number between %s and %s \n", min, max);
            String userInput = this.scanner.nextLine();
            int realAnswer;
            try {
                realAnswer = Integer.valueOf(userInput);
            } catch (NumberFormatException e) {
                continue;
            }
            if (realAnswer >= min && realAnswer <= max) {
                return realAnswer;
            }
        } while (true);
    }
    public double isDouble() {
        do {
            System.out.println("Enter a double");
            String userInput = this.scanner.nextLine();
            double realAnswer;
            try {
                realAnswer = Double.valueOf(userInput);
            } catch (NumberFormatException e) {
                continue;
            }
            return realAnswer;
        } while (true);
    }

    public double getDouble(double min, double max) {
        do {
            System.out.printf("Enter a double between %s and %s \n", min, max);
            String userInput = this.scanner.nextLine();
            double realAnswer;
            try {
                realAnswer = Double.valueOf(userInput);
            } catch (NumberFormatException e) {
                continue;
            }
            if (realAnswer >= min && realAnswer <= max) {
                return realAnswer;
            }
        } while (true);
    }

    public static void main(String[] args) {
        Input input = new Input();
        input.getDouble(3,100);
        input.isDouble();

    }
}






