package lesson04_encapsulation;

public class BankAccount {
    private String user;
    private float balance;

    public BankAccount(String user, float balance) {
        setUsername(user);
        this.balance=balance;

    }
    public String getUser() {
        return user;
    }
    public float getBalance() {
        return balance;
    }
    public void setUsername(String newUsername) {
        if (newUsername!=null && !newUsername.trim().isEmpty()) {
            user = newUsername.trim();
        }
    }
    public void setBalance(float newBalance) {
        if (balance==null && newBalance>0) {
            balance=newBalance;
        }
    }

    public void upBalance(float upSum) {
        if (upSum>0) {
            balance += upSum;
        }
    }
    public void downBalance(float downSum) {
        if (downSum > 0 && balance-downSum>=0) {
            balance -= downSum;
        }
    }
}
