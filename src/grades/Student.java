package grades;
import java.util.ArrayList;

// Student Class
public class Student {
    // Student Properties
    private String firstName;
    private String lastName;
    private ArrayList<Integer> grades;

    // Student Constructor
    public Student(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = new ArrayList<>();
    }

    // Student Methods
    public String getName(){
        return firstName + " " + lastName;
    }
    public void addGrade(int grade) {
        grades.add(grade);
    }
    public double getGradeAverage() {
        double gradeAverage = 0;
        for (Integer grade : grades) {
            gradeAverage += grade;
        }
        return (gradeAverage/grades.size());
    }


    public static void main(String[] args) {
        Student patrick = new Student("Starfish", "Patrick");
        Student sandy = new Student("Cheeks", "Samantha");
        Student steven = new Student("Turner", "Steven");
        Student katie = new Student("Wise", "Katelin");
    }
}
