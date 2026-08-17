
// GOAL: Lambda Expressions with return type

// 1. creating a functional interface

@FunctionalInterface
interface LEAdvanced {

    int add(int a, int b);
}

// 2. creating concrete class implementing interface
// class LEAdvancedWithReturn implements LEAdvanced {

// public void add(int a, int b) {
// System.out.println("sum is: " + a + b);
// }
// }

public class LambdaExpressionsAdvanced {
    public static void main(String[] args) {

        // 3. creating obj of parent with parent reference only and have the anonymous
        // inner class

        LEAdvanced obj = (a, b) -> {
            return a + b;
        };

        int result = obj.add(5, 4);
        System.out.println(result);
    }
}
