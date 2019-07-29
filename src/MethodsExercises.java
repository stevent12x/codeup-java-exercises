import java.util.Scanner;

public class MethodsExercises {
    //    public static int add(int a, int b) {
//        System.out.println(a + b);
//        return a+b;
//    }
//    public static  int subtract(int a, int b) {
//        System.out.println(a - b);
//        return a-b;
//    }
//    public static int multiply(int a, int b) {
//        System.out.println(a*b);
//        return a*b;
//    }
//    public static int divide(int a, int b) {
//        System.out.println(a/b);
//        return a/b;
//    }
//    public static int modulus(int a, int b) {
//        System.out.println(a%b);
//        return a%b;
//    }
//
//    public static void main(String[] args) {
//        multiply(5,6);
//        subtract(8,6);
//        add(8, 4);
//        divide(300, 50);
//        modulus(4,5);
//    }

    public static int getInteger(int min, int max, int userinput) {
        if (userinput == max || userinput == min) {
            System.out.println("All done!");
            return userinput;
        } else if (userinput > max || userinput < min) {
            System.out.println("Try again");
            return 0;
        } else {
            System.out.println("computing...");
        }
        return getInteger(min, max - 1, userinput);

    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        int userinput = scanner.nextInt();
//        getInteger(1, 10, userinput);
//    }

    public static void main(String[] args) {
        Scanner facScanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int userInput = facScanner.nextInt();
        int counter = 1;
        for (int i = 1; i <= userInput; i+=1) {
            counter++;
            System.out.println(i*(counter));
        }
    }
}
