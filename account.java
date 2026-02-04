public class account {

    private String accountNumber;
    private double balance;

    public account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public static void main(String[] args) {
        account myAccount = new account("123456789", 1000.0);
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Initial Balance: $" + myAccount.getBalance());

        myAccount.deposit(500.0);
        System.out.println("Balance after deposit: $" + myAccount.getBalance());

        myAccount.withdraw(200.0);
        System.out.println("Balance after withdrawal: $" + myAccount.getBalance());
    }
    
}
