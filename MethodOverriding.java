// so method overriding can happen in java by follow:
// methods having same names in classes following inheritance. 
// we have created 2 methods with same name but it show method in class B will override show method in class A.

class A {
    public void show() {
        System.out.println("in A show");
    }

    public void config() {
        System.out.println("in A config");
    }
}

class B extends A {
    public B() { // constructor
        super();
    }

    public void show() {
        System.out.println("in B show"); // you see the method with same name in a class following inheritance is
                                         // possible and this is called method overriding. It has same name, same params
                                         // but different return behaviour
    }
}

public class MethodOverriding {
    public static void main(String args[]) {
        // how do you call a method? by creating an object. this is what we have done in
        // the next line:
        B obj = new B();
        obj.show(); // this will print "in B show" instead of "in A show"
    }
}
