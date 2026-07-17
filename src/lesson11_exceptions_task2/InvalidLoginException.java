package lesson11_exceptions_task2;

public class InvalidLoginException extends RuntimeException {
    public InvalidLoginException() {
        super("Логин невалидный: null/пустой/короче 3 символов");
    }
}
