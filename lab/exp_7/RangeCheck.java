import java.util.Scanner;

public class RangeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 10 || n > 50)
            throw new RuntimeException("Out of range");
        else
            System.out.println("Square: " + (n * n));
    }
}