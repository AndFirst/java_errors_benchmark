package errors;


public class _01_ConcatenationInsteadOfAddition{
    public static void main(String[] args){
        /*
        Error 01
        Concatenation Instead Of Addition

        expected: John 1
        received: John 11
         */
        int index = 1;
        String name = "John " + index + 1;

        System.out.println(name);
    }
}