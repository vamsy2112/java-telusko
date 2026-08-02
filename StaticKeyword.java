
class Mobile {
    String brand;
    int price;
    static String name;
}

public class StaticKeyword {

    // static variales have a special place in JVM where the values are stored and
    // are constant all the time for any no. of objs you create.
    // we must always refer to a static variable with class name since it is always
    // a same value.
    // even if you change the value of it later, it will be changed for all the
    // objects.

    public static void main(String args[]) {
        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 1500;
        Mobile.name = "smartphone";

        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1700;
        Mobile.name = "smartphone";

        System.out.println(obj.brand + " : " + obj.price + " : " + Mobile.name);

    }
}
