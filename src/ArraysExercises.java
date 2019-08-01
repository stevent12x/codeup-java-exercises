import java.lang.reflect.Array;
import java.util.Arrays;
public class ArraysExercises {

    public static Person[] addPerson(Person[] group, Person newMember) {
        Person[] newGroup = Arrays.copyOf(group, group.length + 1);
        newGroup[newGroup.length-1] = newMember;
        return newGroup;
    }


    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        Person steven = new Person("Steven");
        Person katelin = new Person("Katelin");
        Person tori = new Person("Tori");

        String[] personas = {steven.getName(), katelin.getName(), tori.getName()};
        System.out.println(personas);
        for (String person : personas) System.out.println(person);


//        Person[] people = new Person[3];
        Person[] people = {new Person("Steven"), new Person("Leo"), new Person("Tori")};

        Person[] newGroup = addPerson(people, new Person("Linda"));
        Arrays.toString(newGroup);


    }
}
