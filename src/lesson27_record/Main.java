package lesson27_record;

public class Main {
    public static void main(String[] args) {
        User u = new User(1, "Alice", "alice@mail.com");
        System.out.println(u.id());
        System.out.println(u.name());
        System.out.println(u.email());
        System.out.println(u);  // toString автоматом
        User u2 = new User(1,"Alice", "alice@mail.com");
        System.out.println(u.equals(u2));
        //берём рекорд когда просто храним данные в классе, в классе же имеем поведение и состояние
        //геттеры id() а не getId() ибо мы можем иметь и поле id и метод id(), они отличаются наличием скобок, поэтому программа понимает что это
        //ничего после создания поменять нельзя, поля final
    }
}
