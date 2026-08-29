
class Bablu extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("hi");
        }
    }
}

class Sailu extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("Hello");
        }
    }
}

public class ThreadsInJava {
    public static void main(String[] args) {
        Bablu obj1 = new Bablu();
        Sailu obj2 = new Sailu();

        obj1.start();
        obj2.start();
    }
}
