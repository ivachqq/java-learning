package lesson10_OOPInterfaceStatic_task1;

public class PaymentProcessor {
    private static int successCount;
    private static int failCount;
    public static boolean process(Payable p, double amount) {
        if (p.pay(amount)) {
            successCount+=1;
            System.out.println("Баланс кошелька: " + p.getBalance());
            return true;
        }
        failCount+=1;
        return false;
    }
    public static void printStats() {
        System.out.println("Количество удачных платежей: " + successCount);
        System.out.println("Количество неудачных платежей: " +failCount);
    }
}
