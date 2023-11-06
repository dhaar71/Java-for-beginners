class JointAccount {
    private double balance;

    public JointAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount, String accountHolderName) {
        System.out.println(accountHolderName + " is depositing $" + amount);
        balance += amount;
        System.out.println("New balance after deposit by " + accountHolderName + ": $" + balance);
    }

    public synchronized void withdraw(double amount, String accountHolderName) {
        if (balance >= amount) {
            System.out.println(accountHolderName + " is withdrawing $" + amount);
            balance -= amount;
            System.out.println("New balance after withdrawal by " + accountHolderName + ": $" + balance);
        } else {
            System.out.println(accountHolderName + " does not have sufficient balance to withdraw $" + amount);
        }
    }
}

class AccountHolder implements Runnable {
    private JointAccount account;
    private String accountHolderName;

    public AccountHolder(JointAccount account, String accountHolderName) {
        this.account = account;
        this.accountHolderName = accountHolderName;
    }

    @Override
    public void run() {
        // Simulate deposit and withdrawal operations by account holders
        for (int i = 0; i < 5; i++) {
            double amount = Math.random() * 500; // Random amount up to $500
            account.deposit(amount, accountHolderName);

            amount = Math.random() * 300; // Random amount up to $300
            account.withdraw(amount, accountHolderName);

            try {
                Thread.sleep(100); // Introduce a delay to simulate concurrent access
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class JointAccountDemo {
    public static void main(String[] args) {
        JointAccount jointAccount = new JointAccount(1000.0);

        // Create two account holders
        AccountHolder accountHolder1 = new AccountHolder(jointAccount, "Account Holder 1");
        AccountHolder accountHolder2 = new AccountHolder(jointAccount, "Account Holder 2");

        // Create threads for account holders
        Thread thread1 = new Thread(accountHolder1);
        Thread thread2 = new Thread(accountHolder2);

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
