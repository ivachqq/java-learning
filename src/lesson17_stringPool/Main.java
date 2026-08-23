package lesson17_stringPool;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "hi";
        String b = "hi";
        String c = new String("hi");
        String d = new String("hi");
        System.out.println(a==c );
        System.out.println("Ибо это 1 строка из стринг пула, а вторая в хипе");
        System.out.println(a==b);
        System.out.println("Ибо это 1 объект в стринг пуле");
        System.out.println(c==d);
        System.out.println("Ибо это 2 разных объекта в хипе");
        System.out.println("Все equals, ибо значение у всех одно и то же");
        System.out.println("hi"==sc.nextLine());
        System.out.println("false, ибо считываем в рантайме и строка летит в кучу");
        System.out.println("hi".equals(sc.nextLine()));
        System.out.println("true, ибо значение одинаковое");
        String e = c.intern();
        System.out.println(e==a);
        System.out.println("true, ибо мы сделали копию c и перенесли её в пул");
    }
}
