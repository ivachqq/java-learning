package lesson10_OOPEnumFinalStatic_task2;

public class OrderFactory {
    private static int orderCounter;
    public static Order create(String customer, double amount) {
        if (customer==null || amount<=0 || customer.trim().isEmpty()) return null;
        orderCounter++;
        return new Order("ORD-"+String.valueOf(orderCounter), customer, amount);
    }
}
