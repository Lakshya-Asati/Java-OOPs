// 4. Modern Inheritance using 'sealed' and 'permits' (Java 17+)
// Only ElectricBike is permitted to extend TwoWheeler
sealed class TwoWheeler permits ElectricBike {
    protected int batteryCapacity;
}

non-sealed class ElectricBike extends TwoWheeler {
    public ElectricBike(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}