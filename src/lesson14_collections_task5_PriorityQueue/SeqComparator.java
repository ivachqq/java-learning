package lesson14_collections_task5_PriorityQueue;

import java.util.Comparator;

public class SeqComparator implements Comparator<BuildTask> {
    @Override
    public int compare(BuildTask b1, BuildTask b2) {
        return Long.compare(b1.getSeq(),b2.getSeq());
    }
}
