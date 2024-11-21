package errors;

public class _07_MalformedIfElseChain{
    /*
    Error 07
    Malformed If Else Chain
     */
    public static void main(String[] args) {
        /*
        Expected:
            Processing data for input 1
        Received:
            Processing data for input 1
            Processing default data
         */
        processData(1);
    }

    private static void processData(int input) {
        if (input == 1) {
            System.out.println("Processing data for input 1");
        } else if (input == 2) {
            System.out.println("Processing data for input 2");
        } if (input == 3) {
            System.out.println("Processing data for input 3");
        } else if (input == 4) {
            System.out.println("Processing data for input 4");
        } else {
            System.out.println("Processing default data");
        }
    }
}