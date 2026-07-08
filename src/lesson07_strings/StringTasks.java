package lesson07_strings;

public class StringTasks {
    public static int getLength(String str) {
        if (str==null) return -1;
        return str.length();
    }

    public static char firstChar(String str) {
        if (str==null || str.isEmpty()) return '\0';
        return str.charAt(0);
    }

    public static char lastChar(String str) {
        if (str==null || str.isEmpty()) return '\0';
        return str.charAt(str.length()-1);
    }

    public static char charAtIndex(String str, int index) {
        if (str==null || str.isEmpty() || 0>index || index>=str.length()) return '\0';
        return str.charAt(index);
    }

    public static String substringSafe(String str, int start, int end) {
        if (str==null || str.isEmpty() || start <0 || end >str.length() || start>end) return "";
        return str.substring(start, end);
    }

    public static int countLetters(String str) {
        if (str==null) return -1;
        int counterLetters = 0;
        for (int i = 0; i<str.length();i++) {
            if ( Character.isLetter(str.charAt(i))) counterLetters++;
        }
        return counterLetters;
    }

    public static int countDigits(String str) {
        if (str==null) return -1;
        int counterDigits = 0;
        for (int i = 0; i<str.length();i++) {
            if ( Character.isDigit(str.charAt(i))) counterDigits++;
        }
        return counterDigits;
    }

    public static int countSpaces(String s) {
        if(s==null) return -1;
        int counter=0;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == ' ') counter++;
        }
        return counter;
    }

    public static boolean isPalindrome(String s) {
        if (s==null) return false;
        for (int i = 0; i<s.length()/2;i++) {
            if (s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }

    public static String reverse(String s) {
        if (s==null) return "";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0;i<s.length()/2;i++) {
            char save = s.charAt(i);
            sb.setCharAt(i,s.charAt(s.length()-1-i));
            sb.setCharAt(s.length()-1-i,save);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("=== getLength ===");
        System.out.println("TEST getLength(null): expected=-1, actual=" + getLength(null));
        System.out.println("TEST getLength(\"\"): expected=0, actual=" + getLength(""));
        System.out.println("TEST getLength(\"abc\"): expected=3, actual=" + getLength("abc"));

        System.out.println("\n=== firstChar ===");
        System.out.println("TEST firstChar(null): expected=0, actual=" + (int) firstChar(null));
        System.out.println("TEST firstChar(\"\"): expected=0, actual=" + (int) firstChar(""));
        System.out.println("TEST firstChar(\"Java\"): expected=74, actual=" + (int) firstChar("Java"));

        System.out.println("\n=== lastChar ===");
        System.out.println("TEST lastChar(\"Java\"): expected=97, actual=" + (int) lastChar("Java"));
        System.out.println("TEST lastChar(\"A\"): expected=65, actual=" + (int) lastChar("A"));

        System.out.println("\n=== charAtIndex ===");
        System.out.println("TEST charAtIndex(\"abc\", 1): expected=98, actual=" + (int) charAtIndex("abc", 1));
        System.out.println("TEST charAtIndex(\"abc\", -1): expected=0, actual=" + (int) charAtIndex("abc", -1));
        System.out.println("TEST charAtIndex(\"abc\", 3): expected=0, actual=" + (int) charAtIndex("abc", 3));

        System.out.println("\n=== substringSafe ===");
        System.out.println("TEST substringSafe(\"backend\", 0, 4): expected=back, actual=" + substringSafe("backend", 0, 4));
        System.out.println("TEST substringSafe(\"backend\", 4, 4): expected=, actual=" + substringSafe("backend", 4, 4));
        System.out.println("TEST substringSafe(\"backend\", 5, 4): expected=, actual=" + substringSafe("backend", 5, 4));

        System.out.println("\n=== countLetters ===");
        System.out.println("TEST countLetters(null): expected=-1, actual=" + countLetters(null));
        System.out.println("TEST countLetters(\"abc\"): expected=3, actual=" + countLetters("abc"));
        System.out.println("TEST countLetters(\"a1! б\"): expected=2, actual=" + countLetters("a1! б"));

        System.out.println("\n=== countDigits ===");
        System.out.println("TEST countDigits(\"a1b20!\"): expected=3, actual=" + countDigits("a1b20!"));

        System.out.println("\n=== countSpaces ===");
        System.out.println("TEST countSpaces(\"a b  c\"): expected=3, actual=" + countSpaces("a b  c"));
        System.out.println("TEST countSpaces(\"   a   \"): expected=6, actual=" + countSpaces("   a   "));

        System.out.println("\n=== isPalindrome ===");
        System.out.println("TEST isPalindrome(\"level\"): expected=true, actual=" + isPalindrome("level"));
        System.out.println("TEST isPalindrome(\"Level\"): expected=false, actual=" + isPalindrome("Level"));
        System.out.println("TEST isPalindrome(\"a b a\"): expected=true, actual=" + isPalindrome("a b a"));

        System.out.println("\n=== reverse ===");
        System.out.println("TEST reverse(null): expected=, actual=" + reverse(null));
        System.out.println("TEST reverse(\"Java\"): expected=avaJ, actual=" + reverse("Java"));
        System.out.println("TEST reverse(\"a b\"): expected=b a, actual=" + reverse("a b"));
    }
}
