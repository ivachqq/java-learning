package lesson09_OOPInheritancePolymorphism_task1;

public class Rectangle extends Shape{
    private final double width;
    private final double height;
    private boolean isValid=true;
    public Rectangle(double width, double height) {
        this.width=width;
        this.height=height;
        if (height<=0 || width<= 0) isValid=false;
    }

    @Override
    public double area() {
        if (!isValid) return -1;
        return width*height;
    }

    @Override
    public double perimeter() {
        if (!isValid) return -1;
        return width*2+height*2;
    }

    @Override
    public String getName() {
        if (!isValid) return "Невалидный прямоугольник";
        return "Прямоугольник";
    }
}
