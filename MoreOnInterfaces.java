
//Is it possible to extend an interface? Yes it is possible.

// important points to remember:

// class -> class: use extends
// interface -> interface: use extends
// class -> interface: use implements

interface A {
    void show();

    void config();
}

interface B {
    void walk();
}

interface X extends B { // as simple as class gets extended from parent class.
    void run();

    int age = 29;
}

// Most important thing is to create a concrete class and implement all the
// methods from interfaces.

class C implements X, A { // concrete class
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run() {
        System.out.println("in run");
    }

    public void walk() {
        System.out.println("in walk");
    }

}

public class MoreOnInterfaces {
    public static void main(String[] args) {
        // remember, we can create an object of a concrete class only

        A obj = new C();

        // we can now call the methods which are in A and not others
        obj.config();

        // obj.walk(); // uncomment this line of code and you'll see that you cannot
        // call walk() here since reference variable obj of
        // interface type A
        // doesnt know about object of C which is a class.

        // in order to call this, we must create a reference of interface B with object
        // of class C.

        B obj1 = new C();
        obj1.walk();

        System.out.println(X.age);
    }
}
