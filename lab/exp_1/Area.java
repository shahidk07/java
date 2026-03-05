import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter base of triangle: ");
        float base = sc.nextFloat();
        
        System.out.print("Enter height of triangle: ");
        float height = sc.nextFloat();
        
        float area = (base * height) / 2;
        
        System.out.println("Area of Triangle = " + area);
        
        sc.close();
    }
}