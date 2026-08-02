
class Human {
    private int age;
    private String name;

    public Human() { // this is a constructor. its a special method where you dont have to mention
                     // return type.
        // 1. this will be print as many times as the number of objects you create.
        // 2. even if we dont create this constructor, it will be created by java
        // automatically for us but it will be blank.
        // 3. this is created to override default values as 0 the ones we provide.
        age = 12;
        name = "babloo";
    }

    // 4. there can be another constructor called as parameterised constructor just
    // in case if we want to have a feasibility of passing the values as parameters

    public Human(int age, String name) { // parameterised constructor
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Constructors {
    public static void main(String args[]) {
        Human obj = new Human();

        // obj.setAge(30);
        // obj.setName("vamsy");
        System.out.println(obj.getName() + " : " + obj.getAge());
        Human obj1 = new Human(45, "gannavarapu"); // creating a new object with parameters.
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}
