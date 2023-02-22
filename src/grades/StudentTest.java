package grades;

import java.util.Collections;

public class StudentTest {
    public static void main(String[] args) {
//        Student student1=new Student("johnny", Collections.singletonList(80));
//        student1.addGrade(100);
//        student1.addGrade(30);
//        System.out.println(student1.getGradeAverage());
Student student= new Student("johnny");
student.addGrade(70);
student.addGrade(80);
student.addGrade(90);
        System.out.println(student.getName());
    }
}
