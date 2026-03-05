public class ThrowDemo {

    static void test() throws Exception {
        throw new Exception("Custom Exception");
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}