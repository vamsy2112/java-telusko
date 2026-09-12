import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collections_API {
    public static void main(String[] args) {
        // NOTES:

        // 1. Collections API is a part of Java's standard library that provides a set
        // of classes and interfaces for working with collections of objects.
        // 2. It includes classes for lists, sets, maps, and other data structures
        // 3. The Collections API provides methods for adding, removing, and
        // manipulating elements in collections, as well as for sorting and searching
        // them.
        // 4. The Collections API is designed to be flexible and extensible, allowing
        // developers to create their own custom collection classes that can be used
        // with the standard collection classes.

        System.out.println("******** ArrayList **********");
        Collection<Integer> obj = new ArrayList<Integer>();
        // obj.add(obj) By default it will add an object. and hence we need to provide
        // <Integer> to add an integer.

        obj.add(1);
        obj.add(2);
        obj.add(3);

        for (int i : obj) {
            System.out.println(i);
        }

        System.out.println("*********** List **********");
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        for (int i : nums) {
            System.out.println(i * 2);
        }

        System.out.println("************ Set and HashSet *****************");
        Set<Integer> obj1 = new HashSet<Integer>();
        obj1.add(1);
        obj1.add(2);
        obj1.add(3);
        obj1.add(4);
        obj1.add(5);
        obj1.add(6);
        obj1.add(7);
        obj1.add(3);
        obj1.add(4);
        obj1.add(5);

        for (int i : obj1) {
            System.out.println(i); // prints unique elements
        }

    }
}
