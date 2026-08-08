//NEED OF ABSTRACTION
// SOMETIMES WE CANNOT DECLARE A METHOD INSIDE A CLASS. THAT'S WHEN YOU NED ABSTRACTION. E.G., MEMBERSHIP BASED FEATURES FOR ROLES; VERSIONS OF A CAR

//RULES:

// 1. an abstract class can have abstract methods and non-abstract methods as well but abstract methods must be placed inside an abstract class only.
// 2. if abstract method is being written, it can't be initialised. only can be declared inside an abstract method.
// 3. classes must follow inheritance
//4. you cannot create an object of an abstract class.
// 5. only can create an object of concrete class (non-abstract class).
// 6. in this concrete class, you must declare your methods and youc an call the methods via an object of this concrete class.
class BasicCar {
    public void drive() {
        System.out.println("Driving");
    }
}

abstract class Vxi extends BasicCar {
    public void playMusic() {
        System.out.println("Playing Music");
    }

    public abstract void sunroof();

    public abstract void alloyWheels();

}

abstract class Zxi extends Vxi {
    public void sunroof() {
        System.out.println("sunroof feature present");
    }

    public void alloyWheels() {
        System.out.println("alloy wheels present");
    }

    public abstract void abs();
}

class ZxiPlus extends Zxi {

    public void abs() {
        System.out.println("has abs feature");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        ZxiPlus obj = new ZxiPlus();
        obj.drive();
        obj.alloyWheels();
        obj.sunroof();
        obj.playMusic();
    }
}
