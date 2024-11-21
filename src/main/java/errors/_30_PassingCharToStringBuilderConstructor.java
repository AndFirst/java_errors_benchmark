package errors;

public class _30_PassingCharToStringBuilderConstructor {
    /*
    Error 30
    Passing Char To StringBuilder Constructor
     */
    public static void main(String[] args) {
        /*
        Expected:
            abc
        Received:
            bc
         */
        StringBuilder sb = new StringBuilder('a');
        sb.append("bc");
        System.out.println(sb);
    }
}