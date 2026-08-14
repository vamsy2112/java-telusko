// TODO: Create an class called Employee

class Employee {
    private String name;
    private double salary;

    public Employee() {
        name = "Alice";
        salary = 50_000;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void getDetails() {
        System.out.println("Name: " + getName() + ", Salary: " + getSalary());
    }
}

// TODO: Create a class Manager that:
// - Extends Employee

class Manager extends Employee {
    private String department;

    Manager() {
        super();
        department = "IT";
        setName("Bob");
        setSalary(80_000);
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void getDetails() {
        System.out.println(
                "Name: " + this.getName() + ", Salary: " + this.getSalary() + ", Department: " + this.getDepartment());
    }
}

public class Exercise {
    public static void main(String[] args) {
        // TODO: Create Employee and Manager objects

        Employee obj = new Employee();
        Employee obj1 = new Manager();

        // TODO: Print their details using getDetails()
        obj.getDetails();
        obj1.getDetails();
    }
}
