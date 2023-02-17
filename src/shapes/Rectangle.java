package shapes;

public class Rectangle {

    protected int  length;

    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getPerimeter(){

    int perimeter = 2 * this.length + 2 * this.width;
    return perimeter;
    };
    public int getArea(){
        int area = this.length * this.width;
        return area;
    }

//    public static void main(String[] args) {
//        System.out.println(getArea(2,2));
//        System.out.println(getPerimeter(2,2));
//    }

}
