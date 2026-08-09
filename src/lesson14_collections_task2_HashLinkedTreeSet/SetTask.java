package lesson14_collections_task2_HashLinkedTreeSet;

import java.util.*;


public class SetTask {
    public static HashSet<String> uniqueIgnoreCase(List<String> words) {
        List<String> lst = new ArrayList(words);
        for (int i = 0;i<words.size();i++) {
            lst.set(i, words.get(i).toLowerCase());

        }
        return new HashSet<>(words);
    }

    public static LinkedHashSet<String> uniqueKeepOrder(List<String> words) {
        for (int i = 0;i<words.size();i++) {
            words.set(i, words.get(i).toLowerCase());

        }
        return new LinkedHashSet<>(words);
    }
    public static TreeSet<String> uniqueSorted(List<String> words) {

        return new TreeSet<>(words);
    }
    public static boolean hasDuplicates(List<String> words) {
        for (int i = 0;i<words.size();i++) {
            words.set(i, words.get(i).toLowerCase());
        }
        HashSet<String> setWords = new HashSet<>(words);
        if (words.size() == setWords.size()) return false;
        return true;
    }
}
