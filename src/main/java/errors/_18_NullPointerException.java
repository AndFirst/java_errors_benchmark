package errors;

public class _18_NullPointerException {
    /*
    Error 18
    Null Pointer Exception
     */

    static class Person {
        private String name;

        public Person(String name) {
            // OMG I forgot to initialize the name field
        }

        String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        /*
        Expected:
            4
        Received:
            NullPointerException
         */

        Person person = new Person("John");
        System.out.println(person.getName().length());
    }
}