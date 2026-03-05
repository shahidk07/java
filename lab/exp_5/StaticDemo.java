class StaticDemo {
    static int count = 0;
    StaticDemo() { count++; }
    static void showCount() {
    System.out.println("Objects created: " + count);
    }
    public static void main(String[] args) {
    new StaticDemo();
    new StaticDemo();
    StaticDemo.showCount();
    }
   }