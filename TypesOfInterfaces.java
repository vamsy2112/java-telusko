
//NOTES:
//  3 TYPES OF INTERFACES namely normal, functional interface and Marker interface.
// 1. so if an interface is having more than 2 or more methods then it is normal interface.
// 2. If an interface is having only 1 method then it is called functional interface (or) SAM. - single abstract method.
// 3. If an interface is empty, then it is a marker interface
// 4. we need to focus more on functional interface because from java 8, java is very simple to use like lambda expressions.

@FunctionalInterface
interface Original {
    void show();
}

// class Duplicate implements Original {
//

// instead of creating a new class just
// for defining a method, we can make use of anonymous class. refer to line
// number 25 to 28

// }

public class TypesOfInterfaces {
    public static void main(String[] args) {
        Original obj = new Original() {
            public void show() {
                System.out.println("in show");
            }
        };

        obj.show();
    }
}
