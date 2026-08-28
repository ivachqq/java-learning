package lesson22_Optional;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static Optional<String> findLongest(List<String> words) {
        if (words.isEmpty()) return Optional.empty();
        return words.stream()
                .max(Comparator.comparingInt(String::length));
    }
    public static String greet(Optional<String> name) {
        return name.filter(s -> !s.isBlank())
                .map(s -> "Hello, " + s + "!")
                .orElse("Hello, guest!");
        //в реальном API лучше String name, а не Optional
    }
    public static void main(String[] args) {
        Optional<String> longestWord= findLongest(List.of("1","2","111","3333"));
        System.out.println(longestWord.orElse("none"));

        System.out.println(longestWord.filter(x->x.length()>3).map(String::toUpperCase).orElse("SHORT"));


        //Optional — в основном как return «значение может отсутствовать».
        //не стоит юзать как параметр метода, поле класса
    }
}
