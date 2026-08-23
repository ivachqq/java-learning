package lesson17_Objects;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(null,12);
        Person p2 = new Person(null, 12);
        System.out.println(p1.equals(p2));
        Person p3 = new Person(null,12);
        Person p4 = new Person("notnull", 12);
        System.out.println(p3.equals(p4));
        Person p5 = new Person("notnull",12);
        Person p6 = new Person("notnull", 12);
        System.out.println(p5.equals(p6));
        System.out.println(p5.hashCode()==p6.hashCode());
        Person p7 = new Person("notnull",12);
        Person p8 = new Person("xui", 12);
        System.out.println(p7.equals(p8));
        // иногда сразу уронить программу проще, ибо иначе программа упадёт позже из-за некоректной обработки данных
    }
}
