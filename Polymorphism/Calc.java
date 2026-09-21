// Demonstrating Method Overloading inside a Utility Class
class Calc {
    // Overloaded Method 1: Takes two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded Method 2: Takes three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded Method 3: Takes two doubles
    double add(double a, double b) {
        return a + b;
    }
}