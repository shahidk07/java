class Parent {
    String name = "Parent Class";
   }
   class Child extends Parent {
    String name = "Child Class";
    void display() {
    System.out.println("Parent name: " + super.name);
    System.out.println("Child name: " + this.name);
    }
    public static void main(String[] args) {
    Child obj = new Child();
    obj.display();
    }
   }