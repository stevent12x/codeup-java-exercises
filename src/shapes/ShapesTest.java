package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Rectangle(5, 5);
        Measurable myShape2 = new Square(15, 15);

        System.out.println("myShapePerimeter = " + myShape.getPerimeter());
        System.out.println("myShapeArea = " + myShape.getArea());

        System.out.println("myShape2.getPerimeter = " + myShape2.getPerimeter());
        System.out.println("myShape2.getArea = " + myShape2.getArea());
    }
}