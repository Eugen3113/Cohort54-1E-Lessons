package homework_24_teacher.system1;

public interface PaySystem {  // 1 Родительский класс

    void withdrawMoney(double amount);
    void depositTransfer(double amount);
    double checkBalance();
}
