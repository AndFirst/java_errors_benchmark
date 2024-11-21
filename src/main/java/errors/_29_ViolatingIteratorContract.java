package errors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _29_ViolatingIteratorContract {
    /*
    Error 29
    Violating Iterator Contract
     */
    public static void main(String[] args) {
        /*
        Expected:
            a b
            c d
            e
        Received:
            a b
            c d
            NoSuchElementException
         */
        List<String> list = new ArrayList<>(List.of("a", "b", "c", "d", "e"));
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String currentS = iterator.next();
            String nextS = iterator.next();
            System.out.println(currentS + " " + nextS);
        }
    }
}