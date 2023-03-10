package shapes;

public class Square extends Quadrilateral{

    public Square(int length) {
        super(length, length);
    }

    @Override
    public void setLength(int length) {
    this.length=length;
    setWidth(length);
    }

    @Override
    public void setWidth(int width) {
        this.width=width;
        setLength(width);
    }

    @Override
    public double getPerimeter() {

        return length*4;
    }

    @Override
    public double getArea() {

        return length*length;
    }
}
