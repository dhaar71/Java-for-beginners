// package Threads;
import java.util.LinkedList;

class Buffer {
    private LinkedList<Integer> buffer;
    private int capacity;

    public Buffer(int capacity) {
        this.buffer = new LinkedList<>();
        this.capacity = capacity;
    }

    public void produce(int item) {
        synchronized (this) {
            while (buffer.size() == capacity) {
                try {
                    wait(); // Wait if the buffer is full
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            buffer.add(item);
            System.out.println("Produced: " + item);
            notifyAll(); // Notify consumers that an item is available
        }
    }

    public void consume() {
        synchronized (this) {
            while (buffer.isEmpty()) {
                try {
                    wait(); // Wait if the buffer is empty
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            int item = buffer.remove();
            System.out.println("Consumed: " + item);
            notifyAll(); // Notify producers that space is available
        }
    }
}

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            buffer.produce(i);
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            buffer.consume();
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class ProducerConsumerDuo {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5); // Buffer with a capacity of 5

        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}

