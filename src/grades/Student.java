package grades;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import util.Input;

// Student Class
public class Student {
    // Student Properties
    private String firstName;
    private String lastName;
    private String gitHubUN;
    private ArrayList<Integer> grades;


    // Student Constructor
    public Student(String lastName, String firstName, String gitHubUN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gitHubUN = gitHubUN;
        this.grades = new ArrayList<>();
    }

    // Student Methods
    public String getName(){return this.firstName + " " + this.lastName;}
    public void addGrade(int grade) {
        this.grades.add(grade);
    }
    public double getGradeAverage() {
        double gradeAverage = 0;
        for (Integer grade : grades) {
            gradeAverage += grade;
        }
        return (gradeAverage/grades.size());
    }
    public String getGitHubUN() {
        return this.gitHubUN;
    }
    public String getGrades(){
        return this.grades.toString();
    }

}
