package lesson11_exceptions_task3;

public class DivisionByZero extends RuntimeException {
    public DivisionByZero() {
        super("Вы пытаетесь поделить на 0!");
    }
}
