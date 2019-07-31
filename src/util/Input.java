package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Enter a string");
        String userInput = scanner.nextLine();
        return userInput;
    }
    public boolean yesOrNo() {
        System.out.println("Enter yes or no");
        String userInput = scanner.nextLine();
        do {
            if (userInput.toUpperCase().contains("Y")) {
                return true;
            } else {
                return false;
            }
        } while (true);
    }
    public int getInt(int min, int max) {
        int userInput;
        System.out.printf("Enter a number between %s and %s", min, max);
        do {
            userInput = scanner.nextInt();
            if (userInput >= min && userInput <= max) break;
        } while (true);
        return userInput;
    }
    public double getDouble(double min, double max) {
        double userInput;
        System.out.printf("Enter a number with decimals between %s and %s", min, max);
        do {
            userInput = scanner.nextDouble();
            if (userInput >= min && userInput <= max) break;
        } while (true);
        return userInput;
    }
    public double getDouble() {
        System.out.println("Enter a double");
        double userInput = scanner.nextDouble();
        return userInput;
    }


    public static void main(String[] args) {
        Input scan1 = new Input();


        scan1.yesOrNo();
    }
}

