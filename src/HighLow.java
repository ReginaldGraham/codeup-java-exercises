import java.util.Scanner;

public class HighLow {
    public static void main(String[] arg){

    Scanner userPick=new Scanner(System.in);
        double ranNumber= Math.floor(Math.random()*100+1);
//        System.out.println(ranNumber);
        for (int i=1;i<6;i++){
        System.out.println("pick a number between 1 and 100");
        int number = userPick.nextInt();
            if(number == ranNumber){
                System.out.println("you win!!!");
                break;
            }
            else if(number != ranNumber && i<5 && number >ranNumber){
                int chances= 5-i;
                System.out.println("Lower");
                System.out.printf("you have %s chances left.%n",chances);
            }
            else if(number != ranNumber && i<5 && number < ranNumber){
                int chances= 5-i;
                System.out.println("Higher");
                System.out.printf("you have %s chances left.%n", chances);
            }
            else{
                System.out.println("you lost");
                System.out.println(ranNumber);
            }
        }
    }

}
