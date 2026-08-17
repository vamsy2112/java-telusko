
// notes:
// this is nothing but arrow fns in js. ONE CONDITION TO REMEMBER IS THAT THIS ONLY WORKS IF AND ONLY IF YOU HAVE FUNCTIONAL INTERFACE

@FunctionalInterface
interface Parent {
    void parent();
}

// class Child implements Parent {

// }

public class LambdaExpressions {
    public static void main(String[] args) {

        // ************** GENERAL METHOD OF ANONYMOUS INNER CLASS **********************
        Parent obj = new Parent() { // type is parent and obj creation is of parent only. this works in case of
                                    // anonymous inner class.
            public void parent() {
                System.out.println("in Child inherited from parent");
            };
        };
        obj.parent();

        // **************** WITH LAMBDA EXPRESSIONS ****************************

        Parent obj1 = () -> System.out.println("in Child inherited from parent");
        obj1.parent();
    }
}
