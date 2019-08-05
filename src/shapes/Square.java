package shapes;

public class Square extends Quadrilateral{

    protected Square(double side) {
        super(side, side);
    }
    public void setLength(){}
    public void setWidth(){}
    public double getPerimeter() {
        return 4* this.length;
    }
    public double getArea() {
        return this.width * this.width;
    }
}
