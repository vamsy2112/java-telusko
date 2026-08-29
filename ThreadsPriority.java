
class Murty extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("hi");
            // Thread.currentThread().getPriority();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class Yamini extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10); // this pauses the thread execution for 10 milliseconds
                // remember that we can only optimise but this doesnt mean that we can force the
                // scheduler to act according to our priority., Basically scheduler ek baar
                // decide ho gaya toh vo khudki bhi nai sunta 😂
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class ThreadsPriority {
    public static void main(String[] args) {

        Murty obj1 = new Murty();
        Yamini obj2 = new Yamini();

        obj1.setPriority(Thread.MAX_PRIORITY); // this is how we set the thread priority.
        // MAX_PRIORITY is 10 & MIN_PRIORITY is 1.

        obj1.start();
        System.out.println(Thread.currentThread().getPriority());
        obj2.start();
    }
}
