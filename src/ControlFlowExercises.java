

public class ControlFlowExercises {
    public static void main(String[] args) {
        long i = 2;
        do {
            System.out.println(i*=i);
        } while (i < 65536);
    }
}
;