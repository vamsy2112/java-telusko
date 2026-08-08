
class OutsideClass {

    int id;

    public void showOutsideClass() {
        System.out.println("outside class");
    }

    static class InsideClass { // if its a static class, we dont have to call method the way it is in the line
                               // no 27.
        // a class can only be static if it is inner class. we cannot make an outer
        // class as static.
        String name;

        public void showInsideClass() {
            System.out.println("inside class");
        }

    }
}

public class InnerClass {

    public static void main(String[] args) {

        OutsideClass obj = new OutsideClass();
        obj.showOutsideClass(); // this we know. the way we call a method using reference obj.

        // OutsideClass.InsideClass obj1 = obj.new InsideClass(); // this is how we need
        // to target innerclass' methods
        // since the method showInsideCLass is non-static, we
        // need to create an object first.
        // obj1.showInsideClass();

        // if the class is static, we dont need to create an object again. it will be
        // like below:
        OutsideClass.InsideClass obj2 = new OutsideClass.InsideClass();
        obj2.showInsideClass();

    }
}
