package errors;

public class _21_NotCheckingIndexOxResult {
    /*
    Error 21
    Not Checking Index Of Result
     */
    public static void main(String[] args) {
        /*
        Expected:
            Key: Name, Value: John
        Received:
            StringIndexOutOfBoundsException
         */
        String result = parseKeyValue("NameJohn");
        System.out.println(result);
    }

    public static String parseKeyValue(String entry) {
        int pos = entry.indexOf('=');
        String key = entry.substring(0, pos).trim();
        String value = entry.substring(pos + 1).trim();
        return "Key: " + key + ", Value: " + value;
    }
}