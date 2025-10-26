package Day9;

class NumberPrinter implements Runnable {
    private int threadId;
    private static int number = 1;
    private static final int MAX = 10;
    private static final Object lock = new Object();

    public NumberPrinter(int id) {
        this.threadId = id;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                while (number <= MAX && number % 3 != threadId) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (number > MAX) {
                    lock.notifyAll();
                    break;
                }

                System.out.println("Thread " + threadId + " -> " + number);
                number++;
                lock.notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberPrinter(1));
        Thread t2 = new Thread(new NumberPrinter(2));
        Thread t3 = new Thread(new NumberPrinter(0)); // for multiples of 3

        t1.start();
        t2.start();
        t3.start();
    }
}
