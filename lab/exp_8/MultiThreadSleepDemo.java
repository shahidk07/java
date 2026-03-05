public class MultiThreadSleepDemo {

    static class Worker extends Thread {

        Worker(String name) {
            super(name);
        }

        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(getName() + " -> " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread mainThread = Thread.currentThread();
        mainThread.setName("MainThread");

        Worker userThread = new Worker("UserThread");
        userThread.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println(mainThread.getName() + " -> " + i);
            Thread.sleep(1000);
        }

        userThread.join();
        System.out.println("Both threads finished.");
    }
}