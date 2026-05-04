public class Test {

    int i;

    Test() {
        this.i = 1;
        System.out.println("constructor 1 used");
    }

    public static void main(String[] args) {
        Test obj = new Test();
    }
}