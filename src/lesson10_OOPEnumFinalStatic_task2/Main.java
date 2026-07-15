package lesson10_OOPEnumFinalStatic_task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Создание заказов ===");
        Order order1 = OrderFactory.create("Сихуньюнь", 1000);
        Order order2 = OrderFactory.create("Кафка", 2500.5);
        Order order3 = OrderFactory.create("Даньхэн", 750);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);

        System.out.println("\n=== Невалидные создания ===");
        Order bad1 = OrderFactory.create(null, 100);
        Order bad2 = OrderFactory.create("", 100);
        Order bad3 = OrderFactory.create("   ", 100);
        Order bad4 = OrderFactory.create("Тест", 0);
        Order bad5 = OrderFactory.create("Тест", -50);
        System.out.println("null customer -> " + bad1);
        System.out.println("пустой customer -> " + bad2);
        System.out.println("пробелы customer -> " + bad3);
        System.out.println("amount=0 -> " + bad4);
        System.out.println("amount=-50 -> " + bad5);

        System.out.println("\n=== Заказ 1: NEW -> PAID -> SHIPPED ===");
        order1.markPaid();
        System.out.println(order1);
        order1.markShipped();
        System.out.println(order1);
        order1.cancel(); // уже нельзя
        System.out.println(order1);

        System.out.println("\n=== Заказ 2: NEW -> CANCELLED ===");
        order2.cancel();
        System.out.println(order2);
        order2.markPaid(); // уже нельзя
        System.out.println(order2);

        System.out.println("\n=== Заказ 3: NEW -> PAID -> CANCELLED ===");
        order3.markPaid();
        System.out.println(order3);
        order3.cancel();
        System.out.println(order3);
        order3.markShipped(); // уже нельзя
        System.out.println(order3);

        System.out.println("\n=== Ещё один заказ после невалидных (проверка счётчика id) ===");
        Order order4 = OrderFactory.create("Фэйсяо", 300);
        System.out.println(order4);
    }
}
