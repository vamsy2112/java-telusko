// TODO: Create an interface called Machine with one method: String start()

interface Machine {
    String start();
}
// TODO: Create an abstract class called Appliance that:
// - Implements Machine interface

abstract class Appliance implements Machine {
    String name;

    public Appliance(String name) {
        this.name = name;
    }
}

// TODO: Create a class Fan that:
// - Extends Appliance
class Fan extends Appliance {

    public Fan(String name) {
        super(name);
    }

    public String start() {

        return "Fan is running";
    }
}

// TODO: Create a class WashingMachine that:
// - Extends Appliance

class WashingMachine extends Appliance {

    public WashingMachine(String name) {
        super(name);
    }

    public String start() {
        return "Washing Machine is operating";
    }
}

public class Exercise8 {
    public static void main(String[] args) {
        // TODO: Create objects of Fan and WashingMachine using interface references
        Machine fan = new Fan("Fan");
        Machine washer = new WashingMachine("Washing Machine");
        // TODO: Print the result of start() for each object
        System.out.println(fan.start());
        System.out.println(washer.start());

    }
}