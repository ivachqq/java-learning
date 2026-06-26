package lesson03_oop;

public class Student {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age=age;
    }

    public void introduce() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }
}