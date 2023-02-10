public class ControlFlowExercises {
    public static void main(String[] arg){
//    Integer i=5;
//        System.out.println(i);
//        while (i<=15){
//            System.out.println("i is " + i);
//            i++;
//        }
    long o=2;
//        System.out.println(o);
        do{
            System.out.println("o is "+ o);
           o *= o;
        }while (o<=1000000);

        for(long y=2; y<100000;y*=y){
            System.out.println("y is: " +y);
        }
    }
}
