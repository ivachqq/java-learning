package lesson03_oop;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Иван",18);
        Student student2 = new Student("Григорий",19);
        student1.introduce();
        student2.introduce();
    }
}
