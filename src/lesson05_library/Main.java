package lesson05_library;

public class Main {
    public static void checkTakeBook(Book book) {
        boolean success1 = book.take();
        if (success1) System.out.println(book.getName() + " успешно выдана!");
        else System.out.println(book.getName() + " уже выдана, сейчас вы не можете её взять!");
    }
    public static void checkReturnBook(Book book) {
        boolean success1 = book.returnBook();
        if (success1) System.out.println(book.getName() + " успешно возвращена!");
        else System.out.println(book.getName() + " уже в библиотеке!");
    }
    public static void main(String[] args) {
        Book book1 = new Book("Книга 1", "Гоголь");
        checkTakeBook(book1);
        checkTakeBook(book1);
        checkReturnBook(book1);
        checkTakeBook(book1);
    }
}
