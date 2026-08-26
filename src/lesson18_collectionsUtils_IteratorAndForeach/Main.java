package lesson18_collectionsUtils_IteratorAndForeach;

import java.util.*;

public class Main {

    public static void removeShortWrong(List<String> words) {
        for (String word:words) {
            if (word.length()<3) words.remove(word);
        }
    }
    public static void removeShortCorrect(List<String> words) {
        Iterator<String> it = words.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.length()<3) it.remove();
        }
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("xui", "penis", "abc", "xui","penis", "xui","aa","bb"));
        System.out.println(Collections.frequency(list, "xui"));
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        List<String> list2 = new ArrayList<>(list);
        Collections.shuffle(list2);
        for (String word : list2) {
            System.out.println(word);
        }
        System.out.println();
        List<String> list3 = new ArrayList<>(list);
        Collections.sort(list3);
        for (String word : list3) {
            System.out.println(word);
        }
        try {
            Collections.unmodifiableCollection(list).add("aaa"); //это лишь обёртка коллекции, а не её полноценная копия
        } catch (UnsupportedOperationException e) {
            System.out.println("Словили исключение при попытке изменить unmodifiableCollection");
        }
        for (String word : list) {
            System.out.println(word);
        }
        try {
            removeShortWrong(list);
        } catch (ConcurrentModificationException e) {
            System.out.println("Удаляем через for each, а надо черех итератор");
        }
        List<String> lst = new ArrayList<>(List.of("a", "abc", "to", "java", "ok"));
        removeShortCorrect(lst);
        for (String word : lst) {
            System.out.println(word);
        }
        //Почему for-each + list.remove плохо:
        //for-each обходит список через скрытый Iterator. Если внутри цикла вызвать list.remove(), список меняется мимо этого Iterator → fail-fast → ConcurrentModificationException.
        //
        //Чем it.remove() лучше:
        //удаление идёт через тот же Iterator, который обходит список; он знает, что элемент удалён, и корректно продолжает обход.
    }

}
