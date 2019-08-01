package movies;

import java.util.Scanner;

public class MoviesApplication{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println
                ("What would you like to do?\n\n" +
                        "0  -  Exit\n" +
                        "1  -  View all Movies\n" +
                        "2  -  View all Animated Movies\n" +
                        "3  -  View all Drama Movies\n" +
                        "4  -  View all Horror Movies\n" +
                        "5  -  View all SciFi Movies\n\n" +
                        "Enter Your Choice: ");
        String userInput = scanner.nextLine();

        if (userInput.equalsIgnoreCase("1")) {
        }
    }
}
