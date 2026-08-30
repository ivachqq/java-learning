package lesson26_ExceptionIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void checkPositive(int n) {
        if (n<=0) throw new IllegalArgumentException("Число меньше нуля!");
        System.out.println("ok: " + n);
    }
    public static String readRaw(Path path) throws IOException {
        return Files.readString(path, StandardCharsets.UTF_8);
    }
    public static String readText(Path path) throws FileProcessException {
        try {
            return Files.readString(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new FileProcessException("Не удалось найти файл: " + path, e);
        }
    }
    public static long countLines(Path path) throws FileProcessException {
        long count = 0;
        try (BufferedReader b = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line;
            while ((line = b.readLine()) !=null) {
                count++;
            }
        } catch (IOException e) {
            throw new FileProcessException("Не удалось найти файл:" + path, e);
        }
        return count;
    }
    public static void writeLines(Path path, List<String> lines) throws FileProcessException {
        try {
            Files.write(path, lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new FileProcessException("Не удалось записать в файл: " + path, e);
        }
    }
    public static int parsePositiveInt(String s) {
        int value = Integer.parseInt(s);
        if (value <= 0) {
            throw new IllegalArgumentException("должно быть > 0, было: " + value);
        }
        return value;
    }
    public static void main(String[] args) {
        checkPositive(5);
        try {
            checkPositive(-1);
            System.out.println("Удачно");
        } catch (IllegalArgumentException e) {
            System.out.println("ошибка: " + e.getMessage());
        }
        System.out.println("Вышли из try catch");
        try {
            System.out.println(readRaw(Path.of("src/lesson26_ExceptionIO/tmp.txt")));
        } catch (IOException e) {
            System.out.println("Ошибка считывания файла: " + e.getMessage());;
        }
        try {
            System.out.println(readRaw(Path.of("src/lesson26_ExceptionIO/ффф.txt")));
        } catch (IOException e) {
            System.out.println("Ошибка считывания файла: " + e.getMessage());
        }
        try {
            System.out.println(readText(Path.of("src/lesson26_ExceptionIO/tmp.txt")));
        } catch (FileProcessException e) {
            System.out.println("Ошибка считывания файла: " + e.getMessage());
        }
        try {
            System.out.println(readText(Path.of("src/lesson26_ExceptionIO/AAA.txt")));
        } catch (FileProcessException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
        try {
            System.out.println(countLines(Path.of("src/lesson26_ExceptionIO/tmp.txt")));
        } catch (FileProcessException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());;
        }
        Path testPath = Path.of("src/lesson26_ExceptionIO/tmp-test.txt");

        try {
            // 1. записать
            writeLines(testPath, List.of("один", "два", "три"));

            // 2. прочитать целиком
            System.out.println("содержимое: " + readText(testPath));

            // 3. посчитать строки
            System.out.println("строк: " + countLines(testPath));

            // 4. удалить
            Files.deleteIfExists(testPath);
            System.out.println("файл удалён");

        } catch (FileProcessException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();  // для учёбы ок
        } catch (IOException e) {
            // deleteIfExists тоже может кинуть IOException
            System.out.println(e.getMessage());
        }
        // 1. deposit(-100) — какое exception? checked или unchecked? почему?
        // uncheked, это illegalarguementexception, можно было бы не проверять
        // 2. Files.readString(нет файла) — какое? checked/unchecked?
        //cheked, тут проблема уже не внутри программы, а в том, что мы не можем найти файл
        // 3. Integer.parseInt("abc") — какое? checked/unchecked?
        // unchecked, NumberFormatException наследник runtime
        // 4. Почему IllegalArgumentException не пишут в throws?
        // потому что мы можем не предупреждать программу о unchecked ошибках. Обычно не пишем throws для unchecked
        // 5. Можно ли поймать IOException и кинуть IllegalArgumentException?
        // в целом можно, если caller'у проще ловить IllegalArgumentException
    }
}
