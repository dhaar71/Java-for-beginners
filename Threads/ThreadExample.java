package Threads;
class ChildThread1 extends Thread {
    public ChildThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 250; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}

class ChildThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 251; i <= 500; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        System.out.println("Main Thread: Greetings from 501 to 700.");
        for (int i = 501; i <= 700; i++) {
            System.out.println("Main Thread: Greetings from " + i);
        }

        ChildThread1 thread1 = new ChildThread1("Child-Thread1");
        Thread thread2 = new Thread(new ChildThread2(), "Child-Thread2");

        thread1.start();
        thread2.start();
    }
}
