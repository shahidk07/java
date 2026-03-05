import java.util.Arrays;
import java.util.List;

public class SumEvenOddGeneric {

    public static <T extends Number> double[] sumEvenOdd(List<T> list) {

        double evenSum = 0;
        double oddSum = 0;

        for (T n : list) {
            long v = n.longValue();

            if (v % 2 == 0)
                evenSum += n.doubleValue();
            else
                oddSum += n.doubleValue();
        }

        return new double[]{evenSum, oddSum};
    }

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 11, 12, 13, 14);

        double[] res = sumEvenOdd(nums);

        System.out.println("Even Sum = " + res[0]);
        System.out.println("Odd Sum = " + res[1]);
    }
}