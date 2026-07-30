class Calculator {
    int num = 5; // this is an instance variable and will get stored in heap rather than stack

    public int add(int a, int b) {
        // here, a,b,r are the local variables and will be stored in a stack.
        int r = a + b;
        System.out.println(num);
        return r;
    }
}

public class StackAndHeap {
    public static void main(String args[]) {
        Calculator calc = new Calculator(); // this object or reference variable calc will be stored in heap with an
                                            // address. So whenever we call this ref variable, it will always point to
                                            // the address in the heap memory making a link between stack and heap.

        // we can have more methods as well.
        Calculator calc1 = new Calculator(); // this will create another reference variable inside heap and the
                                             // variables/methods that we call with this instace will point to its own
                                             // address. hence even if we change a variable by calling this instance, it
                                             // wont affect the other since in stack, the variable points to whole
                                             // different address.

        int n1 = 5;
        int n2 = 6;
        int result = calc.add(n1, n2); // as soon as the method call triggers, there will be a new stack altogether
                                       // where its variables will be stored.

        System.out.println(result);
        System.out.println(calc.num);
        calc1.num = 8;
        System.out.println(calc1.num);

    }
}
