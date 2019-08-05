package grades;
import java.lang.reflect.Array;
import java.util.ArrayList;

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
    public String getGitHubUN() {
        return gitHubUN;
    }
    public String getGrades(){
        return grades.toString();
    }


    public static void main(String[] args) {
        Student patrick = new Student("Starfish", "Patrick", "psHDFW");
        Student sandy = new Student("Cheeks", "Samantha", "CheekyTime29");
        Student steven = new Student("Turner", "Steven", "stevent12x");
        Student katie = new Student("Wise", "Katelin", "ClaireBear07");

        patrick.addGrade(24);patrick.addGrade(51);patrick.addGrade(63);patrick.addGrade(30);
        sandy.addGrade(101);sandy.addGrade(99);sandy.addGrade(105);sandy.addGrade(100);
        steven.addGrade(89);steven.addGrade(93);steven.addGrade(75);steven.addGrade(96);
        katie.addGrade(92);katie.addGrade(97);katie.addGrade(100);katie.addGrade(96);

        System.out.println("katie.getGrades() = " + katie.getGrades());
    }
}
