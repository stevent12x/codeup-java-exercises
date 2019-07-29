public class MethodsExercises {
    public static int add(int a, int b) {
        System.out.println(a + b);
        return a+b;
    }
    public static  int subtract(int a, int b) {
        System.out.println(a - b);
        return a-b;
    }
    public static int multiply(int a, int b) {
        System.out.println(a*b);
        return a*b;
    }
    public static int divide(int a, int b) {
        System.out.println(a/b);
        return a/b;
    }

    public static void main(String[] args) {
        multiply(5,6);
        subtract(8,6);
        add(8, 4);
        divide(300, 30);
    }
}
