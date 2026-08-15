package lesson14_collections_task5_PriorityQueue;

public class BuildTask {
    private String name;
    private int priority;
    private long seq;
    public BuildTask(String name, int priority) {
        this.name=name;
        this.priority=priority;
    }
    public void setSeq(long newSeq) {
        seq=newSeq;
    }

    public int getPriority() {
        return priority;
    }

    public long getSeq() {
        return seq;
    }
    @Override
    public String toString() {
        return "name: " + name + "; " + "priority: " + priority + "; " + "seq: " + seq + "; ";
    }
}
