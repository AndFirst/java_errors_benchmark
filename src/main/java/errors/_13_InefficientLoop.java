package errors;
import java.util.List;
import java.util.Arrays;

public class _13_InefficientLoop {
    /*
    Error 13
    Inefficient Loop
     */
    public static void main(String[] args) {
        /*
        Creating a new Connection object for each iteration of the loop is inefficient.
        Expected:
            Opening connection
            Sending: A
            Sending: B
            Closing connection
        Received:
            Opening connection
            Sending: A
            Closing connection
            Opening connection
            Sending: B
            Closing connection
         */
        List<String> items = Arrays.asList("A", "B");
        for (String item : items) {
            Connection connection = new Connection();
            connection.send(item);
            connection.close();
        }
    }

    private static class Connection {
        public Connection() {
            System.out.println("Opening connection");
        }
        public void send(String data) {
            System.out.println("Sending: " + data);
        }
        public void close() {
            System.out.println("Closing connection");
        }
    }


}