package MiniProjects.ExceptionPractiseApp;

import lesson11_exceptions_task1.BankAccount;
import lesson11_exceptions_task1.InsufficientFundsException;
import lesson11_exceptions_task2.InvalidEmailException;
import lesson11_exceptions_task2.InvalidLoginException;
import lesson11_exceptions_task2.UserValidator;
import lesson11_exceptions_task3.Calculator;
import lesson11_exceptions_task3.DivisionByZero;
import lesson11_exceptions_task3.InvalidNumberException;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    private static int readInt(Scanner sc) {
        while (true) {
            try {
                int value = sc.nextInt();
                sc.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Введите целое число.");
                sc.nextLine();
            }
        }
    }
public static void main(String[] args) {
    Menu.printGeneralMenu();
    boolean hasAccount = false;
    Scanner sc = new Scanner(System.in);
    int choose;
    BankAccount b1 = new BankAccount("Vasya", 1000);
    while (true) {
            choose=readInt(sc);
            if (choose == 1) {
                Menu.printBankMenu();
                while (choose != 0) {
                    choose=readInt(sc);
                    if (choose == 1) {
                        System.out.print("Введите сумму пополнения: ");
                        int sum=readInt(sc);
                        try {
                            b1.deposit(sum);
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    } else if (choose == 2) {
                        System.out.print("Введите сумму снятия: ");
                        int sum=readInt(sc);
                        try {
                            b1.withdraw(sum);
                        } catch (IllegalArgumentException | InsufficientFundsException e) {
                            System.out.println(e.getMessage());
                        }
                    } else if (choose == 3) {
                        System.out.print("Ваш баланс: ");
                        System.out.println(b1.getBalance());
                    } else if (choose == 0) {
                        Menu.printGeneralMenu();
                    } else System.out.println("Нет такой команды. Попробуйте ещё раз");
                    if (choose != 0) Menu.printBankMenu();
                }
            }

            else if (choose == 2) {
                Menu.printValidMenu();
                while (choose != 0) {
                    choose=readInt(sc);
                    if (choose == 1) {
                        System.out.print("Введите логин: ");
                        String login = sc.nextLine();
                        try {
                            UserValidator.validateLogin(login);
                            System.out.println("Ваш login валиден!");
                        } catch (InvalidLoginException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    else if (choose == 2) {
                        System.out.print("Введите age: ");
                        int age=readInt(sc);
                        try {
                            UserValidator.validateAge(age);
                            System.out.println("Ваш age валиден!");
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    else if (choose == 3) {
                        System.out.print("Введите email: ");
                        String email = sc.nextLine();
                        try {
                            UserValidator.validateEmail(email);
                            System.out.println("Ваш email валиден!");
                        } catch (InvalidEmailException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    else if (choose == 0) {
                        Menu.printGeneralMenu();
                    } else System.out.println("Нет такой команды. Попробуйте ещё раз");
                    if (choose != 0) Menu.printValidMenu();
                }
            }

            else if (choose == 3) {
                Menu.printCalcMenu();
                while (choose != 0) {
                    choose=readInt(sc);
                    if (choose == 1) {
                        System.out.print("Введите делимое: ");
                        int a = readInt(sc);
                        System.out.print("Введите делитель: ");
                        int b =readInt(sc);
                        try {
                            Calculator.divide(a,b);
                            System.out.println("Результат: " + ((double)a)/b);
                        } catch (DivisionByZero e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    else if (choose == 2) {
                        System.out.print("Введите слагаемое 1: ");
                        String a = sc.nextLine();
                        System.out.print("Введите слагаемое 2: ");
                        String b = sc.nextLine();
                        try {

                            System.out.println("Сумма a+b: " + Calculator.parseAndAdd(a,b));
                        } catch (InvalidNumberException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    else if (choose == 0) {
                        Menu.printGeneralMenu();
                    } else System.out.println("Нет такой команды. Попробуйте ещё раз");
                    if (choose != 0) Menu.printCalcMenu();
                    }
                }
            else if (choose==0) {
                System.out.println("Программа завершена");
                break;
            }
            else {
                System.out.println("Такого выбора нет, попробуйте ещё раз!");
                Menu.printGeneralMenu();
            }
        }
    }
}
