class Calculator {
    int a;
    int b;
    int r;

    public int add(int a, int b) {
        r = a + b;
        return r;
    }
}

public class Demo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int result = calc.add(5, 3);
        System.out.println("The result of addition is: " + result);
    }
}
