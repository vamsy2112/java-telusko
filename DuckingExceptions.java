public class DuckingExceptions {

    public void a() throws Exception {

    }

    public void b() throws Exception {

    }

    public static void main(String[] args) {
        // ducking the exception code goes here...

        try {
            Class.forName("DuckingExceptions");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found" + e);
        }

        DuckingExceptions obj = new DuckingExceptions();

        try {
            obj.a();
            obj.b();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

// NOTES:
// Ducking exceptions is a technique in Java where a method declares that it
// throws an exception,
// but does not handle it within the method itself.
// Instead, it allows the exception to propagate up the call stack to be handled
// by the caller.
// This is done using the "throws" keyword in the method signature. In this
// example, methods a() and b() declare that they throw Exception,
// but do not handle it.
// The main method catches any exceptions thrown by these methods and wraps them
// in a RuntimeException,
// effectively "ducking" the exception handling responsibility to the caller of
// main().
