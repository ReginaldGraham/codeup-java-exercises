import java.util.Scanner;

public class Bob {
    public static void main(String[] arg){
        Scanner bobTalk = new Scanner(System.in);
        System.out.println("what do you want?");
        String bobResponse=bobTalk.next();
        if(bobResponse.endsWith("?")){
            System.out.println("sure");
        }
        else if(bobResponse.endsWith("!")){
            System.out.println("Whoa, chill out!");
        }
        else if(bobResponse.endsWith(" ")){
            System.out.println("Fine, be that way!");
        }
        else{
            System.out.println("Whatever");
        }
    }
}
