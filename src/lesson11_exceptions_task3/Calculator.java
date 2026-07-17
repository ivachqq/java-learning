package lesson11_exceptions_task3;

public class Calculator {
    public static double divide(int a, int b) throws DivisionByZero{
        if (b==0) throw new DivisionByZero();
        return (double)a/b;
    }
    public static int parseAndAdd(String a, String b) throws InvalidNumberException{
        try {
            return Integer.parseInt(a)+Integer.parseInt(b);
        } catch (NumberFormatException e) {
            throw new InvalidNumberException();
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(divide(10,2));
        } catch (DivisionByZero e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(divide(10,0));
        } catch (DivisionByZero e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(parseAndAdd("12", "30"));
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(parseAndAdd("12", "x"));
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(parseAndAdd(null, "30"));
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
