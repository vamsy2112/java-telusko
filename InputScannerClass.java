
import java.util.Scanner;;

public class InputScannerClass {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt());

        sc.close();
    }
}