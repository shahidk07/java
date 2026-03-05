class Shape {
    double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    double r = 5;

    double calculateArea() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
    double l = 4, b = 6;

    double calculateArea() {
        return l * b;
    }
}

class Triangle extends Shape {
    double b = 4, h = 5;

    double calculateArea() {
        return 0.5 * b * h;
    }
}

public class inheritance {
    public static void main(String[] args) {

        Shape s;

        s = new Circle();
        System.out.println("Circle Area: " + s.calculateArea());

        s = new Rectangle();
        System.out.println("Rectangle Area: " + s.calculateArea());

        s = new Triangle();
        System.out.println("Triangle Area: " + s.calculateArea());
    }
}



