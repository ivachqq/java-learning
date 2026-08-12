package lesson15_equalsHashcode_task2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Session, String> map = new HashMap<>();
        Session s = new Session("abc");
        map.put(s,"user-1");
        System.out.println(map.get(s));
        s.setToken("xyz");
        System.out.println(map.get(s));
        System.out.println(map.get(new Session("abc")));
        System.out.println(map.get(new Session("xyz")));
        System.out.println(map.containsKey(s));
        for (Map.Entry<Session, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
