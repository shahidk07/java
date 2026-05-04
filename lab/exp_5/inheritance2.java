public class inheritance2 {

    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();

        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Circle Perimeter: " + c.getPerimeter());

        System.out.println("Rectangle Area: " + r.getArea());
        System.out.println("Rectangle Perimeter: " + r.getPerimeter());

        System.out.println("Triangle Area: " + t.getArea());
        System.out.println("Triangle Perimeter: " + t.getPerimeter());
    }
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