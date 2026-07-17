package lesson11_exceptions_task2;

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException() {
        super("Email невалидный: null/пустой/нет символа @/ символ @ стоит в начале или конце");
    }
}
