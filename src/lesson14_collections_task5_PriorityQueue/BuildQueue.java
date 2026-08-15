package lesson14_collections_task5_PriorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class BuildQueue {
    PriorityQueue<BuildTask> tasks = new PriorityQueue<>(new PriorityComparator().thenComparing(new SeqComparator()));
    int seqs=1;
    public void add(BuildTask task) {
        task.setSeq(seqs);
        seqs++;
        tasks.add(task);
    }
    public BuildTask next() {
        BuildTask ts = tasks.poll();
        System.out.println(ts.toString());
        return ts;
    }
    public List<BuildTask> drainAll() {
        List<BuildTask> list = new ArrayList<>();
        while (!tasks.isEmpty()){
            BuildTask ts = tasks.poll();
            System.out.println(ts.toString());
            list.add(ts);
        }
        return list;
    }
}
