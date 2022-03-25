package multithreading_in_java.synchronization;

public class ATM {

    static void withdraw(BankAccount account, int amount) {

        int balance = account.getBalance();
        if ((balance - amount) < -account.getOverdraft()) {
            System.out.println("Transaction denied!");
        } else {
            account.debit(amount);
            System.out.println("$" + amount + " successfully withdrawn");
        }
        System.out.println("Current balance: " + account.getBalance());

    }

}
