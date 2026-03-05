abstract class A {
    abstract void call();
}

public class B extends A {
    void call() {
        System.out.println("call me from B");
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.call();
    }
}