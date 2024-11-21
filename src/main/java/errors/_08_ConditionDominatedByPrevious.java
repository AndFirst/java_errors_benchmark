package errors;

public class _08_ConditionDominatedByPrevious {
    /*
    Error 08
    Condition Dominated By Previous
     */
    public static void main(String[] args) {
        /*
        Expected:
            Child
            Teenager
            Mature
        Received:
            Child
            Teenager
            Teenager
         */
        System.out.println(getPerson(5));
        System.out.println(getPerson(11));
        System.out.println(getPerson(20));
    }

    public static String getPerson(int age){
        if (age > 10) {
            return "Teenager";
        } else if (age >= 18){
            return "Mature";
        }
        else {
            return "Child";
        }
    }
}