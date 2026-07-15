package lesson10_OOPInterfaceStatic_task1;

public class Wallet implements Payable{
    private double balance;
    static int countWallets;
    public Wallet(double startBalance) {
        countWallets+=1;
        if (startBalance>=0) balance=startBalance;
        else System.out.println("Невалидный кошелёк под номером " + countWallets + "!");
    }
    @Override
    public boolean pay(double amount) {
        if (balance-amount>=0 && amount>0) {
            balance -= amount;
            return true;
        }
        System.out.println("Вы либо указали отрицательную сумму списания, либо пытаетесь списать сумму больше, чем у вас есть!");
        return false;
    }

    @Override
    public double getBalance() {
        if (balance>=0) return balance;
        return -1;
    }
}
