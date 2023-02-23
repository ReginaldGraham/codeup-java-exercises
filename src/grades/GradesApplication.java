package grades;

import java.util.*;

public class GradesApplication {
    public static Map<String,Student> createStudents(){
        HashMap<String,Student> students= new HashMap<>();
        Student s1 = new Student("student1");
        s1.addGrade(50);
        s1.addGrade(100);
        s1.addGrade(100);

        Student s2 = new Student("student2");
        s2.addGrade(70);
        s2.addGrade(20);
        s2.addGrade(60);

        Student s3 = new Student("student3");
        s3.addGrade(89);
        s3.addGrade(70);
        s3.addGrade(46);

        Student s4 = new Student("student4");
        s4.addGrade(80);
        s4.addGrade(10);
        s4.addGrade(77);

        students.put("user1", s1);
        students.put("user2", s2);
        students.put("user3", s3);
        students.put("user4", s4);
        return students;
    }
    public static void displayUser(Student student, String username){
        System.out.printf("Name: %s - GitHub Username: %s%nCurrent Average: %f", student.getName(), username, student.getGradeAverage());
    }
    public static void displayUsernames(List<String>usernames){
        System.out.println("here are the github usernames of our students:");
        String outputOfUSernames="";
        for (String username : usernames){
            outputOfUSernames+=String.format("|%s| ",username);
        }
        System.out.println(outputOfUSernames);
    }
    public static void main(String[] args) {
        System.out.println("welcome!\n");
Map<String, Student> students = createStudents();
        Scanner sc =new Scanner(System.in);

        List<String> usernames = new ArrayList<>(students.keySet());
        displayUsernames(usernames);

        System.out.println("What student would you like to see more information on?\n");
        String username = sc.nextLine();
        Student student=students.get(username);
        displayUser(student,username);



    }
}
