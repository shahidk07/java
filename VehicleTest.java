 class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;
}

class Truck extends Vehicle {
    float distance,speed,time;

    
    Truck(float speed,float time){
        this.speed=speed;
        this.time=time;
    }

    void maxSpeed() {
        System.out.println("Max speed is "+ speed+ "km/h");
    }
    void fuelEfficiency(){
        System.out.println("Fuel Efficiency: 15 km/l");
    }

    void distanceTravelled(){
        float distance=speed*time;
        System.out.println(distance);
    }


}

class Bike extends Vehicle{
    float distance,speed,time;
    
    Bike(float speed,float time){
        this.speed=speed;
        this.time=time;
    }
    
    void maxSpeed() {
        System.out.println("Max speed is "+ speed+ "km/h");
    }

    void fuelEfficiency(){
        System.out.println("Fuel Efficiency: 55 km/l");
    }

    void distanceTravelled(){
        float distance=speed*time;
        System.out.println(distance);
    }

}

class Car extends Vehicle{
    float distance,speed,time;

    Car(float speed,float time){
        this.speed=speed;
        this.time=time;
    }

    void maxSpeed() {
        System.out.println("Max speed is "+ speed+ "km/h");
    }
    void fuelEfficiency(){
        System.out.println("Fuel Efficiency: 45 km/l");
    }

    void distanceTravelled(){
        float distance=speed*time;
        System.out.println(distance);
    }

}

public class VehicleTest{
    public static void main(String[] args) {
        Car c1=new Car(500, 60);
        Bike b1=new Bike(400, 100);
        Truck t1=new Truck(150, 220);

        c1.distanceTravelled();
        
    }
}