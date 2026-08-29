
//NOTES:
// 1. if you want to assign new threads, then extend the existing class to Thread class.
// 2. make sure the methods inside the classes must have name run() only.
// 3. when you want to call these methods, then ou have to call with obj.start(). see line number 27, 28.
// 4. and that's it, you've assigned new threads for each of these classes. now it depends on the SCHEDULER to assign the priority among these classes to be executed.
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
