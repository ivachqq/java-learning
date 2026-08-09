package lesson14_collections_task3_HashLinkedTreeMap;

import java.util.*;

public class VisitStats {
    private static LinkedHashMap<String, Integer> visits = new LinkedHashMap<>();
    public static void addVisit(String visitor) throws IllegalArgumentException{
        if (visitor==null || visitor.isBlank()) throw new IllegalArgumentException("Имя посетителя отсутствует");
        visits.put(visitor.trim().toLowerCase(), visits.getOrDefault(visitor.trim().toLowerCase(), 0)+1);
    }
    public static int uniqueUsers() {
        return visits.size();
    }
    public static int visitsOf(String user) {
        if (visits.containsKey(user)) {
            return visits.get(user.trim().toLowerCase());
        }
        throw new IllegalArgumentException("Такого пользователя не существует!");
    }
    public static List<String> firstSeenOrder() {
        return new ArrayList<>(visits.keySet());
    }
    public static List<String> usersAlphabetically() {
        TreeMap<String,Integer> sortedVisits = new TreeMap<>(visits);
        return new ArrayList<>(sortedVisits.keySet());
    }
}
