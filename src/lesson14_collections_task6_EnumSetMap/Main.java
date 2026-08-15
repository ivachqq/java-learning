package lesson14_collections_task6_EnumSetMap;

import java.util.EnumSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        AccessControl.grant(Role.MODERATOR, EnumSet.of(Permission.ADMIN, Permission.READ, Permission.WRITE, Permission.DELETE));
        Set<Permission> s = AccessControl.permissionsOf(Role.MODERATOR);
        s.clear();
        System.out.println(AccessControl.has(Role.MODERATOR, Permission.READ));
        System.out.println("Выводится false, ибо s является прямой ссылкой на сет из хэшмапы.");
        System.out.println("После того, как начали отдавать не саму коллекцию, а её копию, то получаем true. Ибо s теперь самостоятельный объект (копия), а не ссылка на оригинал");
        EnumSet<Permission> p = EnumSet.of(Permission.READ);
        AccessControl.grant(Role.USER, p);
        p.add(Permission.ADMIN);
        System.out.println(AccessControl.has(Role.USER, Permission.ADMIN));
        System.out.println("false, потому что в map лежит наш set, а addAll скопировал элементы из p. Снаружи меняем p — внутри уже другая коробка.");

    }
}
