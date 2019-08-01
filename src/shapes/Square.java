package shapes;

public class Square extends Rectangle{
    private long side;
    private long perimeter;
    private long area;

    public Square(long side) {
        super(side, side);
    }

    public long getPerimeter() {
        perimeter = 4*side;
        return perimeter;
    }

    public long getArea(){
        area = side*side;
        return area;
    }
}
