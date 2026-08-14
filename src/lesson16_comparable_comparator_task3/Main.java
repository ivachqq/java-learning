package lesson16_comparable_comparator_task3;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Task> tasks = new TreeSet<>();
        Task task1 = new Task(1, "A");
        Task task2 = new Task(5, "A");
        tasks.add(task1);
        tasks.add(task2);
        System.out.println("Размер treeset = " + tasks.size());
        System.out.println("Размер 2, ибо treeset сравнивает по compareTo, а compareTo сравнивает по приоритету");
        System.out.println("treeset решает дубликат ли по compareTo==0");
        System.out.println("Задания в treeset будут расцениваться как одинаковые только если title и priority будут одинаковые");
    }
}
