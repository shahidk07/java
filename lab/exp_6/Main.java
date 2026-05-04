class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";

    void display() {
        System.out.println("Using super: " + super.name);
        System.out.println("Using this: " + this.name);
    }
}

class StaticDemo {
    static int count = 0;

    StaticDemo() {
        count++;
    }

    void showCount() {
        System.out.println("Count: " + count);
    }
}

public class Main {
    public static void main(String[] args) {

        // Demonstrate super and this
        Child obj = new Child();
        obj.display();

        // Demonstrate static
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        StaticDemo obj3 = new StaticDemo();

        obj3.showCount();
    }
}