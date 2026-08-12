package lesson15_equalsHashcode_task3;

import java.util.Objects;

public class Money {
    private long amount;
    private String currency;
    public Money(long amount, String currency) {
        this.amount=amount;
        this.currency=currency;
    }
    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (o==null || getClass()!=o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount && Objects.equals(currency, money.currency);
    }
    @Override
    public int hashCode() {
        return Objects.hash(amount,currency);
    }
}
