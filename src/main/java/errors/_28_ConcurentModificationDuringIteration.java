package errors;

import java.util.ArrayList;
import java.util.List;

public class _28_ConcurentModificationDuringIteration {
    /*
    Error 28
    Concurrent Modification During Iteration
     */
    public static void main(String[] args) {
        /*
        Expected:
            a
            b
            c
            x
        Received:
            ConcurrentModificationException
         */
        List<String> list = new ArrayList<>(List.of("a", "b", "c"));
        for (String s : list) {
            System.out.println(s);
            if (s.equals("b")) {
                list.add("x");
            }
        }
    }
}