package lesson09_OOPInheritancePolymorphism_task1;

public class ShapeRegistry {
    private final Shape[] shapes=new Shape[300];
    private int counter = 0;
    public void add(Shape shape) {
        if (shape == null) {
            System.out.println("Ты пытаешься передать null элемент, так нельзя!");
            return;
        }
        if (counter < 300) {
            shapes[counter] = shape;
            counter++;
        }
        else System.out.println("Массив фигур переполнен, невозможно добавить новую фигуру");
    }

    public double totalArea() {
        double total = 0;
        for (int i = 0; i<counter;i++) {
            total+=shapes[i].area();
        }
        return total;
    }

    public Shape largestShape() {
        if (counter==0) return null;
        int index = 0;
        double max = 0;
        int itog=0;
        for (int i = 0; i<counter;i++) {
            if (shapes[i].area() > max) {
                max=shapes[i].area();
                itog=index;
            }
            index++;
        }
        return shapes[itog];
    }

    public void printAll() {
        for (int i = 0; i<counter;i++) {
            System.out.println("Фигура: " + shapes[i].getName() + "; Площадь: " + shapes[i].area() + "; Периметр: " + shapes[i].perimeter());
        }
    }
}
