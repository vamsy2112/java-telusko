class Calculator {

    // Method overloading refers to the ability of having a method of same name but
    // weither with different no. of params or different same no. of params but with
    // different types
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

}

public class MethodOverloading {
    public static void main(String args[]) {
        Calculator calc = new Calculator();
        int result = calc.add(1, 2);
        System.out.println(result);
    }
}
