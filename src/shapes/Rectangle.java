package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }
    public double setLength(double length) {
        return this.length;
    }
    public double setWidth(double width) {
        return this.width;
    }
    public double getPerimeter() {
        return length*2 + width*2;
    }
    public double getArea() {
        return length*width;
    }
}
