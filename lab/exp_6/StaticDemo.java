class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";

    void display() {
        System.out.println(super.name);
        System.out.println(this.name);
    }
}

public class StaticDemo {
    static int count = 0;

    StaticDemo() {
        count++;
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.display();

        StaticDemo s1 = new StaticDemo();
        StaticDemo s2 = new StaticDemo();

        System.out.println("Count: " + StaticDemo.count);
    }
}