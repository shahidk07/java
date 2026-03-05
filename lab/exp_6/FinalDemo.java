final class FinalClass {}

public class FinalDemo {
    final int x = 10;

    final void show() {
        System.out.println("Final method");
    }

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.show();
        System.out.println("Final variable: " + obj.x);
    }
}