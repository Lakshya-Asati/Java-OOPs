// 3. 'final' Class: Cannot be extended by any other class
final class SportsCar extends Car {
    private boolean turboEnabled;

    public SportsCar(String brand, int speed, int numberOfDoors, boolean turboEnabled) {
        super(brand, speed, numberOfDoors);
        this.turboEnabled = turboEnabled;
    }

    public void enableTurbo() {
        if (turboEnabled) {
            System.out.println(brand + " turbo engaged! Speed boosting beyond " + speed + " km/h.");
        }
    }
}