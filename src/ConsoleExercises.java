
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of Pi is approximately: %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter an integer");
        int userInt = scanner.nextInt();
        System.out.printf("You entered: --> \"" + userInt + "\" <--");
        System.out.printf("Enter 3 words please");
        String userWord1 = scanner.next();
        String userWord2 = scanner.next();
        String userWord3 = scanner.next();
        System.out.printf("You entered ==> \"" + userWord1 + " " + userWord2 + " " + userWord3 + "\" <==");

        System.out.printf("Enter a string now");
        String userInput = scanner.nextLine();
        System.out.printf("You entered ==> \"" + userInput + "\" <==");

        System.out.printf("Enter the length and width of a classroom");
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        System.out.printf("The Area of the room is ==> \"" + length*width + "\" <-- and the Perimeter of the room is ==> \"" + (length*2+width*2) + "\" <== ");
    }
}