import tools.PackageCalc; // you have to import PackageCalc before using it since Demo and this are on different folder level.
// Packages are nothing but folders. (Refer to PackageCalc, PackageAdvCalc as well for proper understanding)

public class PackageDemo {
    public static void main(String args[]) {
        PackageCalc obj = new PackageCalc(); // unless and until you import PackageCalc, you cannot use it here for
                                             // object creation.
        int r2 = obj.add(3, 7);
        System.out.println(r2);
    }
}
