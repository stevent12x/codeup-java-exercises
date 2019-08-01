package shapes;

public class Rectangle {
    protected long length;
    protected long width;

    public Rectangle(long length, long width) {
        this.length = length;
        this.width = width;
    }

    public long getArea(long length, long width) {
        long area = length * width;
        return area;
    }

    public long getPerimeter(long length, long width) {
        long perimeter = 2*length + 2*width;
        return perimeter;
    }
}
