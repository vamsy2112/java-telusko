// import tools.PackageCalc; // you have to import PackageCalc before using it since Demo and this are on different folder level.
// Packages are nothing but folders. (Refer to PackageCalc, PackageAdvCalc as well for proper understanding)

import tools.*; // * means importing all the FILES instead of folders. so for folders must write the full import statement until the files location.
import tools.others.*;

public class PackageDemo {
    public static void main(String args[]) {
        PackageCalc obj = new PackageCalc(); // unless and until you import PackageCalc, you cannot use it here for
                                             // object creation.

        DeepLevelPackage obj1 = new DeepLevelPackage(); // this will only work when we import tools.others.* since
                                                        // others is a separate folder and * is only meant for files and
                                                        // not folders.
        int r2 = obj.add(3, 7);
        System.out.println(r2);
    }
}
