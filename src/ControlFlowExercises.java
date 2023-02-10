import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] arg){
//    Integer i=5;
//        System.out.println(i);
//        while (i<=15){
//            System.out.println("i is " + i);
//            i++;
//        }
//    long o=2;
////        System.out.println(o);
//        do{
//            System.out.println("o is "+ o);
//           o *= o;
//        }while (o<=1000000);
//
//        for(long y=2; y<100000;y*=y){
//            System.out.println("y is: " +y);
//        }

        for(Integer r=1;r<100; r++){
            if(r % 3==0 && r % 5==0){
                System.out.println("fizzbuzz");
            }else if (r % 3==0){
                System.out.println("fizz");
            } else if (r % 5==0){
                System.out.println("buzz");
            }
            else{
                System.out.println(r);
            }
        }
        Scanner integer = new Scanner(System.in);
        System.out.println("enter an integer");
        Integer recordInt= integer.nextInt();
        System.out.print("Continue? [y/N]");
        String userInput = integer.next();
        boolean confirm = userInput.equals("y");
        if(confirm) {
            System.out.printf("number|squared|cubed %n");
            System.out.printf("------|-------|----- %n");
            for (Integer e = 1; e <= recordInt; e++) {
                Integer y = e * e;
                Integer w = e * e * e;
                System.out.printf("%-6s| %-6s| %-4s %n", e, y, w);
            }
        } else{}
//        Scanner grades = new Scanner(System.in);
//        System.out.println("Give me your grade between 0-100");
//        Integer grade= grades.nextInt();
//        System.out.printf("do you want to continue? [y/N]");
//        String decideGrade= grades.next();
//        boolean conGrade=decideGrade.equals("y");
//        if(conGrade){
//            if (grade >= 88) {
//                System.out.println("A");
//            } else if (grade < 88 && grade >= 80) {
//                System.out.println("B");
//            } else if (grade < 80 && grade >= 67) {
//                System.out.println("C");
//            } else if (grade < 67 && grade >= 60) {
//                System.out.println("D");
//            } else if (grade < 60 && grade >= 0) {
//                System.out.println("F");
//            } else {
//
//            }
//        }
//        else{
//
//        }


    }


}

