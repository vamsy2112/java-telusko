
class Computer {
    public void compileCode() {

    }
}

class Laptop extends Computer {
    public void compileCode() {
        System.out.println("Compiling code");
    }
}

class Desktop extends Computer {
    public void compileCode() {
        System.out.println("Compiling code from desktop");
    }
}

class Developer {
    public void writeCode(Computer lap) {
        // System.out.println("Writing code");
        lap.compileCode();
    }
}

public class NeedOfInterfaces {
    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer obj = new Developer();
        // obj.writeCode(obj1);

        obj.writeCode(lap);

    }
}
