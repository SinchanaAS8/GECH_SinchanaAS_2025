package assignment_24_03_25;

class BankAccount {
    // Private fields
    private String accountNumber;
	private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	} 

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display account details
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

    // Getter for balance (if needed)
    public double getBalance() {
        return balance;
    }
}

public class Task1 {

	public static void main(String[] args) {
        // Creating a bank account object
        BankAccount myAccount = new BankAccount("123456789", "Shiva", 500.0);

        // Displaying initial details
        myAccount.displayAccountInfo();

        // Performing transactions
        myAccount.deposit(200);
        myAccount.withdraw(100);
        myAccount.withdraw(700); 
        System.out.println(" ");

        // Display final details
        myAccount.displayAccountInfo();


	}

}
