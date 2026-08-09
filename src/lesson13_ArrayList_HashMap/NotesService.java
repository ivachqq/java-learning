package lesson13_ArrayList_HashMap;

import java.util.ArrayList;

public class NotesService {
    private final static ArrayList<String> notes = new ArrayList<>();
    public static void add(String note) throws IllegalArgumentException{
        if (note == null||note.trim().isEmpty()) throw new IllegalArgumentException();
        notes.add(note);
    }
    public static ArrayList<String> list() {
        return notes;
    }
    public static void removeByIndex(int index) throws IllegalArgumentException{
        if (index < 0 || index >notes.size()-1) throw new IllegalArgumentException();
        notes.remove(index);
    }
    public static void removeByText(String note) throws IllegalArgumentException{
        if (!notes.contains(note)) throw new IllegalArgumentException();
        notes.remove(note);
    }
    public static ArrayList<String> getNotes() {
        return notes;
    }
    public static void clearNotes() {
        notes.clear();
    }
}
