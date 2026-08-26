package lesson19_Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <T> T first(List<T> list) {
        return list.getFirst();
    }
   public static <T> boolean contains(List<T> list, T item) {
        return list.contains(item);
   }
    public static void main(String[] args) {
        //1
        Box<String> str = new Box<>("aaa");
        Box<Integer> in = new Box<>(22);
        //2
        Pair<String, Integer> pair = new Pair<>("ggwp", 20);
        Pair<Integer, String> pair2 = new Pair<>(20, "ggwp");
        System.out.println(pair.toString());
        System.out.println(pair2.toString());
        //3
        System.out.println(first(List.of("aaa", "bbbb")));
        System.out.println(first(List.of(1,2,3)));
        System.out.println(contains(List.of(1,2,3),3));
        //4
        List list = new ArrayList<>();
        list.add("1");
        list.add(1);
        try {
            System.out.println((String) list.get(1));
        } catch (ClassCastException e) {
            System.out.println("Словили ошибку каста");
        }
    }
}
