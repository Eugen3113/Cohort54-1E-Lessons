package homework_24_teacher.system2;

/**
 * @author Sergey Bugaenko
 * {@code @date} 05.12.2024
 */

public class BankAccount extends VusaMember {

    public BankAccount(String title, double balance) {
        super(title, balance, "EUR");
    }

    @Override
    public String toString() {
        return "BankAccount: {" + "title=" + title
                + ", balance=" + balance
                + ", currency: " + this.getCurrency() +
                '}';
    }

    @Override
    public boolean transferMoney(double amountEur, PaymentSystem recipient) {  //перевод денег-transferMoney
        if (amountEur > balance) {  // проверка баланса
            System.out.printf("Недостаточно средств: (transfer: %.2f | balance: %.2f)\n)",
                    amountEur, balance);
            return false;
        }

        if (recipient.getCurrency().equals("EUR")) {
            // Перевод евро на евровый счет
            balance -= amountEur;
            recipient.depositTransfer(amountEur); // Перевожу
            System.out.printf("Успех! Перевод %.2f EUR (%s -> %s)\n",
                    // перевод откуда и куда (%s -> %s) .
                    amountEur, title, recipient.getTitle()); // перевод в евро,назв-е банка,имя получателя
            return true;  // успех.
        } else if(recipient.getCurrency().equals("BTC")) {
            // Конвертировать EUR в BTC
            double amountBtc = amountEur / getCourseBTC(); // проверяем курс EUR/BTC.
            balance -= amountEur;
            recipient.depositTransfer(amountBtc); // перечисляем получателю в BTC.

            System.out.printf("Успех! Перевод %.2f EUR в %.7f BTC (%s -> %s)\n",
                    amountEur, amountBtc, title, recipient.getTitle());
            return true;
        }

        System.out.println("Что-то пошло не так с валютой счета получателя");
        return false;

    }

//    @Override
//    public boolean withdrawMoney(double amount) {   // Вывод денег-withdrawMoney
//        if (amount > balance) {
//            System.out.println("Недостаточно средств для снятия " +   amount);
//            return false;
//        }
//
//        balance -= amount;
//        System.out.printf("Успешно снято со счета %.2f %s. (Банк %s)\n",
//                amount, this.getCurrency(), title
//        );
//        return true;
//    }
//
//    @Override
//    public void depositTransfer(double amount) {
//        System.out.println(title + " зачисляю на счет: " + amount +
//                this.getCurrency());
//    }
//
//    @Override
//    public double checkBalance() {
//        return balance;
//    }
}
