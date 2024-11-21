package errors;

public class _02_UnaryPlus {
        /*
        Error 02
        Unary Plus
        */
    public static void main(String[] args) {
        add();
        concatenate();
    }

    private static void add(){
        /*
        expected: 3
        received: 2
         */
        int x = 1;
        x =+ 2;
        System.out.println(x);
    }

    private static void concatenate(){
        /*
        expected: User: "John"
        received: User: 34John"
         */
        String user = "User: " +
            + '"' + "John" + '"';
        System.out.println(user);
    }
}
