import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        nums.forEach(n -> System.out.println("line number 8: " + n));

        System.out.println("*********************************************");

        List<Integer> nums2 = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> s1 = nums2.stream();
        // System.out.println(s1);

        s1.forEach(n -> System.out.println(n));

    }

}
