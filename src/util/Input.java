package util;
import java.util.Scanner;

public class Input {
    public Scanner scanner;
    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String userInput = sc.nextLine();
        return userInput;
    }

    public boolean yesOrNo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yes or no");
        String userInput = sc.nextLine();
        do {
            if (userInput.toUpperCase().contains("Y")) {
                return true;
            } else {
                return false;
            }
        } while (true);
    }

    public static int getInt(int min, int max){
        int userInput = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.printf("Enter a number between %s and %s\n", min, max);
            do {
                userInput = Integer.valueOf(sc.nextLine());
                if (userInput >= min && userInput <= max)
                    return userInput;
            } while (true);
        } catch (NumberFormatException ex) {
            System.out.println("Number Format Exception - Must Enter Int!");
        } finally {
            System.out.println("Keep it up Buttercup!");
        } return userInput;
    }

    public static double getDouble() {
        double userInput = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a double");
             userInput = Double.valueOf(sc.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println("Number Format Exception! - Must enter Double!");
        } finally {
            System.out.println("You're doing great and you're super good looking to boot!");
        } return userInput;
    }

    public static void main(String[] args) {
        System.out.println("You're Double is: " + getDouble());
        System.out.println("You're Integer is " + getInt(1, 20));
    }
}

