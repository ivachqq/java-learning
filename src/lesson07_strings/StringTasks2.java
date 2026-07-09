package lesson07_strings;

public class StringTasks2 {
    public static boolean areEqual(String a, String b) {
        if (a == null || b == null) return false;
        return a.equals(b);
    }

    public static boolean areEqualIgnoreCase(String a, String b) {
        if (a == null || b == null) return false;
        return a.toLowerCase().equals(b.toLowerCase());
    }

    public static boolean containsText(String text, String part) {
        if (text == null || part == null) return false;
        if (part.isEmpty()) return true;
        return text.contains(part);
    }

    public static int firstIndexOf(String text, String part) {
        if (text == null || part == null) return -1;
        if (part.isEmpty()) return 0;
        return text.indexOf(part);
    }

    public static boolean startsWithPrefix(String text, String prefix) {
        if (text == null || prefix == null) return false;
        if (prefix.isEmpty()) return true;
        return text.startsWith(prefix);
    }
    public static boolean endsWithSuffix(String text, String suffix) {
        if (text == null || suffix == null) return false;
        if (suffix.isEmpty()) return true;
        return text.endsWith(suffix);
    }

    public static String trimSafe(String text) {
        if (text==null) return "";
        return text.trim();
    }

    public static String normalizeLogin(String login) {
        if (login==null) return "";
        return login.trim().toLowerCase();
    }

    public static int countOccurrences(String text, String part) {
        if (text == null || part == null || part.isEmpty()) return -1;
        int from = 0;
        int count = 0;
        while (true) {
            int pos = text.indexOf(part, from);
            if (pos == -1) break;
            count++;
            from = pos + part.length();
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("=== areEqual ===");
        System.out.println("TEST areEqual(\"Java\", \"Java\"): expected=true, actual=" + areEqual("Java", "Java"));
        System.out.println("TEST areEqual(\"Java\", \"java\"): expected=false, actual=" + areEqual("Java", "java"));
        System.out.println("TEST areEqual(null, \"a\"): expected=false, actual=" + areEqual(null, "a"));

        System.out.println("\n=== areEqualIgnoreCase ===");
        System.out.println("TEST areEqualIgnoreCase(\"Java\", \"java\"): expected=true, actual=" + areEqualIgnoreCase("Java", "java"));

        System.out.println("\n=== containsText ===");
        System.out.println("TEST containsText(\"backend\", \"end\"): expected=true, actual=" + containsText("backend", "end"));
        System.out.println("TEST containsText(\"backend\", \"xyz\"): expected=false, actual=" + containsText("backend", "xyz"));

        System.out.println("\n=== firstIndexOf ===");
        System.out.println("TEST firstIndexOf(\"banana\", \"a\"): expected=1, actual=" + firstIndexOf("banana", "a"));
        System.out.println("TEST firstIndexOf(\"banana\", \"z\"): expected=-1, actual=" + firstIndexOf("banana", "z"));

        System.out.println("\n=== startsWithPrefix / endsWithSuffix ===");
        System.out.println("TEST startsWithPrefix(\"backend\", \"back\"): expected=true, actual=" + startsWithPrefix("backend", "back"));
        System.out.println("TEST endsWithSuffix(\"backend\", \"end\"): expected=true, actual=" + endsWithSuffix("backend", "end"));

        System.out.println("\n=== trimSafe ===");
        System.out.println("TEST trimSafe(null): expected=, actual=" + trimSafe(null));
        System.out.println("TEST trimSafe(\"  Java  \"): expected=Java, actual=" + trimSafe("  Java  "));

        System.out.println("\n=== normalizeLogin ===");
        System.out.println("TEST normalizeLogin(\"  Admin  \"): expected=admin, actual=" + normalizeLogin("  Admin  "));

        System.out.println("\n=== countOccurrences ===");
        System.out.println("TEST countOccurrences(\"banana\", \"ana\"): expected=1, actual=" + countOccurrences("banana", "ana"));
        System.out.println("TEST countOccurrences(\"aaaa\", \"aa\"): expected=2, actual=" + countOccurrences("aaaa", "aa"));
    }
}
