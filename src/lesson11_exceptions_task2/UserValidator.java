package lesson11_exceptions_task2;

public class UserValidator {
    public static void validateLogin(String login) throws InvalidLoginException{
        if (login == null || login.trim().length()<3) throw new InvalidLoginException();
    }
    public static void validateAge(int age) throws IllegalArgumentException{
        if (age<14 || age >100) throw new IllegalArgumentException("Возраст должен быть от 14 до 100");
    }
    public static void validateEmail(String email) throws InvalidEmailException{
        if (email == null || email.trim().length()<3 || !email.contains("@") || email.indexOf("@")==0||email.indexOf("@")==email.length()-1) throw new InvalidEmailException();
    }

    public static void main(String[] args) {
        try {
            validateLogin(null);
        } catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
            System.out.println("Продолжаем работу!");
        }
        try {
            validateLogin(" ");
        } catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
            System.out.println("Продолжаем работу!");
        }
        try {
            validateLogin("ab");
        } catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
            System.out.println("Продолжаем работу!");
        }
        try {
            validateLogin("abc");
        } catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
            System.out.println("Продолжаем работу!");
        }
        try {
            validateAge(13);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Продолжаем работу!");
        }
        try {
            validateAge(101);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Продолжаем работу!");
        }
        try {
            validateEmail("no-at");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
            System.out.println("Продолжаем работу!");
        }
        try {
            validateEmail("@a.com");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
            System.out.println("Продолжаем работу!");
        }
        try {
            validateEmail("a@");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
            System.out.println("Продолжаем работу!");
        }
        try {
            validateEmail("user@mail.com");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
            System.out.println("Продолжаем работу!");
        }

    }
}
