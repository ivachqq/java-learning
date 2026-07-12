package lesson08_overloading;

import java.math.BigDecimal;

public class OverloadingTasks {
    public static int max(int a, int b) {
        return a>b ? a : b;
    }
    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public static void printInfo(String name) {
        System.out.println("Name: " + name);
    }
    public static void printInfo(String name, int age) {
        System.out.println("Name: " + name+ ", Age: " +age);
    }
    public static void printInfo(String name, int age, String city) {
        System.out.println("Name: " + name+ ", Age: " +age + ", City: " + city);
    }

    public static int sum(int a, int b) {
        return a+b;
    }
    public static int sum(int a, int b, int c) {
        return a+b+c;
    }
    public static int sum(int[] numbers) {
        if (numbers==null) return -1;
        int summ=0;
        for (int num:numbers) summ+=num;
        return summ;
    }

    public static boolean isValid(String text) {
        return text != null && !text.trim().isEmpty();
    }
    public static boolean isValid(String text, int minLength) {
        return isValid(text) && text.trim().length()>=minLength;
    }
    public static boolean isValid(String text, int minLength, int maxLength) {
        return isValid(text,minLength)&&text.trim().length()<=maxLength;
    }

    public static String formatMoney(int amount) {
        return amount+" RUB";
    }
    public static String formatMoney(int amount, String currency) {
        return amount+" "+currency;
    }
    public static String formatMoney(double amount, String currency) {
        BigDecimal bd = new BigDecimal(String.valueOf(amount));
        bd = bd.stripTrailingZeros();
        return bd + " " + currency;
    }

    public static int search(int[] arr, int value) {
        if (arr==null) return -1;
        for (int i =0;i<arr.length;i++) {
            if (value==arr[i]) return i;
        }
        return -1;
    }
    static int search(int[] arr, int value, int startIndex) {
        if (arr==null || startIndex<0||startIndex>arr.length-1) return -1;
        for (int i =startIndex;i<arr.length;i++) {
            if (value==arr[i]) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("=== max ===");
        System.out.println("TEST max(3,10): expected=10, actual=" + max(3, 10));
        System.out.println("TEST max(3,10,7): expected=10, actual=" + max(3, 10, 7));

        System.out.println("\n=== printInfo ===");
        printInfo("Ivan");
        printInfo("Ivan", 20);
        printInfo("Ivan", 20, "Moscow");

        System.out.println("\n=== sum ===");
        System.out.println("TEST sum(2,3): expected=5, actual=" + sum(2, 3));
        System.out.println("TEST sum(1,2,3): expected=6, actual=" + sum(1, 2, 3));
        System.out.println("TEST sum([1,2,3]): expected=6, actual=" + sum(new int[]{1, 2, 3}));
        System.out.println("TEST sum(null): expected=-1, actual=" + sum((int[]) null));

        System.out.println("\n=== isValid ===");
        System.out.println("TEST isValid(\"  hi  \"): expected=true, actual=" + isValid("  hi  "));
        System.out.println("TEST isValid(\"  hi  \", 5): expected=false, actual=" + isValid("  hi  ", 5));
        System.out.println("TEST isValid(\"hello\", 3, 10): expected=true, actual=" + isValid("hello", 3, 10));

        System.out.println("\n=== formatMoney ===");
        System.out.println("TEST formatMoney(1000): expected=1000 RUB, actual=" + formatMoney(1000));
        System.out.println("TEST formatMoney(1000,\"USD\"): expected=1000 USD, actual=" + formatMoney(1000, "USD"));
        System.out.println("TEST formatMoney(1000.50,\"EUR\"): expected=1000.5 EUR, actual="
                + formatMoney(1000.50, "EUR"));

        System.out.println("\n=== search ===");
        System.out.println("TEST search([1,2,3,2],2): expected=1, actual=" + search(new int[]{1, 2, 3, 2}, 2));
        System.out.println("TEST search([1,2,3,2],2,2): expected=3, actual="
                + search(new int[]{1, 2, 3, 2}, 2, 2));
    }
}
