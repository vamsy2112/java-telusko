import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        try {
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
            bf.close();
        } catch (IOException i) {
            System.out.println("this is throwing input output exception");

        }

    }
}
