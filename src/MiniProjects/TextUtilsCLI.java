package MiniProjects;

import java.util.Scanner;

public class TextUtilsCLI {

    public static String normalizeLogin(String login) {
        if (login==null) return "";
        return login.trim().toLowerCase();
    }

    public static int countWords(String text) {
        if (text == null || text.isEmpty()) return 0;
        int count = 0;
        String[] arr = text.split(" ");
        for (String str:arr) {
            str = str.trim();
            if (!str.isEmpty()) count++;
        }
        return count;
    }

    public static String replaceAllManual(String text, String oldPart, String newPart) {
        if (text == null || oldPart == null || newPart == null || oldPart.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        int from = 0;
        while (true) {
            int pos = text.indexOf(oldPart, from);
            if (pos == -1) break;
            for (int i = from; i < pos; i++) {
                sb.append(text.charAt(i));
            }
            sb.append(newPart);
            from = pos + oldPart.length();
        }
        for (int i = from; i < text.length(); i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static String[] splitByCommaAndTrim(String text) {
        if (text == null || text.isEmpty()) return new String[0];
        String[] arr = text.split(",");
        int counterEmpty = 0;
        for (int i = 0;i<arr.length;i++) {
            arr[i] = arr[i].trim();
            if (arr[i].isEmpty()) counterEmpty++;
        }
        String[] arr2 = new String[arr.length-counterEmpty];
        int index=0;
        for (String str: arr) {
            if (!str.isEmpty()) {arr2[index]=str;
                index++;}
        }
        return arr2;
    }

    public static String joinWithDash(String[] parts) {
        if (parts == null || parts.length==0) return "";
        return String.join("-", parts);
    }

    public static String maskEmail(String email) {
        if (email==null || !email.contains("@")) return "";
        String[] arr = email.split("@");
        arr[0] = arr[0].charAt(0) + "***";
        return String.join("@", arr);
    }

    public static String reverseWithBuilder(String text) {
        if (text == null) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = text.length()-1;i>=0;i--) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static void printMenu() {
        System.out.println("1) Нормализовать логин");
        System.out.println("2) Подсчитать количество слов");
        System.out.println("3) Заменить часть в тексте");
        System.out.println("4) Разбить текст по запятым");
        System.out.println("5) Соединить текст по дефисам");
        System.out.println("6) Маска email");
        System.out.println("7) Перевернуть текст");
        System.out.println("0) Завершить работу");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printMenu();
        while (true) {
            System.out.print("Введите номер действия: ");
            int choose = sc.nextInt();
            sc.nextLine();
            if (choose >= 0 && choose<=7) {
                if (choose == 1) {
                    System.out.print("Введите логин: ");
                    String login = sc.nextLine();
                    System.out.println("Нормализованный логин: " + normalizeLogin(login));
                } else if (choose == 2) {
                    System.out.print("Введите текст: ");
                    String text = sc.nextLine();
                    System.out.println("Количество слов: " + countWords(text));
                } else if (choose==3) {
                    System.out.println("Введите текст: ");
                    String text = sc.nextLine();
                    System.out.println("Введите, какой текст хотите заменить: ");
                    String oldPart = sc.nextLine();
                    System.out.println("Введите, на какой текст хотите заменить: ");
                    String newPart = sc.nextLine();
                    System.out.println("Новый текст: " + replaceAllManual(text,oldPart,newPart));
                } else if (choose == 4) {
                    System.out.println("Введите текст: ");
                    String text = sc.nextLine();
                    String[] arr = splitByCommaAndTrim(text);
                    System.out.print("Массив слов: {");
                    for (int i = 0; i < arr.length;i++) {
                        System.out.print(arr[i]);
                        if (i!= arr.length-1) System.out.print(", ");
                    }
                    System.out.print("}");
                    System.out.println();
                } else if (choose == 5) {
                    System.out.println("Введите массив (формат: слово, слово, слово): ");
                    String[] arr = splitByCommaAndTrim(sc.nextLine());
                    System.out.println("Новый текст: " + joinWithDash(arr));
                } else if (choose == 6) {
                    System.out.println("Введите email: ");
                    String email = sc.nextLine();
                    System.out.println("Маска email: " + maskEmail(email));
                } else if (choose == 7) {
                    System.out.println("Введите текст: ");
                    String text = sc.nextLine();
                    System.out.println("Перевёрнутый текст: " + reverseWithBuilder(text));
                } else if (choose==0) {
                    break;
                }
                printMenu();
            }
            else {
                System.out.println("Такой команды нет! Попробуйте ещё раз! ");
                printMenu();
            }
        }
    }
}
