package lesson01_cycles;


import java.util.Scanner;

public class cyclesDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // задача 1
        System.out.println("Задача 1");
        int x = 1;
        while (x<=20) {
            System.out.println(x);
            x++;
        }

        //задача 2
        System.out.println("Задача 2");
        for (int i =20; i>0;i--) {
            System.out.println(i);
        }

        //задача 3
        System.out.println("Задача 3");
        System.out.print("Введите число, до которого выводим (от 1 до вашего числа): ");
        int num = sc.nextInt();
        for (int i = 1; i<=num;i++) {
            System.out.println(i);
        }

        //задача 4
        System.out.println("Задача 4");
        for (int i = 1;i<=20;i++) {
            if (i==10) continue;
            System.out.println(i);
        }

        //задача 5
        System.out.println("Задача 5");
        System.out.print("Введите число: ");
        int newNum = sc.nextInt();
        for (int i = 1;i<=newNum;i++) {
            System.out.println(i);
            if (i==newNum) break;
        }
    }
}
