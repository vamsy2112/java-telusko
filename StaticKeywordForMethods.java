class Mobile {
    int price;
    String brand;
    static String name;

    static void show() {
        // System.out.println(brand + " : " + price + " : " + name); // uncomment this
        // line and this shows we cannot use
        // non static variables
        // inside a static method.
    }

    static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + Mobile.name);
    }
}

public class StaticKeywordForMethods {
    public static void main(String args[]) {
        Mobile obj = new Mobile();
        obj.price = 1500;
        obj.brand = "Apple";
        Mobile.name = "smartphone";

        Mobile obj1 = new Mobile();
        obj1.price = 1700;
        obj1.brand = "Samsung";
        Mobile.name = "smartphone";

        Mobile.name = "phone";

        Mobile.show1(obj1); // accessing the static method with class just like we did for static variables.

    }
}
