package Threads;
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hiiiii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
        }
    }
}

public class thread1 {
    public static void main(String args[]) {

        A obj1 = new A();
        B obj2 = new B();

        // PRIORITY
        // obj2.setPriority(Thread.MAX_PRIORITY);

        System.out.println(obj2.getPriority());

        obj1.start();  // threads running parallel
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        obj2.start();
    }
}
