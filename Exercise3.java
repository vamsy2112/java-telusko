
// Problem 2:final—Immutable Circle Goal:Understand final on variables,and building immutable objects.Create
// class Circle with:A
// static final double PI = 3.14159(class-
// level constant)A

// private final double radius (set once in constructor, never changed after)
// A method calculateArea() using PI * radius * radius
// No setter for radius — prove it's immutable

// In main(): create a Circle, print its area. Then (as a comment) try to write code that would reassign radius — it should not compile. Explain in a one-line comment why.
// Expected output pattern:
// Circle with radius 5.0 has area: 78.53975
// Think about: what's the difference between final on a primitive vs final on an

// object reference (e.g. final List<String> names)?

class Circle {
    static final double PI = 3.14159;
    private final double radius;

    Circle() {
        radius = 5;
    }

    public double calculateAread() {
        return PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Circle obj = new Circle();
        // radius = 10; // we cannot re assign the radius variable since it is a final
        // variable.
        System.out.println("Circle with radius " + obj.getRadius() + " has area: " + obj.calculateAread());
    }
}
