import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

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

        // 5. collections API is a concept
        // 6. Collection is an interface
        // 7. Collections is a class

        System.out.println("******** ArrayList **********");
        Collection<Integer> obj = new ArrayList<Integer>();
        // obj.add(obj) By default it will add an object. and hence we need to provide
        // <Integer> to add an integer.
        // this is better if you just want to print values

        obj.add(1);
        obj.add(2);
        obj.add(3);

        for (int i : obj) {
            System.out.println(i);
        }

        System.out.println("*********** List **********");
        List<Integer> nums = new ArrayList<Integer>();
        // This is better if you want to fetch values as it provides get() and indexOf()
        // methods.
        nums.add(1);
        nums.add(2);
        nums.add(3);

        for (int i : nums) {
            System.out.println(i * 2);
        }

        nums.get(2);
        nums.indexOf(3);

        System.out.println("************ Set and HashSet *****************");
        Set<Integer> obj1 = new HashSet<Integer>();

        // Removes duplicates from an array.
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

        System.out.println("************* Set and Treeset ******************");
        Set<Integer> obj2 = new TreeSet<Integer>();
        // you can use this if you want all sorted elements from an array.

        obj2.add(10);
        obj2.add(1);
        obj2.add(88);
        obj2.add(41);

        for (int i : obj2) {
            System.out.println(i);
        }

        System.out.println("************** Iterator is parent to Collection interface ***************");

        Iterator<Integer> values = nums.iterator();

        while (values.hasNext()) {
            System.out.println(values.next());
        }

        System.out.println("******************* Map *******************");

        Map<String, Integer> obj3 = new HashMap<>();

        obj3.put("Vamsy", 10);
        obj3.put("Sailu", 91);
        obj3.put("Murty", 93);
        obj3.put("Yamini", 97);

        System.out.println(obj3.get("Murty"));
        System.out.println(obj3.keySet());

        for (String key : obj3.keySet()) {
            System.out.println(key + " : " + obj3.get(key));
        }

        System.out.println();

        // HashMap and Hashtable are same except the fact that Hashtable works
        // synchronized(if there are multiple threads working concurrently).

        System.out.println("************ Collections class *************");
        List<Integer> nums1 = new ArrayList<>();

        nums1.add(13);
        nums1.add(12);
        nums1.add(113);
        nums1.add(47);

        Collections.sort(nums1); // sorts the array in ascending order
        System.out.println(nums1);

        // If you want to sort with custom logic, lets say, if you want to sort based on
        // the last digit of each number, then use second parameter for sort method
        // i.e., comparator obj.

        System.out.println("*********************** Collections class with comparator obj ***************************");

        Comparator<Integer> com = new Comparator<Integer>() {

            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else
                    return -1;
            }
        };

        List<Integer> nums2 = new ArrayList<>();
        nums2.add(13);
        nums2.add(19);
        nums2.add(1139);
        nums2.add(47);
        nums2.add(41);

        Collections.sort(nums2, com);
        System.out.println(nums2);

        System.out.println("*********** Collections class with sorting of string based on length ****************");

        Comparator<String> com1 = new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() > s2.length()) {
                    return 1;
                } else
                    return -1;
            }
        };

        List<String> str = new ArrayList<String>();

        str.add("Vamsy");
        str.add("Sailaja");
        str.add("Murtyy");
        str.add("Yaminiii");

        Collections.sort(str, com1);
        System.out.println(str);
    }
}
