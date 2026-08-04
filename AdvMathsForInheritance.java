public class AdvMathsForInheritance extends Maths {

    public int multi(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public static void main(String args[]) {
        AdvMathsForInheritance obj = new AdvMathsForInheritance();

        System.out.println(obj.add(5, 4) + " , " + obj.multi(5, 4) + " , " + obj.div(15, 3));

    }
}
