package homework_24.task2;


public class PaymentApp {
    public static void main(String[] args) {
        PaymentSystem bankAccount = (PaymentSystem) new BankAccount(20000);
        bankAccount.checkBalance();
        bankAccount.depositTransfer(1500);
        bankAccount.withdrawMoney(400);

        System.out.println("\n=============\n");

        PaymentSystem wallet = new ElectronicWallet(2500);

        wallet.depositTransfer(100);
        wallet.withdrawMoney(50);
        wallet.checkBalance();


    }
}
