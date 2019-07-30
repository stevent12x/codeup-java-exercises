import java.util.Scanner;
public class MethodsExercises {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
//        return a*b;

        // Multiplication without the '*' operator //
//        double result = 0;
//        for (int i = 0; i < b; i++) {
//            result +=a;
//        }
//        return result;

        // Recursion Method //
        if (b <= 0) return 0;
        return a + multiply(a, b - 1);
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double modulus(double a, double b) {
        return a % b;
    }


    // check to see if a number is between min and max numbers //
    public static int getInteger(int min, int max) {
        int userInput;
        Scanner scanner = new Scanner(System.in);

//        do {
//            userInput = scanner.nextInt();
//            if (userInput >= min && userInput <= max) break;
//        } while (true);
//        return userInput;

        // recursive method //
        userInput = scanner.nextInt();
        if (userInput < min || userInput > max)
            return getInteger(1, 10);
        return userInput;
    }

    // Factorial //

    private static void getFactorial() {
        Scanner scanner = new Scanner(System.in);
        do {
            int fact = getInteger(1, 10);

            factorialChart(fact);

            System.out.println("Play again?");
            if (!scanner.nextLine().toUpperCase().contains("Y")) return;
        } while (true);
    }
    private static void factorialChart(int fact) {

    }


    public static void main(String[] args) {
        int a=16;
        int b=5;
        System.out.println(multiply(a,b));
        System.out.println(subtract(a,b));
        System.out.println(add(a,b));
        System.out.println(divide(a,b));
        System.out.println(modulus(a,b));

        System.out.println("Enter a number between 1 and 10");
        int userInput = getInteger(1, 10);

        getFactorial();
    }

}
