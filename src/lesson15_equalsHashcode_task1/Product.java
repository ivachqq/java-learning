package lesson15_equalsHashcode_task1;

import java.util.Objects;

public class Product {
    private int id;
    private String name;
    public Product(int id, String name) {
        this.id=id;
        this.name=name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && name.equals(product.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
