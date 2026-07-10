package lesson07_strings;

public class StringTasks3 {
    public static String replaceAllOccurrences(String text, String oldPart, String newPart) {
        if (oldPart==null || newPart==null || oldPart.isEmpty() || text == null) return "";
        return text.replace(oldPart,newPart);
    }

    public static String removeSpaces(String text) {
        if (text == null||text.isEmpty()) return "";
        return text.replace(" ", "");
    }

    public static String[] splitByComma(String text) {
        if (text == null) return new String[0];
        if (text.isEmpty()) return new String[]{""};
        return text.split(",");
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

    public static String joinWithCommaAndTrimmed(String[] parts) {
        if (parts == null || parts.length==0) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i< parts.length;i++) {
            if (parts[i]==null || parts[i].trim().isEmpty()) continue;
            sb.append(parts[i].trim());
            sb.append(",");
        }
        return sb.substring(0, sb.length()-1);
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

    public static String maskEmail(String email) {
        if (email==null || !email.contains("@")) return "";
        String[] arr = email.split("@");
        arr[0] = arr[0].charAt(0) + "***";
        return String.join("@", arr);
    }

    public static void main(String[] args) {
        System.out.println("=== replaceAllOccurrences ===");
        System.out.println("TEST replaceAllOccurrences(\"banana\", \"a\", \"o\"): expected=bonono, actual="
                + replaceAllOccurrences("banana", "a", "o"));

        System.out.println("\n=== removeSpaces ===");
        System.out.println("TEST removeSpaces(\"a b  c\"): expected=abc, actual=" + removeSpaces("a b  c"));

        System.out.println("\n=== splitByComma ===");
        System.out.println("TEST splitByComma(\"a,b,c\").length: expected=3, actual=" + splitByComma("a,b,c").length);
        System.out.println("TEST splitByComma(\"a,,b\")[1]: expected=, actual=" + splitByComma("a,,b")[1]);

        System.out.println("\n=== splitByCommaAndTrim ===");
        String[] trimmed = splitByCommaAndTrim(" admin, user, ,guest ");
        System.out.println("TEST splitByCommaAndTrim length: expected=3, actual=" + trimmed.length);
        System.out.println("TEST first item: expected=admin, actual=" + trimmed[0]);

        System.out.println("\n=== joinWithDash ===");
        System.out.println("TEST joinWithDash: expected=a-b-c, actual="
                + joinWithDash(new String[]{"a", "b", "c"}));

        System.out.println("\n=== joinWithCommaAndTrimmed ===");
        System.out.println("TEST joinWithCommaAndTrimmed: expected=admin,user, actual="
                + joinWithCommaAndTrimmed(new String[]{" admin ", null, "", "user"}));

        System.out.println("\n=== countWords ===");
        System.out.println("TEST countWords(\"  Java   is   cool \"): expected=3, actual="
                + countWords("  Java   is   cool "));

        System.out.println("\n=== maskEmail ===");
        System.out.println("TEST maskEmail(\"ivanov@mail.com\"): expected=i***@mail.com, actual="
                + maskEmail("ivanov@mail.com"));
        System.out.println("TEST maskEmail(\"bad-email\"): expected=, actual=" + maskEmail("bad-email"));
    }
}
