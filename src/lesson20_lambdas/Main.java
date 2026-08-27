package lesson20_lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("aa","abc","qweq","q"));
        Collections.sort(list, (a,b) -> Integer.compare(a.length(),b.length()));
        list.forEach(System.out::println);
        System.out.println();

        Predicate<String> predicate = (s) -> s.startsWith("a") || s.startsWith("A");
        System.out.println(predicate.test("abc"));
        System.out.println(predicate.test("bac"));
        System.out.println(predicate.test("Aqw"));
        System.out.println();

        Runnable r = () -> System.out.println("running");
        r.run();
        System.out.println();

        //лямбда отличается от анонимного класса:
        //1. Лямбда может реализовать только тот интерфейс, у которого прописан 1 абстрактный метод (функциональный интерфейс)
        //2. Синтаксисом и краткостью


    }
}
