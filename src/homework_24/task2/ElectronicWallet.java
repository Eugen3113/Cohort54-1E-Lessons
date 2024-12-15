package homework_24.task2;


public class ElectronicWallet implements PaymentSystem {
    private double balance;


    public ElectronicWallet(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdrawMoney(double amount) {

        balance -= amount;
        System.out.println("Снято со счета " + amount +  " Bitcoins");

    }

    @Override
    public void depositTransfer(double amount) {

        balance += amount;
        System.out.println("Поступило на счет:" + amount  + "  Bitcoins" );
        System.out.println(balance);

    }

    @Override
    public void checkBalance() {
        System.out.println("Остаток на счету");

    }
}
