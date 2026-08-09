package lesson12_files_task1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;

public class NotesFile {
    public static void save(Path path, String text) {
        try {
            Files.writeString(path, text, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Неполадки с файлом, не можем выполнить перезапись!");
        }
    }
    public static String load(Path path) {
        try {
            return Files.readString(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            return "Невозможно прочитать файл!";
        }
    }
    public static void addLine(Path path, String line) {
        try {
            Files.writeString(
                    path,
                    line,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        } catch (IOException _) {
            System.out.println("Невозможно записать дополнительную строку!");
        }
    }
    public static String[] loadLines(Path path) {
        try {
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            String[] arr = new String[lines.size()];
            int index=0;
            for (String line : lines) {
                arr[index]=line;
                index++;
            }
            return arr;
        } catch (IOException _) {
            return new String[0];
        }
    }
}
