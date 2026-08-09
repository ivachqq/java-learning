package lesson12_files_task1;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\Lenovo\\IdeaProjects\\JavaPractise\\src\\try.txt");
        NotesFile.save(path, "первая\n");
        NotesFile.addLine(path, "вторая\n");
        NotesFile.addLine(path, "третья");
        System.out.println(NotesFile.load(path));
        for (String line : NotesFile.loadLines(path)) {
            System.out.println(line);
        }
    }

}
