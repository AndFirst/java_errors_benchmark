package errors;

public class _15_StaticFieldDeclaration {
    /*
    Error 15
    Static Field Declaration
     */

    private static String name;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        /*
        Expected:
            John
            Kate
        Received:
            Kate
            Kate
         */
        _15_StaticFieldDeclaration person1 = new _15_StaticFieldDeclaration();
        _15_StaticFieldDeclaration person2 = new _15_StaticFieldDeclaration();

        person1.setName("John");

        person2.setName("Kate");

        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}