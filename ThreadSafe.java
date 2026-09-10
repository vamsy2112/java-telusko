
class A implements Runnable {
    public void run() {
        int count = 0;

        count = count + 1;
    }
}

class B implements Runnable {
    public void run() {
        int count = 0;

        count = count + 1;
    }
}

public class ThreadSafe {
    public static void main(String[] args) {

        // Runnable obj1 = new Runnable();
        // B obj2 = new B();

        // obj1.start();
        // obj2.start();

    }
}
