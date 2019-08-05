package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {

        // New Hash Map
        HashMap<String, Student> students = new HashMap<>();

        //New Scanner

        Scanner scanner = new Scanner(System.in);

        // New Students
        Student patrick = new Student("Starfish", "Patrick", "psHDFW");
        Student sandy = new Student("Cheeks", "Samantha", "CheekyTime29");
        Student steven = new Student("Turner", "Steven", "stevent12x");
        Student katie = new Student("Wise", "Katelin", "ClaireBear07");

        // Student Grades
        /* Patrick */
        patrick.addGrade(24);
        patrick.addGrade(51);
        patrick.addGrade(63);
        patrick.addGrade(30);
        /* Sandy */
        sandy.addGrade(101);
        sandy.addGrade(99);
        sandy.addGrade(105);
        sandy.addGrade(100);
        /* Steven */
        steven.addGrade(89);
        steven.addGrade(93);
        steven.addGrade(75);
        steven.addGrade(96);
        /*Katie */
        katie.addGrade(92);
        katie.addGrade(97);
        katie.addGrade(100);
        katie.addGrade(96);

        // Adding New Students to students Hash Map
        students.put(patrick.getGitHubUN(), patrick);
        students.put(sandy.getGitHubUN(), sandy);
        students.put(steven.getGitHubUN(), steven);
        students.put(katie.getGitHubUN(), katie);

        System.out.println("students.keySet() = " + students.keySet());

        // Print github usernames

        boolean keepGoing = true;

        while (keepGoing) {

            System.out.println("gitHub usernames = " + students.keySet());
            System.out.println("Which user would you like to know more about? [Enter Username or 'Quit' to stop.]");
            String userInput = scanner.nextLine();

            for (String student : students.keySet()) {
                if (userInput.equalsIgnoreCase("Quit")) {
                    System.out.println("Bye bye.");
                    keepGoing = false;
                    break;
                } else if (userInput.equalsIgnoreCase(student)) {
                    System.out.println(students.get(student).getName() + "'s grades are: " + students.get(student).getGrades() + ", for a GPA of : " + students.get(student).getGradeAverage() + "\n\n");
                } else if (userInput != student) {
                    System.out.printf("");
                }
            }
        }
    }
}
