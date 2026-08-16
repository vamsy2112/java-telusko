// NOTES: enums are short of enumerisations. It represents the named constants. hERE running, success, etc are named constants.
// The Status here is nothing bt a class and the values are objs of it.
enum Status {
    Running, Pending, Success, Failed;
}

public class EnumsIntro {
    public static void main(String[] args) {
        Status s = Status.Failed;
        System.out.println(s); // returns Failed.

        // returning the index of named constants.
        Status s1 = Status.Success;
        System.out.println(s1.ordinal()); // will return the indexx of success obj.

        // other way of accessing the enums is as folllows:
        Status s2 = Status.valueOf("Pending");
        System.out.println(s2);
        System.out.println("**************");

        // what if i want to print all the values of Status enum?
        Status[] s3 = Status.values();
        System.out.println("Looping over the named constants:");
        System.out.println("**************");
        for (Status i : s3) {
            System.out.println(i);
        }
    }

}
