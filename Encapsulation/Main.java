// 1. Fully Encapsulated Standard Class
class BankAccount {
    // 'private' hides data from direct external modification
    // 'final' ensures accountNumber cannot be altered after creation
    private final String accountNumber;
    private double balance;

    // Constructor using 'this' keyword to initialize instance fields
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0;
        }
    }

    // 'public' Getter: Controlled read access
    public String getAccountNumber() {
        return this.accountNumber;
    }

    // 'public' Getter: Controlled read access
    public double getBalance() {
        return this.balance;
    }

    // 'public' Setter/Mutator with business logic validation
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

// 2. Modern Encapsulation using 'record' (Java 14+)
// Automatically creates private final fields and public accessor methods
record UserSession(String sessionId, long loginTimestamp) {}

// Main Execution Class
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC-10293", 500.00);

        // Accessing data through public getters
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Modifying data safely through public mutator methods
        account.deposit(250.00);
        account.withdraw(1000.00); // Fails validation safely without corrupting balance
        
        System.out.println("Final Balance: $" + account.getBalance());

        // Using Java Record
        UserSession session = new UserSession("SESS-9981", System.currentTimeMillis());
        System.out.println("Session ID: " + session.sessionId());
    }
}