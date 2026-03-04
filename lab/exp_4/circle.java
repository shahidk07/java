import java.util.Scanner;

public class circle {
    float radius;
    float perimeter;
    float Area;
    void CircleArea(float radius){
         Area=3.14f*radius*radius;
        
    }

    void CirclePerimeter(float radius){
        perimeter=2 * 3.14f *radius;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the radius of circle");
        float radius=scn.nextFloat();

        circle c1=new circle();
        c1.CircleArea(radius);
        c1.CirclePerimeter(radius);

        System.out.println("Area of circle is "+c1.Area);
        System.out.println("Perimeter of circle is "+c1.perimeter);

    }
}
