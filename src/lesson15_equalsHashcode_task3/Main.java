package lesson15_equalsHashcode_task3;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Money> hashSet = new HashSet<>();
        Money m = new Money(100, "RUB");
        Wallet w = new Wallet(100, "RUB", "Ivan");
        System.out.println(m.equals(w));
        System.out.println(w.equals(m));
        System.out.println("На момент, когда у нас instanceof, а не getClass, у нас m равен w, но w не равен m. " +
                "\nПравило x=y, y=x нарушено, поэтому instanceof не подходит в данном случае.");
        hashSet.add(m);
        hashSet.add(w);
        System.out.println(hashSet.size());
        System.out.println("До сих пор instanceof. Размер сета 2, что логично, ибо в хэшировании кошелька ещё участвует владелец, в отличии от объекта денег.");
        System.out.println("После замены на getclass теперь m не равен w, что теперь логично, ибо у них разные параметры сравнивания");
    }
}
