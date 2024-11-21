package errors;

public class _09_PassThroughSwitch {
    /*
    Error 09
    Pass Through Switch
     */
    public static void main(String[] args) {
        /*
        Expected:
            User 1
        Received:
            User 1
            Invalid option
         */
        int userChoice = 1;

        switch (userChoice){
            case 0:
                System.out.println("User 0");
                break;
            case 1:
                System.out.println("User 1");
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}