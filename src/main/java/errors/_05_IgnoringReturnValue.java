package errors;

public class _05_IgnoringReturnValue {
    /*
    Error 05
    Ignoring Return Value

    Expected:
        def
    Received:
        abcdef
     */
    public static void main(String[] args) {
        String s = "abcdef";
        s.substring(3);
        System.out.println(s);
    }

}
