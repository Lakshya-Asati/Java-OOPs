// 3. Concrete class using 'implements' for interface and 'extends' for abstract class
class CreditCardPayment extends NotificationService implements PaymentGateway {

    public CreditCardPayment(String senderName) {
        super(senderName); // Calling abstract class constructor
    }

    // Overriding abstract method from PaymentGateway interface
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }

    // Overriding abstract method from NotificationService abstract class
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}