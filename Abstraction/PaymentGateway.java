    // 1. Defining a Contract using 'interface'
interface PaymentGateway {
    // Abstract method (implicitly public and abstract)
    void processPayment(double amount);

    // 'default' keyword: Provides a default implementation
    default void generateReceipt(double amount) {
        logTransaction("Receipt generated for: $" + amount);
    }

    // 'static' keyword: Utility method associated with the interface
    static boolean validateCurrency(String currencyCode) {
        return currencyCode.equalsIgnoreCase("USD") || currencyCode.equalsIgnoreCase("INR");
    }

    // 'private' keyword (Java 9+): Internal helper method for encapsulation inside interface
    private void logTransaction(String message) {
        System.out.println("[LOG]: " + message);
    }
}

