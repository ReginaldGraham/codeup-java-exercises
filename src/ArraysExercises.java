import practice.Product2;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] arg) {


        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        Person[] personArray = new Person[3];

        personArray[0] = new Person("me");
        personArray[1] = new Person("myself");
        personArray[2] = new Person("i");

        for( Person persons : personArray){
            System.out.println(persons.getName());
        }

        Person newPerson = new Person("you");
        Person[] updatedPersonArray = Person.addPerson(personArray, newPerson);
        for (Person person : updatedPersonArray) {
            System.out.println(person.getName());
        }

    }
//    Needed to move it to Person.java for Person.addPerson to work

//    public static Person[] addPerson(Person[] people, Person newperson){
//        Person[] newPeople= new Person[people.length+1];
//        for(int i=0; i< people.length; i++){
//            newPeople[i]=people[i];
//        }
//        newPeople[people.length]=newperson;
//        return newPeople;
//    }
}


