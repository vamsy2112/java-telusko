
// NOTES:
// 1. NEED -> when an abstract method has only the methods declared but never initialised, then we can make use of interfaces.
// 2.  Interface is kind of a class. meaning, it looks lika class only.
// abstract class Show {
//     public abstract void show();

//     public abstract void Config();
// }

interface Show {
    // 3. interfaces are just polished versions for abstract keywords. so in
    // interfaces whatever methods you define, they will by default have public
    // abstract keywords.
    void show();

    void config();

    // 8. Now lets try to declare variables. So in interfaces, all the variables
    // will have final and static keywords even if you dont mention.

    int age = 29; // will have static & final keywords in background. so we must initialise and
                  // its value cant be changed
    String area = "Hyderabad";
}

// 6. so we need to create a concrete class.
class Show1 implements Show {
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        // 4. now, if we try to create an object of show then it will throw error since
        // we cannot create an object out of an interface just like an abstract class.
        // we must create a new concrete class where all the methods are initialised.

        // Show obj = new Show(); // 5. if you uncomment this line, it will throw an
        // error.

        // 7. so we will be creating an object of concrete class to call the methods.
        Show obj = new Show1();
        obj.config();
        obj.show();

        // 9. since the variables are static, we dont need to create an object. we can
        // use them directly like below:

        System.out.println(Show.age);
        System.out.println(Show.area);

    }
}
