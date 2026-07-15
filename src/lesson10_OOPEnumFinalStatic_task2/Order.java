package lesson10_OOPEnumFinalStatic_task2;

public class Order {
    private final String id;
    private final String customerName;
    private final double totalAmount;
    private OrderStatus status;
    public Order(String id, String customerName, double totalAmount) {
        this.totalAmount=totalAmount;
        this.id=id;
        this.customerName=customerName;
        status=OrderStatus.NEW;
    }
    public void markPaid() {
        if (status==OrderStatus.NEW) status=OrderStatus.PAID;
    }
    public void markShipped() {
        if (status==OrderStatus.PAID) status=OrderStatus.SHIPPED;
    }
    public void cancel() {
        if (status==OrderStatus.NEW || status==OrderStatus.PAID) status=OrderStatus.CANCELLED;
        else System.out.println("Уже нельзя отменить заказ!");
    }
    @Override
    public String toString() {
        return "id: " + id + ", customer: " + customerName + ", amount: " + totalAmount + ", status: " + status;
    }
}
