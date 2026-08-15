
// Problem 1:static—Bank Account System Goal:Understand that static belongs to the class,not any one object.Create
// class BankAccount with:
// Private fields:

// accountHolder (String), balance (double), accountNumber (int)
// A

// static field nextAccountNumber
// starting at 1001
// A constructor
// that auto-assigns accountNumber = nextAccountNumber++(no accountNumber
// param needed)A

// static method getTotalAccountsCreated() that returns how many accounts exist
// A method showAccount() printing account details

// In main(): create 3 accounts, print each one's account number, then

// call getTotalAccountsCreated() once via the class name (not an object).
// Expected output pattern:
// Account #1001 - Holder: Alice - Balance: 5000.0
// Account #1002 - Holder: Bob - Balance: 3000.0
// Account #1003 - Holder: Carol - Balance: 7000.0
// Total accounts created: 3
// Think about: why does nextAccountNumber need to be static? What breaks if it isn't?

class BankAccount {
    private String accountHolder;
    private double balance;
    private double accountNumber;

    static int nextAccountNumber = 1001;

    BankAccount() {
        accountNumber = nextAccountNumber++;
        System.out.println("Bank account created. Account number: " + accountNumber);
    }

    // Getters and setters for accountHolder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    // Getters and setters for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    // Getters and setters for accountNumber
    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public static int getTotalAccountsCreated() {
        // return (int) (nextAccountNumber - accountNumber);

        return nextAccountNumber - 1001;
    }

    public void showAccount() {

        // Account #1001 - Holder: Alice - Balance: 5000.0
        System.out.println(
                "Account #" + getAccountNumber() + " - Holder: " + getAccountHolder() + " - Balance: " + getBalance());
    }
}

public class Exercise2 {
    public static void main(String args[]) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
        BankAccount acc3 = new BankAccount();

        acc1.setAccountHolder("Alice");
        acc1.setBalance(5000);
        acc1.showAccount();

        acc2.setAccountHolder(("Bob"));
        acc2.setBalance(3000);
        acc2.showAccount();

        acc3.setAccountHolder("Carol");
        acc3.setBalance(7000);
        acc3.showAccount();

        System.out.println("Total accounts created: " + BankAccount.getTotalAccountsCreated());

    }
}
