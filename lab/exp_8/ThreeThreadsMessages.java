public class ThreeThreadsMessages {

    static class MsgThread extends Thread {

        private final String msg;
        private final int delayMs;

        MsgThread(String name, String msg, int delayMs) {
            super(name);
            this.msg = msg;
            this.delayMs = delayMs;
        }

        public void run() {
            try {
                while (true) {
                    System.out.println(msg);
                    Thread.sleep(delayMs);
                }
            } catch (InterruptedException e) {
                // stop thread
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new MsgThread("T1", "Good Morning", 1000);
        Thread t2 = new MsgThread("T2", "Hello", 2000);
        Thread t3 = new MsgThread("T3", "Welcome", 3000);

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(10000);

        t1.interrupt();
        t2.interrupt();
        t3.interrupt();

        System.out.println("Stopped after 10 seconds.");
    }
}