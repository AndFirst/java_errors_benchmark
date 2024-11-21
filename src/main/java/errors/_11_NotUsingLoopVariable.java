package errors;

import java.util.ArrayList;
import java.util.List;

public class _11_NotUsingLoopVariable {
    /*
    Error 12
    Not Using Loop Variable
     */

    public static void main(String[] args) {
        /*
        Expected:
            STRING
            INTEGER
            DOUBLE
        Received:
            STRING
            null
            null
         */
        String[] types = {"String", "Integer", "Double"};
        String[] typesUpper = new String[types.length];

        for (int i = 0; i < types.length; i++) {
            typesUpper[0] = types[0].toUpperCase();
        }

        for (String type : typesUpper) {
            System.out.println(type);
        }
    }
}