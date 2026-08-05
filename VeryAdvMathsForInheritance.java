
public class VeryAdvMathsForInheritance extends AdvMathsForInheritance { // multi-level inheritance is possible but
                                                                         // miltiple inheritance is not possible in
                                                                         // JAVA.
    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static void main(String args[]) {
        VeryAdvMathsForInheritance obj = new VeryAdvMathsForInheritance();
        System.out.println(obj.add(5, 6) + " , " + obj.power(4, 2));
    }
}
