package MiniProjects.ExceptionPractiseApp;

public class Menu {
    public static void printGeneralMenu() {
        for (int i = 0;i<31;i++) {
            if (i == 15) System.out.print("General Menu");
            System.out.print("=");
        }
        System.out.println();
        System.out.println("1. Банковский счёт");
        System.out.println("2. Валидация пользователя");
        System.out.println("3. Калькулятор");
        System.out.println("0. Выйти");
        System.out.print("Ваш выбор: " );
    }
    public static void printBankMenu() {
        for (int i = 0;i<31;i++) {
            if (i == 15) System.out.print("Bank Menu");
            System.out.print("=");
        }
        System.out.println();
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Показать баланс");
        System.out.println("0. Назад");
        System.out.print("Ваш выбор: " );
    }
    public static void printValidMenu() {
        for (int i = 0;i<31;i++) {
            if (i == 15) System.out.print("Validation Menu");
            System.out.print("=");
        }
        System.out.println();
        System.out.println("1. Проверить login");
        System.out.println("2. Проверить age");
        System.out.println("3. Проверить email");
        System.out.println("0. Назад");
        System.out.print("Ваш выбор: " );
    }
    public static void printCalcMenu() {
        for (int i = 0;i<31;i++) {
            if (i == 15) System.out.print("Calculator Menu");
            System.out.print("=");
        }
        System.out.println();
        System.out.println("1. Divide");
        System.out.println("2. Parse and Add  ");
        System.out.println("0. Назад");
        System.out.print("Ваш выбор: " );
    }

}