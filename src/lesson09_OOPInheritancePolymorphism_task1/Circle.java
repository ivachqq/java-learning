package lesson09_OOPInheritancePolymorphism_task1;

public class Circle extends Shape{
    private final double radius;
    private boolean isValid=true;

    public Circle(double radius) {
        this.radius=radius;
        if (radius<=0) isValid=false;
    }

    @Override
    public double area() {
        if (!isValid) return -1;
        return Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        if (!isValid) return -1;

        return Math.PI*2*radius;
    }

    @Override
    public String getName() {
        if (!isValid) return "Невалидный круг";
        return "Круг";
    }
}
