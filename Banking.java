class BankAccount {
    long number;
    double balance;

    public BankAccount(long number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Your new balance is : " + this.balance);
    }

    public void withdraw(double amount) {
        this.balance -= amount;

        try {
            if (this.balance <= 0) {
                throw new Exception("Insufficient Balance");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            this.balance += amount;
        }

    }

    public void checkBalance() {
        System.out.println(this.balance);
    }
}

public class Banking {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount(12345678, 250);
        // acc.deposit(20);
        acc.withdraw(260);
        acc.checkBalance();

    }
}
