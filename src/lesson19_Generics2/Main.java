package lesson19_Generics2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Number> list1 = new ArrayList<>();
    public static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }
    public static double sumNumbers(List<? extends Number> list) {
        double itog = 0;
        for (Number num : list) {
            itog+=num.doubleValue();
        }
        return itog;
    }
    public static void addThreeInts(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }
    public static void main(String[] args) {
        System.out.println(max("a", "b"));
        System.out.println(max(1, 2));
        //без Comparable не скомпилируется, ибо мы не ограничили бы дженерик и программа не знала бы, может ли она сравнивать объекты
        System.out.println(sumNumbers(List.of(1,2,3,4)));
        System.out.println(sumNumbers(List.of(1.1,2.2,3.3,4.5)));

        addThreeInts(list1);
        for(Number num : list1) {
            System.out.println(num);
        }

        //когда считываем данные из коллекции используем ? extend ... , когда заполняем данные в коллекцию используем ? super ...
    }
}
