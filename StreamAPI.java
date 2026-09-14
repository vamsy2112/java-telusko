import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 3, 2, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n * 2);
        int result = s3.reduce(0, (c, e) -> c + e);
        // s3.forEach(n -> System.out.println(n));
        System.out.println(result);
    }
}
