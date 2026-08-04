
// Inheritance has 2 concepts. Is-A & Has-A.
// Now inheritance is nothing but extending the props/methods of parent. just like nepotism.
// now, go through this class Maths where it has addition and subtraction as methods. we have created advanceMaths class in another file to inherit the props/methods of Maths class. this is called inheritance

// in line no.18, we are creating a ref variable obj and the object will actually be created when we write new Maths();
// even if dont assign it to any ref variable, then also the object will actually be created. But since we are not assigning it to a ref variable, we cannot re-use it.

class Maths {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

public class Inheritance {
    public static void main(String args[]) {
        Maths obj = new Maths();
        System.out.println(obj.add(3, 4) + " , " + obj.sub(9, 2));
    }
}
