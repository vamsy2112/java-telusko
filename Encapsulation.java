class Human {
    int age = 11; // instance variable
    String name;

    // whole idea of encapsulation is to keep the data binded. no one should be able
    // to access it directly.
    // 1. create a private variables
    private int age1 = 29; // *************** Make sure to make all the instance variables as private.
                           // **************
    private String name1 = "Vamsy";

    // 2. these private variavbles can only be accesses in the same class. no other
    // ones.
    // 3. these can only be access with the help of methods of same class.
    public int getAge() {
        return age1;
    }

    public String getName() {
        return name1;
    }

    // 4. what if the variabkes values to provided dymnamically?
    // 5. you need to set the values not only getting it via methods in same class.

    private int age2;
    private String name2;

    public void setAge2(int a) {
        age2 = a;
    }

    public int getAge2() {
        return age2;
    }

    public void setName2(String n) {
        name2 = n;
    }

    public String getName2() {
        return name2;
    }

}

public class Encapsulation {
    public static void main() {
        Human obj = new Human(); // create a reference of the class
        System.out.println(obj.age); // access the properties of class via the reference created

        System.out.println(obj.getAge()); // this is how you access the private variables inside main method via methods
                                          // and obj references.

        System.out.println(obj.getName() + " : " + obj.getAge());

        // accessing the values from getters and setters
        obj.setAge2(25);
        obj.setName2("Payal");

        System.out.println(obj.getName2() + " : " + obj.getAge2()); // completely binded data to the world.
    }

}
