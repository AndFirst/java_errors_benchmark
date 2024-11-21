package errors;

public class _23_MalformedEqualsImplementation {
    /*
    Error 23
    Malformed Equals Implementation
     */
    public static void main(String[] args) {
        /*
        Expected:
            false
        Received:
            true
         */
        Person p1 = new Person("John", 25);
        Person p2 = new Person("Kate", 25);

        System.out.println(p1.equals(p2));
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Person person = (Person) obj;
            return age == person.age && name.equals(name);
        }
    }
}