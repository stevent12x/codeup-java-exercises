import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        System.out.print("Here is your Table!\n");
        System.out.print(" number     | squared     | cubed \n");
        for (int i = 1; i <= userInput; i+=1) {
            System.out.format("     %s      |     %s      |     %s     \n", i, (i*i), (i*i*i));
        }
        System.out.print("Would you like to continue? yes/no?");
        String yesOrNo = scanner.next();
        if (yesOrNo == "yes") {
            System.out.print(" number     | squared     | cubed \n");
            for (int y = userInput; y <= userInput*2; y+=1) {
                System.out.format("     %n      |     %n      |     %n     \n", y, (y*y), (y*y*y));
            }
        } else if (yesOrNo == "no") {
            System.out.println("All done");
        }
    }

}
;