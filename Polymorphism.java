
// poly means many, morphism means behavioud. so same method different behaviour when the child class extends parent class.

class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }
}

class C extends B {
    public void show() {
        System.out.println("in C show");
    }
}

public class Polymorphism {
    public static void main(String args[]) {
        A obj = new A();
        obj.show(); // will print in A show

        B obj1 = new B();
        obj1.show(); // will print in B show

        A obj2 = new B(); // observe this very carefully. Reference variable of type A is referring to
                          // object B. so it will print in B show.

        // this can be understandable via an example of Computer and a laptop. laptop
        // can be called as a computer. so type Computer can be referred to Laptop obj.
        obj2.show();

        obj = new B();
        obj.show(); // in B show

        obj = new C();
        obj.show(); // in C show

        // so the same show() is getting called at the runtime decidingh which one to
        // get called. so this is runtime polymorphism
    }
}
