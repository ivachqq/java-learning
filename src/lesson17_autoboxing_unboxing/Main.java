package lesson17_autoboxing_unboxing;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1); //боксинг
        list.add(2); //боксинг
        int x = list.get(0);  // анбоксинг

        Integer a = null;
        try {
            int b = a;
        } catch (NullPointerException e) {
            System.out.println("Ты пытаешься присвоить примитиву null!");
        }

        Integer q = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;
        System.out.println(q==b);
        System.out.println("true, ибо числа от -128 до 127 хранятся в кэше");
        System.out.println(c==d);
        System.out.println("false, ибо значения превышают те, что хранятся в кэше");
        System.out.println("Все между собой будут equals, ибо значения у них одинаковые");

        System.out.println("Берём обёртку, когда пользуемся коллекциями, методами compare, parseInt и тд, значение может быть null.\n" +
                "В остальном берём примитив");

    }
}
