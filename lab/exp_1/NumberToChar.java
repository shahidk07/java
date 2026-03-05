import java.util.Scanner;

public class NumberToChar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number (0–9): ");
        int num = sc.nextInt();
        
        char ch = (char) (num + '0');  // Convert number to character
        
        System.out.println("Character value is: " + ch);
        
        sc.close();
    }
}