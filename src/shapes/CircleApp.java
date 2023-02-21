package shapes;
import  util.Input;

public class CircleApp {
    public static void main(String[] args) {

        Input input = new Input();
        System.out.println("Enter the radius of the circle:");
        int radius = input.getInt();
        Circle circle= new Circle(radius);
        System.out.println("The radius you entered is: " + radius);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
}
    }
