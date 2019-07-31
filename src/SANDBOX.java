import java.lang.reflect.Array;
import java.util.Arrays;

public class SANDBOX {
    public static void main(String[] args) {

    String[] beatles = new String[4];
    beatles[0] = "John";
    beatles[1] = "George";
    beatles[2] = "Ringo";
    beatles[3] = "Paul";

    for (String beatle : beatles) {
        System.out.println(beatle);
        }

    String[] ourNewArray = Arrays.copyOf(beatles, 8);
        for (String item : ourNewArray)
            System.out.println(item);
    }
}
