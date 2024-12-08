package homework_24_teacher.system2;


/**
 * @author Sergey Bugaenko
 * {@code @date} 05.12.2024
 */

public interface PaymentSystem {

    boolean transferMoney(double amount, PaymentSystem recipient);

    boolean withdrawMoney(double amount);
    void depositTransfer(double amount);
    double checkBalance();

    String getCurrency();
    String getTitle();
}
