package errors;

public class _03_ImplicitTypeConversion {
    /*
    Error 03
    Implicit Type Conversion
     */
    public static void main(String[] args) {
        /*
        expected: null
        received: NullPointerException
         */
        System.out.println(valueOrZero(true, null));

    }

    private static Double valueOrZero(boolean condition, Double value) {
    /*
     Due to Java's type conversion rules for conditional expressions,
     this method will throw NullPointerException if condition is true and value is null.
     This happens because the ternary operator implicitly unboxes the Double value, even when returning it unchanged.
     conversion:

     value.doubleValue() -> compare to 0.0 (both primitive double) -> Double.valueOf(value)
    */
        return condition ? value : 0.0;
    }
}
