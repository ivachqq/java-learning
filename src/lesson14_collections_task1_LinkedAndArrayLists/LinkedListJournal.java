package lesson14_collections_task1_LinkedAndArrayLists;
import java.util.LinkedList;

public class LinkedListJournal implements FastBenchList{
    static LinkedList<Integer> link = new LinkedList<>();
    @Override
    public void fillFront(int n) {
        link.addFirst(n);
    }
    @Override
    public void fillBack(int n) {
        link.add(n);
    }
    @Override
    public int sumEveryIndex() {
        int totalSum=0;
        for (int i = 0; i< link.size(); i++) {
            totalSum+= link.get(i);
        }
        return totalSum;
    }
}
