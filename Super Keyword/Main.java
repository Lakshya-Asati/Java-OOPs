// Parent Class (Superclass)
class Vehicle {
    String brand = "Generic Vehicle"; // Parent variable

    // Parent Constructor
    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called. Brand: " + this.brand);
    }

    // Parent Method
    void startEngine() {
        System.out.println("Vehicle engine starts.");
    }
}

// Child Class (Subclass)
class Car extends Vehicle {
    String brand = "Sports Car"; // Shadowing parent variable

    // Child Constructor
    Car(String brandName) {
        // 1. Using super() to call Parent Constructor
        // Must be the VERY FIRST statement inside the child constructor
        super(brandName); 
        System.out.println("Car constructor called.");
    }

    void displayInfo() {
        // 2. Using super to access Parent Variable
        System.out.println("Child brand field: " + this.brand);
        System.out.println("Parent brand field: " + super.brand);
    }

    @Override
    void startEngine() {
        // 3. Using super to call Parent Method before adding custom child logic
        super.startEngine(); 
        System.out.println("Car engine tuned for high speed!");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");

        System.out.println("-------------------------");
        myCar.displayInfo();

        System.out.println("-------------------------");
        myCar.startEngine();
    }
}