package Threads;
class NumberPrinter {
    private int max;
    private int number = 1;
    private boolean isOdd = true;

    public NumberPrinter(int max) {
        this.max = max;
    }

    public synchronized void printOdd() {
        while (number <= max) {
            while (!isOdd) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            System.out.println("Odd " + number);
            number++;
            isOdd = false;
            notify();
        }
    }

    public synchronized void printEven() {
        while (number <= max) {
            while (isOdd) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            System.out.println("Even " + number);
            number++;
            isOdd = true;
            notify();
        }
    }
}

public class OddEvenNumberPrinter {
    public static void main(String[] args) {
        NumberPrinter numberPrinter = new NumberPrinter(20);

        Thread oddThread = new Thread(() -> {
            numberPrinter.printOdd();
        });

        Thread evenThread = new Thread(() -> {
            numberPrinter.printEven();
        });

        oddThread.start();
        evenThread.start();
    }
}
