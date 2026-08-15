package lesson14_collections_task5_PriorityQueue;

import java.util.Comparator;

public class PriorityComparator implements Comparator<BuildTask> {
    @Override
    public int compare(BuildTask b1, BuildTask b2) {
        return Integer.compare(b2.getPriority(), b1.getPriority());
    }
}
