package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private List<Integer>studentGrades;

    public Student(String studentName) {
        this.studentName = studentName;
        this.studentGrades = new ArrayList<>();
    }
    // returns the student's name
    public String getName(){
        return studentName;
    };
    // adds the given grade to the grades property
    public void addGrade(int grade){
        studentGrades.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage(){
        int sumGrade=0;
        for(Object studentGrade:studentGrades ){
            sumGrade+=(int)studentGrade;
        }
       return sumGrade/studentGrades.size();
    };

    public static void main(String[] args) {
        System.out.println();
    }

}
