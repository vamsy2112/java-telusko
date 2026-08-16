// NOTES: We can print the named constants based on the condition. lets say, we can print failed when a server return an error.

enum Status {
    Running, Failed, Success, Pending;
}

public class EnumsIF_ELSE_SWITCH {
    public static void main(String[] args) {
        Status s = Status.Success;

        switch (s) { // Java already knows s is nothing but a Status class.
            case Running:
                System.out.println("All pods are up!");
                break;
            case Failed:
                System.out.println("Error in fetching the details!!");
                break;
            case Pending:
                System.out.println("Loading.. please wait!");
                break;
            default:
                System.out.println("Success! here is the response!");
                break;
        }
    }
}
