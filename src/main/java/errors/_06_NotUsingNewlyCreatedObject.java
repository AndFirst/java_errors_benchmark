package errors;

public class _06_NotUsingNewlyCreatedObject {
    /*
    Error 06
    Not Using Newly Created Object
     */
    public static void main(String[] args) {
        /*
        Expected:
            IllegalArgumentException
        Received:
            Value is positive or 0
         */
        int value = -1;
        process(value);
    }

    private static void process(int value) {
        if (value < 0) {
            new IllegalArgumentException("Value is negative");
        }
        System.out.println("Value is positive or 0");
    }
}

