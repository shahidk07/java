public class ReverseSleepThread {
    public static void main(String[] args) throws InterruptedException {

        Thread t = Thread.currentThread();
        t.setName("ReverseCounterThread");
        System.out.println("Thread name: " + t.getName());

        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
            Thread.sleep(6000);
        }
    }
}