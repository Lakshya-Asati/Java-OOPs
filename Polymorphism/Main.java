public class Main {
    public static void main(String[] args) {
        // 1. COMPILE-TIME POLYMORPHISM (Method Overloading)
        Calc cal = new Calc();
        System.out.println("Add 2 ints: " + cal.add(5, 10));          // Calls add(int, int)
        System.out.println("Add 3 ints: " + cal.add(5, 10, 15));      // Calls add(int, int, int)
        System.out.println("Add doubles: " + cal.add(2.5, 4.5));      // Calls add(double, double)

        System.out.println("-----------------------------------");

        // 2. RUN-TIME POLYMORPHISM (Method Overriding & Upcasting)
        // Reference type is Shape, but underlying objects are Circle and Square
        Shape shape1 = new Circle(); 
        Shape shape2 = new Square(); 

        shape1.draw(); // Output: Drawing a Circle 🔴
        shape2.draw(); // Output: Drawing a Square ⬛

        // 3. Using 'instanceof' operator to verify object types
        if (shape1 instanceof Circle) {
            System.out.println("shape1 is indeed an instance of Circle.");
        }
    }
}