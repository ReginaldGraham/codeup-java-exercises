package shapes;

public class Circle {
    private int radius;

    public Circle(int radius){
        this.radius=radius;
    }
//    public double Circle(double radius){
//        return radius;
//    }

    public double getArea(){

                int area= (int) (Math.PI * (radius ^ 2));
        return area;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

}
