
// Problem 3:Abstraction—Shape Hierarchy Goal:Abstract classes force subclasses to implement behavior.Create an
// abstract class Shape with:An
// abstract method area() returning double

// A concrete (non-abstract)

// method describe() that prints "This is a shape with area: {area()}"
// Create subclasses Circle and Rectangle, each implementing area() appropriately.
// In main(): store both in a Shape[] array, loop through and

// call describe() on each.
// Expected output pattern:
// This is a shape with area: 78.53975
// This is a shape with area: 24.0
// Think about: why can't you write Shape s = new Shape();? What error would Java give you?

abstract class Shape {
    public abstract double area();

    public final double PI = 3.14159;
    public final double radius = 5.0;
    public final int length = 8;
    public final int breadth = 3;

    public void describe() {
        System.out.println("This is a shape with area: " + area());
    }
}

class Circle extends Shape {
    public double area() {
        return PI * radius * radius;
    }
}

class Rectangle extends Shape {
    public double area() {
        return length * breadth;
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Circle obj = new Circle();
        Rectangle obj1 = new Rectangle();

        Shape arr[] = { obj, obj1 };

        for (Shape i : arr) {
            System.out.println(i.area());
        }
    }
}

// Think about: why can't you write Shape s = new Shape();? What error would
// Java give you? - we cannot create an object of an abstract class.