package hw_24_teacher.system2;

/**
 * @author Sergey Bugaenko
 * {@code @date} 05.12.2024
 */

/*
Добавить в интерфейс метод:

transferMoney() (перевод средств на другой счет) -
Средства списываются с одного счета и зачисляются на другой счет

Должна быть возможность осуществлять переводы между этими классами. Т.е. возможность перевода средств:

Банк -> Банк
Банк -> Кошелек
Кошелек -> Кошелек
Кошелек -> Банк
 */

public class Bank2App {
    public static void main(String[] args) {

        PaymentSystem bank = new BankAccount("Cyprus Bank", 50000); //ложу на свой счёт
        System.out.println(bank.withdrawMoney(1000));  // вывожу деньги
        System.out.println(bank);  //BankAccount: {title=Cyprus Bank, balance=49000.0, currency: EUR}

        bank.withdrawMoney(1_000_000);  //Недостаточно средств для снятия 1000000.0

        System.out.println("\n ============ Transfer ==============");
        PaymentSystem bank2 = new BankAccount("A-Bank", 10000); // банк2, на счету 10000.
        bank.transferMoney(14000, bank2);   //с Cyprus Bank на  : A-Bank зачисляю на счет: 14000.0EUR
        System.out.println(bank);  //BankAccount: {title=Cyprus Bank, balance=35000.0, currency: EUR}
        System.out.println(bank2);  //BankAccount: {title=A-Bank, balance=24000.0, currency: EUR}

        System.out.println("\n ============ Transfer2 ==============");
        PaymentSystem wallet = new BtcWallet("Crypto Wallet", 3);
        wallet.transferMoney(1, bank);

        System.out.println(bank);
        System.out.println(wallet);

        System.out.println("\n ============ Transfer3 ==============");
        bank.transferMoney(35000, wallet);
        System.out.println(bank);
        System.out.println(wallet);


    }
}