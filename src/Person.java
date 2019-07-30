class Person {
    private String name;

        // returns the person's name
        public String getName() {
            return name;
        }
        // changes the name property to the passed value
        public void setName (String name) {
            this.name = name;
        }
        // prints a message to the console using the person's name
         public void sayHello () {
            System.out.printf("Hello from %s %n", name);
        }

        private Person (String n) {}

        public static void main(String[] args) {
            Person steve = new Person("Steve");
            steve.name = "Steven";
            steve.setName("Karen");
            System.out.println(steve.getName());
            steve.sayHello();
//
//            Person person1 = new Person("John");
//            Person person2 = new Person("John");
//            System.out.println(person1.getName().equals(person2.getName()));
//            System.out.println(person1 == person2);

//            Person person1 = new Person("John");
//            Person person2 = person1;
//            System.out.println(person1 == person2);

            Person person1 = new Person("John");
            Person person2 = person1;
            System.out.println(person1.getName());
            System.out.println(person2.getName());
            person2.setName("Jane");
            System.out.println(person1.getName());
            System.out.println(person2.getName());
        }
    }

