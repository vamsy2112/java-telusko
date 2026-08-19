public class Throw {
    public static void main(String[] args) {
        int i = -2;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0) {
                throw new ArithmeticException();
            }
            if (j < 0) {
                throw new IllegalArgumentException();
            }
        } catch (ArithmeticException a) {
            j = 18 / 1; // this will get calculated instead of actual try block and will give you the
                        // output. this can be used for e.g., there are 2 DBs and if the main DB is
                        // down, then you can redirect the traffic to slave DB.
            System.out.println("that's a default output");
        } catch (IllegalArgumentException k) {
            System.out.println("wrong input, please check!");
        }

        catch (Exception e) {
            System.out.println("something went wrong!");
        }

        System.out.println(j);
    }
}
