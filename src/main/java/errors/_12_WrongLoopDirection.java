package errors;

public class _12_WrongLoopDirection {
    /*
    Error 12
    Wrong Loop Direction
     */
    public static void main(String[] args) {
        /*
        Expected:
            5
            4
            3
            2
            1
            0
        Received:
            5
            6
            7
            ...
         */
        for (int i = 5; i >= 0; i++) {
            System.out.println(i);
        }
    }
}