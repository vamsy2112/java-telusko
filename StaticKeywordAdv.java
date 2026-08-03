
class Mobile {
    int price;
    String brand;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + Mobile.name);
    }

    static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + Mobile.name);
    }

    // static block
    static {
        System.out.println("in static block");
        name = "phone"; // static block will be called first even before the constructor since for any
                        // program, the class loads first and this static block will be called only once
                        // doesnt matter
                        // how many objects are present.
    }

    // constructor
    public Mobile() {
        System.out.println("in constructor");

        brand = "Apple";
        price = 1500;
        // name = "smartphone"; // if we give a default value here, then whats the use
        // of it being a static
        // variable? it will be initialised twice since the constructor will be called
        // each time an object is created. so lets not write it here but in static
        // block.
    }

}

public class StaticKeywordAdv {
    public static void main(String args[]) {
        // why do we need to write static for main method in the first place?
        // ******************* it is because, for any non-static method, we must create
        // an object of clss. ******************
        // in this case of main being a non-static method, we must create an object of
        // StaticKeywordAdv.

        // even if we do that it will be a deadlock, since main is the starting point of
        // code execution. so that's why we write the main method always as a static
        // method.

        Mobile obj = new Mobile();
        obj.brand = "samsung";
        obj.price = 1700;
        obj.show();

        // how to give default values for an object in the next line?
        // yes, it should be via the constructor only.
        Mobile obj1 = new Mobile();
        Mobile.show1(obj1);

        // ****************** Now if you see, we have create 2 objects. so every time we
        // create an object,
        // the constructor will be called. in this case, it will be twice.
        // ******************************8

    }
}
