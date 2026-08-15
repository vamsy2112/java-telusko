
// Problem 5:Inheritance+Polymorphism—Animal Sounds Goal:Practice super,method overriding,and runtime polymorphism together.Base
// class Animal
// with a

// method makeSound() printing "Some generic animal sound"
// Subclass Dog

// overrides makeSound() to print "Woof!", but first calls super.makeSound() too
// Subclass Cat

// overrides makeSound() to print "Meow!" (no super call)

// In main(): create Animal a1 = new Dog(); and Animal a2 = new Cat();,

// call makeSound() on both.
// Expected output pattern:
// Some generic animal sound
// Woof!
// Meow!
// Think about: this is the same pattern as your Employee/Manager exercise — what's the general rule for when Java decides which makeSound() to run?

class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {

    public void makeSound() {
        // super.makeSound() is only used inside an overriding method in the subclass.

        // It does not mean “call all parent methods.” It means “call this exact method
        // from the parent class.”
        super.makeSound();
        System.out.println("woof!");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound();
        a2.makeSound();
    }
}
