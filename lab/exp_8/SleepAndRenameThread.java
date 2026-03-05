public class SleepAndRenameThread {
   public static void main(String[] args) throws InterruptedException {
       Thread t = Thread.currentThread();

       System.out.println("Old thread name: " + t.getName());
       t.setName("MyMainThread");
       System.out.println("New thread name: " + t.getName());

       System.out.println("Sleeping for 5 seconds...");
       Thread.sleep(5000);

       System.out.println("Awake!");
   }
}