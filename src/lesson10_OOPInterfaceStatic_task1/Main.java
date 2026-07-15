package lesson10_OOPInterfaceStatic_task1;

public class Main {
    public static void main(String[] args) {
        Wallet w1 = new Wallet(1000);
        Wallet w2 = new Wallet(-1000);
        PaymentProcessor.process(w1, 300);
        PaymentProcessor.process(w1, -300);
        PaymentProcessor.process(w2, 300);
        PaymentProcessor.process(w2, -300);
        PaymentProcessor.printStats();
    }
}
