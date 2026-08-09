package lesson14_collections_task1_LinkedAndArrayLists;

public class Main {
    public static void main(String[] args) {
        ArrayListJournal arrChecker = new ArrayListJournal();
        LinkedListJournal linkChecker = new LinkedListJournal();
        long start = System.nanoTime();
        for (int i=0;i<50000;i++) {
            arrChecker.fillFront(i);
        }
        long end = System.nanoTime();
        System.out.println("Время заполнения ArrayList по добавлению вперёд: " + (end-start)/1000000 +" миллисекунд");

        start = System.nanoTime();
        for (int i=0;i<50000;i++) {
            linkChecker.fillFront(i);
        }
        end = System.nanoTime();
        System.out.println("Время заполнения LinkedList по добавлению вперёд: " + (end-start)/1000000 +" миллисекунд");


        start = System.nanoTime();
        for (int i=0;i<50000;i++) {
            arrChecker.fillBack(i);
        }
        end = System.nanoTime();
        System.out.println("Время заполнения ArrayList по добавлению назад: " + (end-start)/1000000 +" миллисекунд");

        start = System.nanoTime();
        for (int i=0;i<50000;i++) {
            linkChecker.fillBack(i);
        }
        end = System.nanoTime();
        System.out.println("Время заполнения LinkedList по добавлению назад: " + (end-start)/1000000 +" миллисекунд");

        start = System.nanoTime();
        int x = arrChecker.sumEveryIndex();
        end = System.nanoTime();
        System.out.println("Время подсчёта суммы ArrayList: " + (end-start)/1000000 +" миллисекунд");

        start = System.nanoTime();
        x = linkChecker.sumEveryIndex();
        end = System.nanoTime();
        System.out.println("Время подсчёта суммы LinkedList: " + (end-start)/1000000 +" миллисекунд");

        System.out.println("Итог:\n" +
                " 1) По заполнению вперёд быстрее LinkedList, что логично, так как сложность этого действия у него константная (просто добавить вперёд, никого не двигая), а у ArrayList будут каждый раз сдвигаться индексы каждого элемента на 1 вперёд\n" +
                " 2) По заполнению назад быстрее ArrayList. Там константная сложность (просто вычислить байт диапазон, куда вставить элемент), в LinkedList тоже константая, но массив дешевле, чем использование узлов\n" +
                " 3) Время подсчёта суммы быстрее у ArrayList, сложность линейная, тогда как у LinkedList мы каждый раз с полного нуля идём по списку, чтобы найти нужный нам элемент");
    }
}
