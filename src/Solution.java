import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        int num = 0;
        Map<Character, Integer> map = Map.of(
                'M', 1000,
                'D', 500,
                'C',100,
                'L',50,
                'X',10,
                'V',5,
                'I',1
        );
        for (int i = 0; i<s.length();i++) {
            char ch = s.charAt(i);
            if (i==s.length()-1) {
                num+=map.get(ch);
                break;
            }
            char ch2 = s.charAt(i+1);
            if (map.get(ch)<map.get(ch2)) {
                num +=map.get(ch2)-map.get(ch);
                i+=1;
                continue;
            }
            num+=map.get(ch);
        }
        return num;
    }
}