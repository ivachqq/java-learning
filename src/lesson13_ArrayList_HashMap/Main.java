package lesson13_ArrayList_HashMap;

public class Main {
//    public static void main(String[] args) {
//        try {
//        NotesService.add("aaa");}
//        catch (IllegalArgumentException _) {
//            System.out.println("Неправильный аргумент");
//        }
//        try {
//            NotesService.add("bbb");}
//        catch (IllegalArgumentException _) {
//            System.out.println("Неправильный аргумент");
//        }
//        try {
//            NotesService.add("ccc");}
//        catch (IllegalArgumentException _) {
//            System.out.println("Неправильный аргумент");
//        }
//        try {
//            NotesService.add("ddd");}
//        catch (IllegalArgumentException _) {
//            System.out.println("Неправильный аргумент");
//        }
//        try {
//            NotesService.removeByIndex(1);}
//        catch (IllegalArgumentException _) {
//            System.out.println("Неправильный индекс");
//        }
//        try {
//            NotesService.removeByText("ccc");}
//        catch (IllegalArgumentException _) {
//            System.out.println("Такого текста не существует");
//        }
//        for (String note : NotesService.getNotes()) {
//            System.out.print(note + " ");
//        }
//        NotesService.clearNotes();
//        System.out.println(NotesService.getNotes().size());
//    }
//    public static void main(String[] args) {
//        try {
//            PhoneBook.add("Misha", "89138220392");
//        } catch (IllegalArgumentException _) {
//            System.out.println("Вы что-то не заполнили");
//        }
//        try {
//            PhoneBook.add("Ivan", "89138220222");
//        } catch (IllegalArgumentException _) {
//            System.out.println("Вы что-то не заполнили");
//        }
//        try {
//            PhoneBook.add("Eva", "89138310392");
//        } catch (IllegalArgumentException _) {
//            System.out.println("Вы что-то не заполнили");
//        }
//        try {
//            PhoneBook.add("Misha", "89138220222");
//        } catch (IllegalArgumentException _) {
//            System.out.println("Вы что-то не заполнили");
//        }
//        System.out.println(PhoneBook.getPhone("Misha"));
//        System.out.println(PhoneBook.getPhone("ASD"));
//        PhoneBook.removeContact("Misha");
//        PhoneBook.printAll();
//    }
    public static void main(String[] args) {
        StudentGrades.addGrade("Misha",5);
        StudentGrades.addGrade("Misha",4);
        StudentGrades.addGrade("Misha",5);
        StudentGrades.addGrade("Alisa",3);
        StudentGrades.addGrade("Alisa",4);
        System.out.println(StudentGrades.getAverage("Misha"));
        StudentGrades.printAll();
    }
}
