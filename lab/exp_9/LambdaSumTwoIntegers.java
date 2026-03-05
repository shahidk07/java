@FunctionalInterface
interface SumTwo {
    int add(int a, int b);
}

public class LambdaSumTwoIntegers {

    public static void main(String[] args) {

        SumTwo s = (a, b) -> a + b;

        System.out.println("Sum = " + s.add(10, 20));
    }
}