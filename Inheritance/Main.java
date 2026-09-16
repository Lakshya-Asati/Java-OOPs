public class Main {
    public static void main(String[] args) {
        // Instantiate child object
        SportsCar myCar = new SportsCar("Porsche", 280, 2, true);

        // Inherited method from Vehicle
        myCar.inspectVehicle(); 

        // Overridden method execution
        myCar.start(); 

        // Specific child methods
        myCar.honk();
        myCar.enableTurbo();

        // Using 'instanceof' keyword to check inheritance hierarchy
        if (myCar instanceof Vehicle) {
            System.out.println("myCar IS-A Vehicle!");
        }
    }
}