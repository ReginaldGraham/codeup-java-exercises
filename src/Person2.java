public class Person2 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.printf("hello this is %s.%n" ,this.name);
    }


    public Person2(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person2 testName= new Person2("Reginald");

//        System.out.println(testName.getName());
//        testName.sayHello();
//        testName.setName("john");
//        System.out.println(testName.getName());



    }

}
