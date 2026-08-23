package lesson17_varargs;

public class Main {
    public static String repeat(String s, int... times) throws IllegalArgumentException{
        StringBuilder sb = new StringBuilder();
        if (times.length>=2 || s==null) {
            throw new IllegalArgumentException("Проблема с передачей аргументов");
        }
        if (times.length==0) {
            return s;
        }
        for (int i = 0;i<times[0];i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static long sumAll(long... nums) {
        if (nums.length==0) return 0;
        long sum = 0;
        for (int i = 0; i<nums.length;i++) {
            sum+=nums[i];
        }
        return sum;
    }

    public static void printAll(String... words)  throws IllegalArgumentException{
        if (words.length==0) throw new IllegalArgumentException("Вы не передали слова для вывода");
        for (int i = 0;i<words.length;i++) {
            if (words[i]==null) System.out.println("Невозможно вывести null объект");
            else System.out.println(words[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println(repeat("sss",3));
        System.out.println(repeat("sss"));
        System.out.println(sumAll(1,2,3,4,5));
        printAll("aaa","bbbb");
        printAll("aaa", null, "bbbb");
        try {
            printAll();
        } catch (IllegalArgumentException e) {
            System.out.println("OK: " + e.getMessage());
        }
    }
}
