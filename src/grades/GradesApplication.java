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
        patrick.addGrade(24);patrick.addGrade(51);patrick.addGrade(63);patrick.addGrade(30);patrick.addGrade(27);patrick.addGrade(3);patrick.addGrade(53);
        /* Sandy */
        sandy.addGrade(101);sandy.addGrade(99);sandy.addGrade(105);sandy.addGrade(100);sandy.addGrade(100);sandy.addGrade(99);sandy.addGrade(98);sandy.addGrade(93);
        /* Steven */
        steven.addGrade(89);steven.addGrade(93);steven.addGrade(75);steven.addGrade(96);steven.addGrade(85);steven.addGrade(95);steven.addGrade(98);
        /*Katie */
        katie.addGrade(92);katie.addGrade(97);katie.addGrade(100);katie.addGrade(96);katie.addGrade(88);katie.addGrade(96);katie.addGrade(100);katie.addGrade(91);

        // Adding New Students to students Hash Map
        students.put(patrick.getGitHubUN(), patrick);
        students.put(sandy.getGitHubUN(), sandy);
        students.put(steven.getGitHubUN(), steven);
        students.put(katie.getGitHubUN(), katie);

        // Print github usernames

        boolean keepGoing = true;

        while (keepGoing) {

            for (String student : students.keySet()) {
                System.out.println("\ngitHub username = " + student);
            }
            System.out.println("\nWhich user would you like to know more about? [Enter student Username to see info about a specific student, 'See All' to see all student grades, or 'Quit' to stop.]");
            String userInput = scanner.nextLine();

            for (String student : students.keySet()) {
                String studentName = students.get(student).getName();
                String studentGrades = students.get(student).getGrades();
                Double studentGradeAvg = students.get(student).getGradeAverage();

                if (userInput.equalsIgnoreCase("Quit")) {
                    System.out.println("Bye bye.");
                    keepGoing = false;
                    break;
                } else if (userInput.equalsIgnoreCase(student)) {
                    System.out.printf(studentName + "'s grades are: " + studentGrades + ", for a GPA of : %.5s\n\n", studentGradeAvg);
                } else if (userInput.equalsIgnoreCase("see all")) {
                    System.out.println(studentName + " = " + studentGrades);
                } else if (userInput != student || !userInput.equalsIgnoreCase("see all")) {
                    System.out.printf("");
                }
            }
        }
    }
}
