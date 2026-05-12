import java.lang.Thread;

public class thrd implements Runnable {
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        thrd obj=new thrd();//object containing the task
        Thread t1=new Thread(obj); //you are passing the task (obj) to the thread.
     //“Create a worker thread and assign this task to it.”
     
     t1.start();
    }
}
