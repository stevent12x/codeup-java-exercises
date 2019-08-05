package grades;
import java.util.ArrayList;

// Student Class
public class Student {
    // Student Properties
    private String firstName;
    private String lastName;
    private ArrayList grades;

    // Student Constructor
    public Student(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = new ArrayList<>();
    }

    // Student Methods
    public String getName(){
        return firstName + ", " + lastName;
    }
    public void addGrade(int grade) {
        grades.add(grade);
    }
    public double getGradeAverage() {
        int gradeAverage = 0;
        for (int i = 0; i<grades.size(); i++) {
            grades[i] += gradeAverage;
        }
        return (gradeAverage/grades.size());
    }
}
