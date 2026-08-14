package lesson16_comparable_comparator_task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        Task task1 = new Task(1, "oao");
        Task task2 = new Task(1, "oaoa");
        Task task3 = new Task(2, "zzz");
        Task task4 = new Task(3, "zzz");
        Task task5 = new Task(20, "qwe");
        tasks.addAll(List.of(task1,task2,task3,task4,task5));

        List<Task> byLength = new ArrayList<>(tasks);
        Collections.sort(byLength, new TitleLengthComparator());
        for (Task task : byLength) {
            System.out.println(task.toString());
        }
        System.out.println();
        List<Task> byAlpha = new ArrayList<>(tasks);
        Collections.sort(byAlpha, new TitleAlphabetComparator());
        for (Task task : byAlpha) {
            System.out.println(task.toString());
        }
    }
}
