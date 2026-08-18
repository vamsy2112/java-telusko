
// NOTES: 
// EXCEPTIONS ARE RUNTIME ERRORS.

public class Exceptions {

    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        String name = null;

        try {
            j = 18 / i;
            name.length();

        }

        catch (ArithmeticException a) {
            System.out.println("input value is wrong!");
        }

        catch (NullPointerException b) {
            System.out.println("be in your limits");
        }

        catch (Exception e) {
            System.out.println("Something went wrong!");
        }
        System.out.println(j);
    }
}
