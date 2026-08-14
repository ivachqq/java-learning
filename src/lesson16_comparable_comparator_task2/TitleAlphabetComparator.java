package lesson16_comparable_comparator_task2;

import java.util.Comparator;

public class TitleAlphabetComparator implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
