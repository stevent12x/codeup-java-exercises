class Person {
    private String name;

        // returns the person's name
        public String getName() {
            return this.name;
        }
        // changes the name property to the passed value
        public void setName (String name) {
            this.name = name;
        }
        // prints a message to the console using the person's name
         public void sayHello () {
            System.out.printf("Hello from %s \n\n", name);
        }

        public Person (String name) {
            this.name = name;
        }

        public static void main(String[] args) {
            Person steven = new Person("Steve");
            System.out.println(steven.getName());
            steven.sayHello();
            steven.setName("Cody the Duck");
            steven.sayHello();
//
//            Person person1 = new Person("John");
//            Person person2 = new Person("John");
//            System.out.println(person1.getName().equals(person2.getName()));
//            System.out.println(person1 == person2);

//            Person person1 = new Person("John");
//            Person person2 = person1;
//            System.out.println(person1 == person2);

//            Person person1 = new Person("John");
//            Person person2 = person1;
//            System.out.println(person1.getName());
//            System.out.println(person2.getName());
//            person2.setName("Jane");
//            System.out.println(person1.getName());
//            System.out.println(person2.getName());
        }
    }

