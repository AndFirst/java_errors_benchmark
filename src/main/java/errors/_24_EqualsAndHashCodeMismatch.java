package errors;

import java.util.Locale;

public class _24_EqualsAndHashCodeMismatch {
    /*
    Error 24
    Equals And HashCode Mismatch
     */
    public static void main(String[] args) {
        /*
        Expected:
            true
            true
        Received:
            false
            true
         */
        Person person1 = new Person("John", 30);
        Person person2 = new Person("john", 30);
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode() == person2.hashCode());
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int hashCode() {
            return name.toLowerCase(Locale.ROOT).hashCode() + age;
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
            return age == person.age && name.equals(person.name);
        }
    }
}