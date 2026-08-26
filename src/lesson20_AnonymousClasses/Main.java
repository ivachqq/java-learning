package lesson20_AnonymousClasses;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("aaa","11","aab","123","aaaa"));
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        for(String str:list) {
            System.out.println(str);
        }

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Запущено");
            }
        };
        r.run();

        //анонимный класс нужен тогда, когда мы используем его функционал всего лишь 1 раз. Он не имеет названия.
        //обычный класс имеет имя и файл, его можно переиспользовать; анонимный — одноразовый объект на месте.
        //new ИмяИнтерфейса() {
        //    @Override
        //    public ... метод(...) {
        //        // реализация
        //    }
        //};
    }
}
