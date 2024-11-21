package errors;

import java.util.HashMap;
import java.util.Map;

public class _26_UsingNullInMaps {
    /*
    Error 26
    Using Null In Maps
     */
    public static void main(String[] args) {
        /*
        Using null as a value in a map can lead to unexpected behavior.
        getOrDefault() method returns null -> key exist
        containsKey() returns true -> key exist
        putIfAbsent() updates the value -> key not exist
         */
        Map<String, String> map = new HashMap<>();
        map.put("key1", null);
        System.out.println(map.getOrDefault("key1", "default"));
        System.out.println(map.containsKey("key1"));
        map.putIfAbsent("key1", "value1");
        System.out.println(map.getOrDefault("key1", "default"));
    }
}