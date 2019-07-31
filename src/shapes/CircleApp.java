package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input scanOne = new Input();

        // remember to save the value from the scan to a new object!!!! //
        double radiusOne = scanOne.getDouble();
        Circle circleOne = new Circle(radiusOne);

        System.out.printf("The area of the new circle is : %.3f \nThe circumference of the new circle is : %.3f", circleOne.getArea(), circleOne.getCircumference());
    }
}
