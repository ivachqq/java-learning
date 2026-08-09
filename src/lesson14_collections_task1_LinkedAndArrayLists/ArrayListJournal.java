package lesson14_collections_task1_LinkedAndArrayLists;

import java.util.ArrayList;

public class ArrayListJournal implements FastBenchList{
    static ArrayList<Integer> arr = new ArrayList<>();
    @Override
    public void fillFront(int n) {
        arr.addFirst(n);
    }
    @Override
    public void fillBack(int n) {
        arr.add(n);
    }
    @Override
    public int sumEveryIndex() {
        int totalSum=0;
        for (int i=0;i<arr.size();i++) {
            totalSum+=arr.get(i);
        }
        return totalSum;
    }

}
