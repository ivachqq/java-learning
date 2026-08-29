package lesson24_regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean isDigitOnly(String s) {
        return s.matches("\\d+");
    }
    public static List<String> extractAllNumbers(String s) {
        List<String> list = new ArrayList<>();
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(s);
        while (m.find()) {
            list.add(m.group());
        }
        return list;
    }
    public static boolean isSimpleEmail(String s) {
        return s.matches("\\w+@\\w+\\.\\w+");
    }
    public static String normalizeSpaces(String s) {
        return s.replaceAll("\\s+", " ").trim();
    }
    public static List<String> splitTags(String s) {
        return Arrays.stream(s.split("[,;]")).toList();
    }

    public static void main(String[] args) {
        System.out.println(isDigitOnly("123a"));
        System.out.println(isDigitOnly("123"));
        System.out.println();
        System.out.println(extractAllNumbers("42ert12-12dsadszxqwe1"));
        System.out.println();
        System.out.println(isSimpleEmail("123e@gmail.com"));
        //мы используем регулярки когда надо выцепить какой-то шаблон текста из целой строки, числа из лога или email из всех данных там
        //мы не используем, когда это слишком лёгкая задача, заменяемая существующими методами или же когда нужен полноценный парсер

        //Метод	Что делает
        //find() ищет следующее совпадение
        //matches() вся строка целиком
        //group() текст совпадения
        //group(1) первая скобочная группа
    }
}
