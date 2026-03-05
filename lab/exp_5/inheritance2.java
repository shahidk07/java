public class inheritance2 {
    
}
class Shape {
    double getArea() { return 0; }
    double getPerimeter() { return 0; }
   }
   class Circle extends Shape {
    double r = 5;
    double getArea() { return Math.PI * r * r; }
    double getPerimeter() { return 2 * Math.PI * r; }
   }
   class Rectangle extends Shape {
    double l = 4, b = 6;
    double getArea() { return l * b; }
    double getPerimeter() { return 2 * (l + b); }
   }
   class Triangle extends Shape {
    double a = 3, b = 4, c = 5;
    double getArea() { return 6; }
    double getPerimeter() { return a + b + c; }
   }