package lesson14_collections_task2_HashLinkedTreeSet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>(List.of("Java", "java", "Python", "puthon", "python"));
        for (String word:SetTask.uniqueIgnoreCase(lst)) {
            System.out.println(word);
        }
        System.out.println();
        for (String word:SetTask.uniqueKeepOrder(lst)) {
            System.out.println(word);
        }
        System.out.println();
        for (String word:SetTask.uniqueSorted(lst)) {
            System.out.println(word);
        }
        System.out.println(SetTask.hasDuplicates(lst));
    }
}
