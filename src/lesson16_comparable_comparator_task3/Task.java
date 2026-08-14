package lesson16_comparable_comparator_task3;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this==o) return true;
        if (o==null || getClass()!=o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(title, task.title);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title);
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
