public class Stringss {
    public static void main(String args[]) {
        String name = "Vamsy"; // this will create a new stack inside heap called as string constant pool.
        String name2 = "vamsy"; // observe the capslock here. it is a totally dofferent value so new value will
                                // be created in string constant pool.

        name = name + "gannavarapu"; // this will again create a new value inside string constant pool with vamsy
                                     // gannvarapu and the address will be changed in stack memory.

        System.out.println("hello" + name); // this will again create a new object
        // now how to overcome this flaw? the flaw is like we cannot change a String
        // since it is immutable. so we can use StringBuilder or StringBuffer to
        // overcome this flaw.

        // what is stringBuffer?
        // StringBuffer can be used to create a mutable string without creating a new
        // object in heap memory. It is thread safe and synchronized. It is slower than
        // StringBuilder.

        // how to create a stringBuffer?
        StringBuffer sb = new StringBuffer("vamsy");
        sb.append(" gannavarapu");
        System.out.println(sb);
        sb.insert(0, "oreyy ");
        System.out.println(sb);

    }
}
