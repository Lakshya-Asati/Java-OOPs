class Vehicle {
    // 'protected' allows direct access to subclasses
    protected String brand;
    protected int speed;

    // Parent Constructor
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void start() {
        System.out.println(brand + " is starting engine...");
    }

    // 'final' method: Subclasses cannot override this
    public final void inspectVehicle() {
        System.out.println("Performing mandatory safety inspection on " + brand);
    }
}