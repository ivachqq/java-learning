package lesson23_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static BigDecimal addPrices(String a, String b) {
        return new BigDecimal(a).add(new BigDecimal(b));
    }
    public static BigDecimal applyDiscount(String price, int percent) {
        String per = String.valueOf((100-(double)percent)/100);
        return new BigDecimal(price).multiply(new BigDecimal(per)).setScale(2, RoundingMode.HALF_UP);
    }
    public static BigDecimal splitBill(String price, int people) {
        return new BigDecimal(price).divide(BigDecimal.valueOf(people), 2,RoundingMode.HALF_UP);
    }
    public static boolean isGreater(String a, String b) {
        return new BigDecimal(a).compareTo(new BigDecimal(b))>0;
    }
    public static void main(String[] args) {
        System.out.println(addPrices("20.22","30.21"));
        System.out.println(applyDiscount("10909.201", 5));
        System.out.println(splitBill("109092.109",20));
        System.out.println(isGreater("123.11","123.12"));
        System.out.println();
        System.out.println(new BigDecimal(0.1).add(new BigDecimal(0.2)));
        System.out.println(new BigDecimal("0.1").add(new BigDecimal("0.2")));
        //результаты разные, ибо 0.1 на самом деле не 0.1, а 0.10000000005 (к примеру) и так работают все числа double (особенность языка)
        //поэтому придуман специальный класс для проведения точных вычислений с помощью класса BigDecimal
    }
}
