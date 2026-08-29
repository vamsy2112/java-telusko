import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        int num = 0;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        System.out.println("Enter a number: ");

        // tries to run the critical statement. if there is an exception, the code
        // directly jumps to catch statememnt without caring about whats written after
        // that particular critical statement.
        try {
            num = Integer.parseInt(bf.readLine());

            System.out.println(num);

            // catch is executed if there is any exception
        } catch (Exception e) {
            // exception handling code goes here...
        }

        // finally is executed even if there is an exception or not. This is useful if
        // we want toclose the resources since writing this piece of closing the
        // resources code is important to avoid memory leaks, we cannot write them
        // inside try since it will run only the critical statemnts and if it finds one,
        // the code directly jumps to catch statement.

        // we cannot write the resources closing code inside catch statement because it
        // will only run when there is an exception.

        // Hence, the finally block is important to write since it will run no matter if
        // there is an exception or not.
        finally {
            bf.close();
        }
    }
}
