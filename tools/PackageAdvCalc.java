package tools;

public class PackageAdvCalc extends PackageCalc {
    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }

    public static void main(String[] args) {
        PackageAdvCalc obj = new PackageAdvCalc();
        int r1 = obj.add(4, 5);
        System.out.println(r1);
    }
}
