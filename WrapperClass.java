public class WrapperClass {
    public static void main(String[] args) {
        int num = 7;
        // Integer num1 = new Integer(num); // deprecated method
        Integer num1 = num; // line no. 4 automatically gets converted from a primitive variable to
                            // reference object variable. this conversion is done automatically and hence is
                            // called auto-boxing.
        System.out.println(num1);

        // int num2 = num1.intValue(); // this is conversion from object reference
        // variable to primitive variable. this is called auto-unboxing.
        // the line no. 8 can also be written as below:
        int num2 = num1;
        System.out.println((num2));

        // parseInt(). - this basically converts a string to an integer and can only be
        // used withan Integer wrapper class
        String str = "13";
        int num3 = Integer.parseInt(str);
        System.out.println(num3 * 2);
    }
}
