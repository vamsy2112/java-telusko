
// NOTES:
// 1. FIRST, the input is taken using BufferReader obj. 
// 2. but this bufferReader needs InputstreamReader obj.
// 3. so passs this inputStreamReader obj into BufferReader obj as shown in line number 17.
// 4. Now this inputStreamReader is dependent on InputStream class obj and we know that InoutStream obj is nothing but taking the input. and hence we can pass System.in into InputStream

// 5. Now remember that the bf.readline() will throw IOException. and we know what it is so, since it is a checkedException, we must put inside try and catch statements.
// 6. we must always close our resources as shown in line number 25.
// 7. the parsing into integer is needed since the readline() returns a string and we want a string. so we used Integer.parseInt(bf.readLine())

import java.io.BufferedReader;
import java.io.IOException;
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
