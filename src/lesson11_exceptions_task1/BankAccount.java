package lesson11_exceptions_task1;

public class BankAccount {
    private final String owner;
    private double balance;
    public BankAccount(String owner, double balance) {
        this.owner=owner;
        this.balance=balance;
    }

    public void deposit(double amount) throws IllegalArgumentException{
        if (amount<=0) {throw new IllegalArgumentException("Сумма пополнения должна быть > 0!");}
        balance+=amount;
    }
    public void withdraw(double amount) throws InsufficientFundsException, IllegalArgumentException{
        if (amount<=0) {throw new IllegalArgumentException("Сумма снятия должна быть > 0!");}
        if (balance-amount<0) {throw new InsufficientFundsException("Недостаточно денег на балансе для списания!");}
        balance-=amount;
    }
    public double getBalance() {
        return balance;
    }
}
