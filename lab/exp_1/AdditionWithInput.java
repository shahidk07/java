import java.util.Scanner;

public class AdditionWithInput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter a float value: ");
        float num3 = sc.nextFloat();
        
        float sum = num1 + num2 + num3;
        
        System.out.println("\n--- Result ---");
        System.out.println("First Integer: " + num1);
        System.out.println("Second Integer: " + num2);
        System.out.println("Float Value: " + num3);
        System.out.println("Total Sum: " + sum);
        
        sc.close();
    }
}