package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
       scanner=new Scanner(System.in);
    }
    public String getString(){
        return scanner.nextLine();
    };
   public boolean yesNo(){
String input= scanner.nextLine();
return input.equalsIgnoreCase("y") ||input.equalsIgnoreCase("yes");
   }
    int getInt(int min, int max){
        int value;
        do {
            System.out.print("Enter an integer between " + min + " and " + max + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter an integer between " + min + " and " + max + ": ");
                scanner.next();
            }
            value = scanner.nextInt();
        } while (value < min || value > max);
        scanner.nextLine(); // Consume the newline character
        return value;
    }
    int getInt(){
     return scanner.nextInt();
    }
    double getDouble(double min, double max){
        double value;
        do {
            System.out.print("Enter a decimal between " + min + " and " + max + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid input. Enter a decimal between " + min + " and " + max + ": ");
                scanner.next();
            }
            value = scanner.nextDouble();
        } while (value < min || value > max);
        scanner.nextLine(); // Consume the newline character
        return value;

    }
    double getDouble(){
       return scanner.nextDouble();
    }

}
