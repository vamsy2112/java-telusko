import java.util.List;
import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        nums.forEach(n -> System.out.println(n));
    }
}
