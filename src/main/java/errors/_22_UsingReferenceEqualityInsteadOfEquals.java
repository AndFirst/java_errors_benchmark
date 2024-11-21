package errors;

public class _22_UsingReferenceEqualityInsteadOfEquals {
    /*
    Error 22
    Using Reference Equality Instead Of Equals
     */
    public static void main(String[] args) {
        /*
        Expected:
            true
        Received:
            false
         */
        Integer num1 = 1024;
        Integer num2 = 1024;
        System.out.println(num1 == num2);
    }
}