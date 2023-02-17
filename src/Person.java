import java.util.Arrays;

public class Person {
    private String name;

    public Person(String name){
        this.name=name;
    }


    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name=name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("say hello to %s",this.name);
    }
    public static void main(String[] arg){
        Person p= new Person("graham");
        p.sayHello();
        p.setName("johnny");
        p.sayHello();
        System.out.println( p.getName());
    }


//    public static Person[] addPerson(Person[] people, Person newperson){
//        Person[] newPeople= new Person[people.length+1];
//        for(int i=0; i< people.length; i++){
//            newPeople[i]=people[i];
//        }
//        newPeople[people.length]=newperson;
//        return newPeople;
//    }

    public static Person[] addPerson(Person[] people, Person person ){
        Person[] newpeopleArray = Arrays.copyOf(people, people.length+1);
        newpeopleArray[newpeopleArray.length-1]=person;
        return newpeopleArray;
    };

    public static Person[] addPersonAtFront(Person[] people, Person person ){
        Person[] newpeopleArray = Arrays.copyOf(people, people.length+1);
        for(int i =0;i< newpeopleArray.length; i+=1){
            Person currentPerson= newpeopleArray[i];

        }
        newpeopleArray[newpeopleArray.length-1]=person;
        return newpeopleArray;
    };


}

