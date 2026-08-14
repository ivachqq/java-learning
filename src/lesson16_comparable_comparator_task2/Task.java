package lesson16_comparable_comparator_task2;

public class Task implements Comparable<Task>{
    private int priority;
    private String title;
    public Task(int priority, String title) {
        this.priority=priority;
        this.title=title;
    }

    public int getPriority() {
        return priority;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Task other) {
        int comparePriority = Integer.compare(other.priority, priority);
        if (comparePriority!=0) return comparePriority;
        return title.compareTo(other.title);
    }
    @Override
    public String toString() {
        return title + " " + priority;
    }
}
