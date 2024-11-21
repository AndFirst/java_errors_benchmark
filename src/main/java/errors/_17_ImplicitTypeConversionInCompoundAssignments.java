package errors;

public class _17_ImplicitTypeConversionInCompoundAssignments {
    /*
    Error 17
    Implicit Type Conversion In Compound Assignments
     */
    public static void main(String[] args) {
        /*
        Expected:
            3.3
        Received:
            3
         */
        int c = 10;
        c *= 0.33;
        System.out.println(c);
    }
}