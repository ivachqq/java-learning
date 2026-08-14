package lesson16_comparable_comparator_task2;

import java.util.Comparator;

public class TitleLengthComparator implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        return o1.getTitle().length()-o2.getTitle().length();
    }
}
