package lesson21_StreamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("java", "a", "stream", "api", "lambda", "ok", "java");
        List<String> words2 = words.stream()
                .filter(w -> w.length()>3)
                .map(String::toUpperCase)
                .toList();
        words2.forEach(System.out::println);

        List<String> words3 = words.stream()
                .distinct()
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.compareTo(o2);
                    }
                })
                .toList();
        words3.forEach(System.out::println);

        long words4 = words.stream()
                .filter(s -> s.startsWith("j") || s.startsWith("J"))
                .count();
        System.out.println(words4);

        //Промежуточные только описывают конвейер, терминальная запускает. Stream не модифицирует исходный list сам по себе.
        //stream работа6т с потоком данных, а не с самими данными. Это потокобезопасно и так мы не можем случайно поменять исходеую коллекцию
    }
}
