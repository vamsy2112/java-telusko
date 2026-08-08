
class Outside {
    public void show() {
        System.out.println("in outsideclass show");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outside obj = new Outside() { // this is how you create an anonymous class. just after creating a new Outside
                                      // object, open curly braces and write down the same show method with different
                                      // return statement. this we already know as this is called method overriding.
            public void show() {
                System.out.println("in anonymous inner class");
            }
        };

        obj.show(); // NEED FOR ANONYMOUS INNER CLASS IS you see obj is reference variable of type
                    // outside. so we didnt need a new
                    // class just for writing 1 different behaviour of show method or for having
                    // method overriding
    }
}
