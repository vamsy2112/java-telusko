
class A {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

public class ThreadSafe {
    public static void main(String[] args) {

        A obj = new A();

        Runnable obj1 = () -> {
            {
                for (int i = 0; i < 1000; i++) {
                    obj.increment();
                }
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 1000; i++) {
                obj.increment();
            }

        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(obj.count); // this will not give the correct output because both threads are trying to
                                       // access the same variable at the same time. so we need to make it thread safe.

    }
}
