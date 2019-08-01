import java.lang.reflect.Array;
import java.util.Arrays;

public class SANDBOX {
    public static void main(String[] args) {

    class Person {
        private String name;
        public Person(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
    class SuperHero extends Person {
        private String alterEgo;
        public SuperHero(String name, String alterEgo) {
            super(name);
            this.alterEgo = alterEgo;
        }
        public String getName() {
            return alterEgo;
        }
        public String getSecretIdentity() {
            return super.getName();
        }
    }
    class SuperVillain extends Person {
        private String alterEgo;
        public SuperVillain(String name, String alterEgo) {
            super(name );
            this.alterEgo = alterEgo;
        }
        public String getName() {
            return alterEgo;
        }
        public String getSecretIdentity() {
            return super.getName();
        }
    }


        SuperVillain drButtStuff = new SuperVillain("Brad", "Dr. Butt Stuff");

        System.out.printf("Oh no! It's %s!\n", drButtStuff.getName());
        System.out.printf("Oh wait, it's just %s.", drButtStuff.getSecretIdentity());
    }
}
