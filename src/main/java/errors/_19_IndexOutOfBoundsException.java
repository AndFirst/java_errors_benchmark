package errors;

public class _19_IndexOutOfBoundsException {
    /*
    Error 19
    Index Out Of Bounds Exception
     */
    public static void main(String[] args) {
        /*
        Expected:
            3
        Received:
            ArrayIndexOutOfBoundsException
         */

        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);
    }
}