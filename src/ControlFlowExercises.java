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
        System.out.print("Would you like to continue? y/n?");
        String yesOrNo = scanner.next();
        if (yesOrNo.equalsIgnoreCase("y")) {
            System.out.print(" number     | squared     | cubed \n");
            for (int s = userInput; s <= userInput*2; s+=1) {
                System.out.format("     %s      |     %s      |     %s     \n", s, (s*s), (s*s*s));
            }
        } else {
            System.out.println("All done");
        }
    }
}
;