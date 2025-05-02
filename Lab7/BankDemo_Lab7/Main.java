package Lab7.BankDemo_Lab7;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1000.0);

        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0);
        System.out.println("Final Balance: " + account.getBalance());
    }
}

