package hw_24_teacher.system2;


/**
 * @author Sergey Bugaenko
 * {@code @date} 05.12.2024
 */
               // Платёжная система
public interface PaymentSystem { // 2 Промежуточный родительский класс.

    boolean transferMoney(double amount, PaymentSystem recipient);  // recipient - получатель

    boolean withdrawMoney(double amount);
    void depositTransfer(double amount);
    double checkBalance();

    String getCurrency(); // взять валюту
    String getTitle();
}
