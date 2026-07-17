package lesson11_exceptions_task1;

public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Vasya", 1000);
        b1.deposit(200);
        System.out.println(b1.getBalance());
        b1.withdraw(200);
        System.out.println(b1.getBalance());
        try {
            b1.withdraw(-200);
        } catch (IllegalArgumentException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(b1.getBalance());
        }
        try {
            b1.deposit(-200);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(b1.getBalance());
        }
        try {
            b1.withdraw(99999);
        } catch (IllegalArgumentException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(b1.getBalance());
        }
    }
}
