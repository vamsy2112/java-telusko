public class Arrays {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        System.out.println(arr[1]);

        int arr1[] = new int[4];

        System.out.println(arr1); // this will give you the address of the array.
        System.out.println(arr1[0]); // prints default value as 0 since we haven't provided it
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);

        arr1[0] = 10;
        System.out.println(arr1[0]);
    }
}
