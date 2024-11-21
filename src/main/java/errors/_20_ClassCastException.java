package errors;

public class _20_ClassCastException {
    /*
    Error 20
    Class Cast Exception
     */
    public static void main(String[] args) {
        /*
        Expected:
            10
        Received:
            ClassCastException
         */
        Object obj = "10";
        System.out.println((Integer) obj);
    }
}