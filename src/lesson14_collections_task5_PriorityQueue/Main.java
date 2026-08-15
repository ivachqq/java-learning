package lesson14_collections_task5_PriorityQueue;

public class Main {
    public static void main(String[] args) {
        BuildTask b1 = new BuildTask("aaa", 1);
        BuildTask b2 = new BuildTask("aaa", 2);
        BuildTask b3 = new BuildTask("ab", 1);
        BuildTask b4 = new BuildTask("qwe", 20);
        BuildTask b5 = new BuildTask("qwe", 2);
        BuildQueue bq = new BuildQueue();
        bq.add(b1);
        bq.add(b2);
        bq.add(b3);
        bq.add(b4);
        bq.add(b5);
        bq.next();
        bq.drainAll();
    }
}
