package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable r3ctangl3 = new Rectangle(5, 5);
        Measurable sqAuar3 = new Square(15, 15);

        System.out.println("rectangle perimeter = " + r3ctangl3.getPerimeter());
        System.out.println("rectangle area = " + r3ctangl3.getArea());

        System.out.println("square perimeter= " + sqAuar3.getPerimeter());
        System.out.println("square area = " + sqAuar3.getArea());
    }
}