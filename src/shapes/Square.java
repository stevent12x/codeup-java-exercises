package shapes;

public class Square extends Quadrilateral{

    protected Square(double length, double width) {
        super(length, width);
    }
    public void setLength() {}
    public void setWidth() {}
    public double getPerimeter() {
        return length*2 + width*2;
    }
    public double getArea() {
        return length*width;
    }
}
