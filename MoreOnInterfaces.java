
//Is it possible to extend an interface? Yes it is possible.

// important points to remember:

// class -> class: use extends
// interface -> interface: use extends
// class -> interface: use implements

interface A {
    void show();

    void config();
}

interface X extends A { // as imple as class gets extended from parent class.
    void run();

    int age = 29;
}

// Most important thing is to create a concrete class and implement all the
// methods from interfaces.

class B implements X { // concrete class
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run() {
        System.out.println("in run");
    }

}

public class MoreOnInterfaces {
    public static void main(String[] args) {
        // remember, we can create an object of a concrete class only

        B obj = new B();
        obj.config();
        System.out.println(X.age);
    }
}
