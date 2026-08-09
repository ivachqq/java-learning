package lesson14_collections_task4_QueueDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class SupportDesk {
    private static Deque<String> tickets = new ArrayDeque<>();
    private static Deque<String> tasks = new ArrayDeque<>();
    public void enqueue(String ticket) {
        if (ticket==null || ticket.isBlank()) throw new IllegalArgumentException("Ваш билет невалиден!");
        tickets.addLast(ticket);
    }
    public String serveNext() {
        if (tickets.isEmpty()) return "NO_TICKETS";
        return tickets.poll();
    }
    public void pushUrgent(String ticket) {
        if (ticket==null || ticket.isBlank()) throw new IllegalArgumentException("Ваш билет невалиден!");
        tickets.addFirst(ticket);
    }
    public void defer(String task) {
        if (task == null || task.isBlank()) throw new IllegalArgumentException("Задача невалидна");
        tasks.push(task);
    }
    public String undoDefer() {
        if (tasks.isEmpty()) return "NO_DEFERRED";
        return tasks.pop();
    }
    public int queueSize() {
        return tickets.size();
    }
}
