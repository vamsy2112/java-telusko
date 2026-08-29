import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResourcesModern {
    public static void main(String[] args) throws IOException {

        // this is the actual/initial way of writing the try catch and finally blocks.
        // int num = 0;
        // BufferedReader bf = null;

        // try {
        // InputStreamReader in = new InputStreamReader(System.in);
        // bf = new BufferedReader(in);

        // num = Integer.parseInt(bf.readLine());
        // } catch (Exception e) {

        // } finally {
        // bf.close();
        // }

        // below is the new modern way of writing the same try with resources
        int num = 0;
        System.out.println("Enter a number: ");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }

    }
}
