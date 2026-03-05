abstract class Vehicle {
    abstract void engine();
}

class Car extends Vehicle {
    void engine() {
        System.out.println("Car has a good engine");
    }
}

public class Truck extends Vehicle {
    void engine() {
        System.out.println("Truck has a bad engine");
    }

    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Truck();
        v1.engine();
        v2.engine();
    }
}