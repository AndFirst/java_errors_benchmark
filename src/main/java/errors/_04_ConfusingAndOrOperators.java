package errors;

public class _04_ConfusingAndOrOperators {
    /*
    Error 04
    Confusing And Or Operators
     */
    public static void main(String[] args) {
        /*
        Expected:
            IllegalArgumentException
            1
            IllegalArgumentException
        Received:
            -1
            1
            256
         */
        System.out.println(validate(-1));
        System.out.println(validate(1));
        System.out.println(validate(256));
    }

    private static int validate(int value) {
        /*
        This method has to throw exception if argument is not in range [0-255].
        Developer made a mistake and && was used instead of ||.
        As a result method never throw an IllegalArgumentException
         */
        if (value < 0 && value > 255) {
            throw new IllegalArgumentException(
                    "value is out of range");
        }
        return value;
    }
}
