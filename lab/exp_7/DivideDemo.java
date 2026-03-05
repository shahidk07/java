public class DivideDemo {

    static void divide(int a, int b) {
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            divide(a, b);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}