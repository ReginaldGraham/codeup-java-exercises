import java.util.Random;

public class ServerNameGenerator {

//    public static void Array(String[] arg){
     public static String [] nouns={"car","house","boat","table","chair","bed","stove","microwave", "fridge","tv"};
    public static String [] adjectives={"cool","smooth","sleek","robust","candid","neat","tiring","tall","short","hot"};
//    public Random random=new Random();
//    }

//               TEACHERS CODE
public static String returnRandomElement(String[] str){
  int randomIndex = (int) (Math.random()* str.length);
    return str[randomIndex];
}
   public static String GenerateRandomSeverNAme() {
            String RandomNouns = returnRandomElement(nouns);
            String RandomAdjectives = returnRandomElement(adjectives);
            System.out.printf("%s-%s", RandomAdjectives, RandomNouns);
            return "j";
        };



    public static void main(){
        System.out.println("hi");
//    public String getRandomElement(String[] array){
//        int index = random.nextInt(array.length);
//        return array[index];
//    }
//public static String randomString(){
//       double randomNouns=Math.floor(Math.random()*10+1);
//       double randomAdjectives=Math.floor(Math.random()*10+1);
//        return ;
//}
//        ServerNameGenerator generator=new ServerNameGenerator();
//        String serverName= generator.getRandomElement(generator.adjectives)+""+ generator.getRandomElement(generator.nouns);
//        System.out.println("Your server name is:%n "+serverName);
}
}
