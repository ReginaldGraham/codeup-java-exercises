//public class Test {
//    public static void main(String[] args) {
//        System.out.println("Hello world");
//    }
//}

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] arg) {
//        double myDouble = 2;
//        float f = 2.4f;
//        System.out.println(myDouble);
//        System.out.println(f);
//        int seatSelection = '1' +'1';
//        System.out.print(seatSelection);
//        int myFavoriteNumber=7;
//        System.out.println(myFavoriteNumber);
//        String myString= "how do you do";
//        myString="3.14159";
//        System.out.println(myString);
//        float myNumber=3.14f;
//        System.out.println(myNumber);
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";
//        System.out.println(three);

//        int x = 4;
//        x = x + 5;
//
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y = y * x;

//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//
//        System.out.println(y);
//
//        byte xet = Byte.MAX_VALUE;
//        Object xetr = xet++;

//        System.out.println(xetr);
//
//
//        System.out.println("here");
//            int currencyPennies = 1000;
//            System.out.printf("I'll sell you swamp land for $%.2f an acre!", currencyPennies / 100.00);


//            import scanner

//        create scanner
        Scanner sc = new Scanner(System.in);


//        prompt user
        System.out.println("enter your age: ");

//        get age with scanner nextLine
       String userAge= sc.nextLine();
        System.out.println("enter your first name");
       String firstName=sc.next();
       System.out.println("what is your last name");
       String lastName=sc.next();

//        use sout to print out the user age plus 10
        System.out.printf("Your name is: %s %S and you will be %s",firstName,lastName, Integer.parseInt(userAge)+ 10);

//        System.out.println(Integer.parseInt(userAge) + 10);
        Scanner num = new Scanner(System.in);

        System.out.println("please enter your age: ");
        int age = num.nextInt();
        System.out.println(age);
    }


}


