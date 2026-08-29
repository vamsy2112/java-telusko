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

        // NOTES:
        // ITS THE SAME THAT WE CREATE A BUFFEREDrEADER OBJ AND THEN INOUTsTRAMrEADER
        // OBJ.
        // ONLY DIFF IS THAT WE CAN WRITE ALL OF THIS INSIDE TRY() PARENTHESIS AND
        // INSIDE THE TRY'S BLOCK I.E., {}, WE CAN WRITE THE READlINE().
        // bENEFIT IS THAT WE DONT HAVE TO CLOSE THE RESOURCES SINCE IN THIS OF WRITING
        // MODERN JAVA, THE RESOURCES ARE AUTO-CLOSABLE
        // ONLY IF WE WRITE IT IN MODERN WAY OF JAVA I.E., try(){}

    }
}
