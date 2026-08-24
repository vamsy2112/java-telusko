
//notes:

//1. create your own exception. see line number 21
// 2. create a class of your namedException which extends the Exception class.
//3. If you want to pass your own message, then pass it to a parameter. see line number 31.
// 4. call this via a constructor of namedException class and a super method inside the constructor

class VamsyException extends Exception {
    public VamsyException(String str) {
        super(str);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;

        try {
            j = 18 / i;

            if (j == 18) {
                throw new VamsyException("This is my exception");
            }

            if (j < 0) {
                throw new IllegalArgumentException();
            }
        } catch (VamsyException a) {
            j = 18 / 1;
            System.out.println("By default the output is 1" + a);
        }

        catch (IllegalArgumentException il) {
            System.out.println("input is negative!!");
        }

        catch (Exception e) {
            System.out.println("Something went wrong!!!");
        }

        System.out.println(j);
    }
}
