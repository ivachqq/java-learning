package lesson17_Objects;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        Objects.requireNonNull(name, "name must not be null");
        this.name=name;
        this.age=age;
    }
    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (o==null || getClass()!=o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && age== person.age;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
