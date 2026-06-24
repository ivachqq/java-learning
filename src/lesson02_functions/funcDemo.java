package lesson02_functions;


import java.util.Scanner;

public class funcDemo {
    //задача 1
    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
    //задача 2
    public static int square(int num) {
        return num*num;
    }
    //задача 3
    public static int max(int num1, int num2) {
        if (num1>num2) return num1;
        return num2;
    }
    public static void main(String[] args) {
        //задача 1
        System.out.print("Задача 1 - применяем sayHello: " );
        sayHello("Ваня");
        //задача 2
        System.out.println("Задача 2 - применяем square (число 5): " + square(5));
        //задача 3
        System.out.println("Задача 3 - применяем max (числа 3 и 10): " + max(3,10));
    }
}
