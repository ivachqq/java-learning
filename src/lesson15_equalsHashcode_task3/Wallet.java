package lesson15_equalsHashcode_task3;

import java.util.Objects;

public class Wallet extends Money{
    private String owner;
    public Wallet(long amount, String currency, String owner) {
        super(amount,currency);
        this.owner=owner;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null || getClass()!=o.getClass()) return false;
        Wallet wallet = (Wallet) o;
        return super.equals(o) && Objects.equals(owner, wallet.owner);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), owner);
    }
}
