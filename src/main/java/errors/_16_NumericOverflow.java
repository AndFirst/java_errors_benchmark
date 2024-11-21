package errors;

public class _16_NumericOverflow {
    /*
    Error 16
    Numeric Overflow
     */
    public static void main(String[] args) {
        /*
        Expected:
            1,000,000,000,000
        Received:
            -727,379,968
         */
        int number = 1_000_000;
        int result = number * number;

        System.out.printf("%,d%n", result);
    }
}