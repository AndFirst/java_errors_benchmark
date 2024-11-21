package errors;

class Parent {
    public void onClick(String key) {
        System.out.println("Parent processing: " + key);
    }
}

class Child extends Parent {
    @Override
    public void onClick(String key) {
        System.out.println("Child processing: " + key);
    }
}

public class _14_MissingSuperclassCall {
    /*
    Error 14
    Missing Superclass Call
     */

    public static void main(String[] args) {
        /*
        Expected:
            Parent processing: key
            Child processing: key
        Received:
            Child processing: key
         */
        Child child = new Child();
        child.onClick("key");
    }
}