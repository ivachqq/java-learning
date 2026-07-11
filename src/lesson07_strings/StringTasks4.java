package lesson07_strings;

public class StringTasks4 {

   public static String concatWithBuilder(String[] parts) {
       if (parts==null || parts.length==0) return "";
       StringBuilder sb = new StringBuilder();
       for (String str: parts) sb.append(str);
       return sb.toString();
   }
    public static String concatWithComma(String[] parts) {
        if (parts == null || parts.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            if (part == null || part.trim().isEmpty()) continue;
            if (sb.length() > 0) sb.append(",");
            sb.append(part.trim());
        }
        return sb.toString();
    }
    public static String repeatText(String text, int times) {
        if (text==null || times<=0) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times;i++) {
            sb.append(text);
        }
        return sb.toString();
    }
    public static String buildReportHeader(String title, int width) {
        if (title==null) return "";
        if (width<4) width=4;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < width; i++) {
            sb.append("=");
        }
        sb.append("\n");
        sb.append(title);
        sb.append("\n");
        for (int i = 0; i < width; i++) {
            sb.append("=");
        }
        return sb.toString();
    }
    public static String reverseWithBuilder(String text) {
        if (text == null) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = text.length()-1;i>=0;i--) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }
    public static String replaceAllManual(String text, String oldPart, String newPart) {
        if (text == null || oldPart == null || newPart == null || oldPart.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        int from = 0;
        while (true) {
            int pos = text.indexOf(oldPart, from);
            if (pos == -1) break;
            for (int i = from; i < pos; i++) {
                sb.append(text.charAt(i));
            }
            sb.append(newPart);
            from = pos + oldPart.length();
        }
        for (int i = from; i < text.length(); i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("=== concatWithBuilder ===");
        System.out.println("TEST concatWithBuilder: expected=abc, actual="
                + concatWithBuilder(new String[]{"a", "b", "c"}));

        System.out.println("\n=== concatWithComma ===");
        System.out.println("TEST concatWithComma: expected=a,b, actual="
                + concatWithComma(new String[]{"a", null, "", "b"}));

        System.out.println("\n=== repeatText ===");
        System.out.println("TEST repeatText(\"ha\", 3): expected=hahaha, actual=" + repeatText("ha", 3));

        System.out.println("\n=== buildReportHeader ===");
        System.out.println("TEST buildReportHeader:\n" + buildReportHeader("Java", 6));

        System.out.println("\n=== reverseWithBuilder ===");
        System.out.println("TEST reverseWithBuilder(\"Java\"): expected=avaJ, actual="
                + reverseWithBuilder("Java"));

        System.out.println("\n=== replaceAllManual ===");
        System.out.println("TEST replaceAllManual(\"banana\", \"a\", \"o\"): expected=bonono, actual="
                + replaceAllManual("banana", "a", "o"));
    }
}
