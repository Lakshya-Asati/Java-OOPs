abstract class NotificationService {
    private final String senderName; // State/field allowed in abstract classes

    // Constructor in an abstract class (called via 'super' by subclasses)
    public NotificationService(String senderName) {
        this.senderName = senderName;
    }

    // Abstract method: Must be implemented by subclasses
    public abstract void sendNotification(String recipient, String message);

    // Concrete method: Shared functionality
    public void printSenderInfo() {
        System.out.println("Notification sent by system: " + this.senderName);
    }
}