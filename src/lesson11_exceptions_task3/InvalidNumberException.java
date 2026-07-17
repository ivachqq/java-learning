package lesson11_exceptions_task3;

public class InvalidNumberException extends RuntimeException {
    public InvalidNumberException() {
        super("Невозможно обработать число");
    }
}
