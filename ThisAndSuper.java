
class A {
    public A() {
        super(); // a hidden method for each constructor in java.
        System.out.println("in A");
    }

    public A(int n) {
        super();
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("in B");
    }

    // 2. now lets create a parameterised constructor
    public B(int n) {
        // super();
        // super(n); // 5. now if you uncomment this line then it will call
        // parameterised constructor of A class.

        this(); // 6. now if you uncomment this line then it will call main constructor of B
                // class. so this() method calls the constructor of same class. so when this()
                // method encounters super() in main constructor of B, it calls main constructor
                // of A. Hence the output is in A, In b, In B int.
        System.out.println("in B int");
    }
}

public class ThisAndSuper {
    public static void main() {
        // B obj = new B(); // 1. this will call sout statements from both A & B classes
        // since B is
        // inherited from A.

        // 3. if you make the object creation with parameter then it will call
        // paramenterised constructor B and main constructor A. Why? because every
        // constructor has a hidden method called super() which calls the constructor of
        // parent or super class.

        // 4. Now how to call the parameterised constructor of A? just pass a parameter
        // to super in B so that it gives a command to call parameterised constructor in
        // super class.

        B obj = new B(5);
    }
}
