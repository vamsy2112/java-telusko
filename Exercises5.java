
// Problem 4:Interfaces—Multiple Behaviors Goal:Interfaces let unrelated classes share a contract(unlike single inheritance).Create
// interface Drivable
// with method

// drive()
// Create

// interface Chargeable
// with method

// charge()
// Create class ElectricCar that implements both interfaces
// Create class PetrolCar that implements only Drivable
// In main(): create one of each, call drive() on both, and charge() only on the electric one.
// Expected output pattern:
// ElectricCar is driving silently.
// ElectricCar is charging at the station.
// PetrolCar is driving with engine noise.
// Think about: Java doesn't allow multiple class inheritance (extends A, B is illegal) — why does implements Drivable, Chargeable work fine?

interface Driveable {
    void drive();
}

interface Chargeable {
    void charge();
}

class ElectricCar implements Chargeable, Driveable {
    public void drive() {
        System.out.println("ElectricCar is driving silently.");
    }

    public void charge() {
        System.out.println("ElectricCar is charging at the station.");
    }
}

class PetrolCar implements Driveable {
    public void drive() {
        System.out.println("PetrolCar is driving with engine noise.");
    }
}

public class Exercises5 {
    public static void main(String[] args) {
        ElectricCar obj = new ElectricCar();
        PetrolCar obj1 = new PetrolCar();
        obj.drive();
        obj.charge();

        obj1.drive();
    }
}
