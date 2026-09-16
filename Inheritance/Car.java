class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor using 'super' to invoke the parent constructor
    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed); // Calls Vehicle(brand, speed)
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public void start() {
        // Calling the parent class method using 'super'
        super.start();
        System.out.println("Car system checks complete. Ready to drive with " + numberOfDoors + " doors.");
    }

    public void honk() {
        System.out.println(brand + " says: Beep Beep!");
    }
}