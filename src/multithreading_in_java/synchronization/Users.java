package multithreading_in_java.synchronization;

public class Users {

    static final BankAccount account = new BankAccount(50);

    public static synchronized void main(String[] args) {

        System.out.println("Your balance is $" + account.getBalance());
        account.topUp(100);
        System.out.println("Your balance is $" + account.getBalance());

        Thread t1 = new Thread(() -> {
            ATM.withdraw(account, 100);
        });

        Thread t2 = new Thread(() -> {
            ATM.withdraw(account, 100);
        });

        t1.start();
        t2.start();

    }

}
