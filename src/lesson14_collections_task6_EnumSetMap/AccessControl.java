package lesson14_collections_task6_EnumSetMap;

import java.util.*;

public class AccessControl {
    private static EnumMap<Role, EnumSet<Permission>> accessRoles = new EnumMap<>(Role.class);
    public static void grant(Role role, EnumSet<Permission> perms) throws IllegalArgumentException{
        if (role == null || perms == null || perms.isEmpty()) throw new IllegalArgumentException("вы не передали аргумент");
        EnumSet<Permission> nowPerms = accessRoles.get(role);
        if (nowPerms == null) {
            nowPerms = EnumSet.noneOf(Permission.class);
            accessRoles.put(role, nowPerms);
        }
        nowPerms.addAll(perms);
    }
    public static boolean has(Role role, Permission perm) {
        if (role == null || perm==null) throw new IllegalArgumentException("вы не передали аргумент");
        return accessRoles.containsKey(role) && accessRoles.get(role).contains(perm);
    }
    public static Set<Permission> permissionsOf(Role role) {
        if (role==null) throw new IllegalArgumentException("Такой роли нет");
        if (accessRoles.get(role)==null||accessRoles.get(role).isEmpty()) return EnumSet.noneOf(Permission.class);
        return EnumSet.copyOf(accessRoles.get(role));
    }
    public static Set<Role> rolesWith(Permission perm) {
        EnumSet<Role> roles = EnumSet.noneOf(Role.class);
        for (Map.Entry<Role, EnumSet<Permission>> entry : accessRoles.entrySet()) {
            if (entry.getValue().contains(perm)) {
                roles.add(entry.getKey());
            }
        }
        return roles;
    }
}
