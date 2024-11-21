package errors;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class _27_UsingMutableObjectAsKeys {
    /*
    Error 27
    Using Mutable Object As Keys
     */
    public static void main(String[] args) {
        /*
        Expected:
            true
            true
        Received:
            true
            false
         */
        Set<List<String>> set = new HashSet<>();

        List<String> list = new ArrayList<>();
        set.add(list);

        System.out.println(set.contains(list));

        list.add("Hello");
        System.out.println(set.contains(list));
    }
}