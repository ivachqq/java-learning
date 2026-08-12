package lesson15_equalsHashcode_task1;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "a");
        Product product2 = new Product(1, "b");
        System.out.println("A.");
        HashSet<Product> productHashSet = new HashSet<>();
        System.out.println(product1.equals(product2));
        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());
        productHashSet.add(product1);
        productHashSet.add(product2);
        System.out.println(productHashSet.size());
        System.out.println("B.");
        HashMap<Product, String> hashMap = new HashMap<>();
        hashMap.put(product1, "A");
        System.out.println(hashMap.get(product2));
        System.out.println("Задание");
        System.out.println("Сделай класс Product:\n" +
                "\n" +
                "поля: int id, String name\n" +
                "equals / hashCode только по id\n" +
                "В main проведи серию опытов и для каждого замерить/напечатать результат + объяснить:\n" +
                "\n" +
                "A. Два разных объекта с одним id, разными name\n" +
                "→ equals? одинаковый hashCode?\n" +
                "→ оба в HashSet — какой size?\n" +
                "\n" +
                "B. HashMap<Product, String>\n" +
                "→ put первого продукта со значением \"A\"\n" +
                "→ get вторым объектом (тот же id, другой name) — что вернётся? Почему?\n" +
                "\n" +
                "C. Сломай только hashCode: сделай return name.hashCode(); при equals по id\n" +
                "→ повтори B. Что сломалось? Какое правило контракта нарушено?\n" +
                "\n" +
                "D. Верни правильный hashCode. Теперь equals сравнивает id и name, а hashCode только id\n" +
                "→ два продукта: (1,\"a\") и (1,\"b\")\n" +
                "→ equal? hash одинаковый?\n" +
                "→ оба в HashSet — size? Это нарушение контракта или нет? Почему?");
        System.out.println("1.\n" +
                "a. equals одинаковый, hashcode тоже. size 1, ибо они одинаковые, судя по id\n" +
                "b. вернётся тот же объект, что мы положили, ибо объекты сравниваются и хэшируются только по id, а они у них одинаковые\n" +
                "c. у нас equals по одному полю, а hashcode вообще по другому. Объект не нашёлся\n" +
                "d. equal неодинаковый, hash одинаковый. Оба в hashset, что логично. Они лежат в одном бакете в связном списке, т.к hash одинаковый, а по equals они разные\n" +
                "Почекай lesson 15, там приходилось менять из раза в раз, но есть последние действия");
    }

}
