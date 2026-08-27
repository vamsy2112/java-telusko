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
