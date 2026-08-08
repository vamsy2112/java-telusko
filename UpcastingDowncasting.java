
class Parent {
    String name;

    public void showParent() {
        System.out.println("in parent method");
    }
}

class Child extends Parent {
    int id;

    public void showChild() {
        System.out.println("in child method");
    }
}

public class UpcastingDowncasting {
    public static void main(String[] args) {
        // upcasting
        Parent obj = new Child();

        obj.name = " name is parent";
        // we all know we can do this since this happens internally. now child methods
        // also know that they can acces parent's methods if they are extending parent
        // class. buT what about parent class? they dont know how to access the child
        // class' methods. thats wheree downcasting comes into picture. this means, that
        // parent class can also access child class methods. this is called downcasting.

        Child obj1 = (Child) obj;
        obj1.showParent(); // you see we can call this parents' method via downcasting
    }
}
