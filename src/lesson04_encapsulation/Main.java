package lesson04_encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount("   Пидор", 1800);
        account1.downBalance(900);
        account1.upBalance(899);
        System.out.println("Текущий баланс клиента " + account1.getUser() + ": " + account1.getBalance());
    }
}
