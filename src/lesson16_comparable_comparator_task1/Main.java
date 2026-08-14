package lesson16_comparable_comparator_task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Task> list = new ArrayList<>();
        Task task2 = new Task(10, "a");
        Task task1 = new Task(10, "ab");
        Task task3 = new Task(2, "b");
        list.addAll(List.of(task1,task2,task3));
        Collections.sort(list);
        for (Task task : list) {
            System.out.println(task.toString());
        }
    }
}
