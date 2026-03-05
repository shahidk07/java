public class Outer {

    static class StaticNested {
        void display() {
            System.out.println("Static Nested Class");
        }
    }

    class Inner {
        void show() {
            System.out.println("Inner Class");
        }
    }

    public static void main(String[] args) {
        StaticNested sn = new StaticNested();
        sn.display();

        Outer o = new Outer();
        Outer.Inner in = o.new Inner();
        in.show();
    }
}