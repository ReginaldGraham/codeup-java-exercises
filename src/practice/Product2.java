package practice;

public class Product2 {
    private String name;
    private int priceInCents;

    public Product2(String names, int cents){
        name=names;
        priceInCents=cents;
    }

public static double findAverage(Product2[] product2s){
       int sum=0;
for(Product2 product2 : product2s){
    sum+=product2.priceInCents;
}
    return sum/ product2s.length;
        }
public static void main(String[] arg){
    Product2[] product2s={
      new Product2("graham",100),
      new Product2("dest", 50),
      new Product2("mig", 1000)
    };
    double average=findAverage(product2s);
    System.out.println(average);
        }
};
