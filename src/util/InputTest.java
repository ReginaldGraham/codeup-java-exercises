package util;


public class InputTest {

    public static void main(String[] args) {
        Input input= new Input();

        System.out.println("hello?");
        String userInput= input.getString();
        System.out.printf("whats up? %s", userInput);

    }
}
