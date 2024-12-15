package homework_24.task2;


public class BankAccount implements PaymentSystem {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdrawMoney(double amount) {
        balance -= amount;

        System.out.println("Снято: " + amount + " $" );
        System.out.println(balance);

    }

    @Override
    public void depositTransfer(double amount) {

        balance += amount;
        System.out.println("Зачислено: " + amount + " $");

    }

    @Override
    public void checkBalance() {

        System.out.println("Баланс: " + balance);



    }
}
