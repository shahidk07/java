package nested_class;

class Outer{
    static class Nested{
        void display(){
            System.out.println("This is a static nested class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.Nested obj=new Outer.Nested();
        obj.display();
    }
    