package lesson13_ArrayList_HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentGrades {
    private static HashMap<String, ArrayList<Integer>> grades = new HashMap<>();
    public static void addGrade(String student, Integer grade) throws IllegalArgumentException{
        if (grade<1 || grade>5 || student == null || student.trim().isEmpty()) throw new IllegalArgumentException();
        if (!grades.containsKey(student)) {
            grades.put(student, new ArrayList<>());
        }
        grades.get(student).add(grade);
    }
    public static double getAverage(String student) {
        if (grades.get(student)==null) return -1;
        int sum = 0;
        for (Integer grade:grades.get(student)) {
            sum+=grade;
        }
        return (double) sum /grades.get(student).size();
    }
    public static void printStudent(String student) {
        if (!grades.containsKey(student)) {
            System.out.println("Студента нет в списке");
            return;
        }
        System.out.print(student + ": ");
        for (Integer grade : grades.get(student)) {
            System.out.print(grade);
        }
        System.out.println();
    }
    public static void printAll() {
        for (String student : grades.keySet()) {
            printStudent(student);
        }
    }
}
