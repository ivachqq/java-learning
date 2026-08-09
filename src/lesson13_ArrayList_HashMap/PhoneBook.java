package lesson13_ArrayList_HashMap;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static HashMap<String, String> phones = new HashMap<>();
    public static void add(String name, String phone) throws IllegalArgumentException{
        if (name==null||name.trim().isEmpty()||phone==null||phone.trim().isEmpty()) throw new IllegalArgumentException();
        phones.put(name, phone);
    }
    public static String getPhone(String name) {
        return phones.get(name);
    }
    public static void removeContact(String name) {
        phones.remove(name);
    }
    public static void printAll() {
        for (String key : phones.keySet()) {
            System.out.println(key + ": " + phones.get(key));
        }
    }
}
