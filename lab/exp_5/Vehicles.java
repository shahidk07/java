class Vehicle {
    String make, model, fuelType;
    int year;

    double fuelEfficiency() {
        return 0;
    }

    double maxSpeed() {
        return 0;
    }
}

class Car extends Vehicle {
    double fuelEfficiency() {
        return 15;
    }

    double maxSpeed() {
        return 180;
    }
}

class Truck extends Vehicle {
    double fuelEfficiency() {
        return 8;
    }

    double maxSpeed() {
        return 120;
    }
}

class Motorcycle extends Vehicle {
    double fuelEfficiency() {
        return 40;
    }

    double maxSpeed() {
        return 200;
    }
}

public class Vehicles {
    public static void main(String[] args) {

        Vehicle v;

        v = new Car();
        System.out.println("Car Fuel Efficiency: " + v.fuelEfficiency());
        System.out.println("Car Max Speed: " + v.maxSpeed());

        v = new Truck();
        System.out.println("\nTruck Fuel Efficiency: " + v.fuelEfficiency());
        System.out.println("Truck Max Speed: " + v.maxSpeed());

        v = new Motorcycle();
        System.out.println("\nMotorcycle Fuel Efficiency: " + v.fuelEfficiency());
        System.out.println("Motorcycle Max Speed: " + v.maxSpeed());
    }
}