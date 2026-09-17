public class Main {
    public static void main(String[] args) {
        // Calling static interface method using interface name
        if (PaymentGateway.validateCurrency("USD")) {
            System.out.println("Currency is valid.");
        }

        // Instantiating concrete class (Reference type is Interface/Abstract Class for abstraction)
        PaymentGateway payment = new CreditCardPayment("SecurePay Gateway");
        payment.processPayment(250.00);
        payment.generateReceipt(250.00); // Uses default interface method

        NotificationService notification = (NotificationService) payment;
        notification.printSenderInfo();
        notification.sendNotification("+1234567890", "Payment of $250.00 was successful!");
    }
}