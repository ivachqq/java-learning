package lesson09_OOPInheritancePolymorphism_task1;

public class Triangle extends Shape{
    private final double a;
    private final double b;
    private final double c;
    private boolean isValid=true;
    public Triangle(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
        if (a+b<=c || a+c<=b || b+c<=a) isValid=false;
    }



    @Override
    public double area() {
        if (!isValid) return -1;
        return Math.sqrt(perimeter()/2*(perimeter()/2-a)*(perimeter()/2-b)*(perimeter()/2-c));
    }

    @Override
    public double perimeter() {
        if (!isValid) return -1;
        return a+b+c;
    }

    @Override
    public String getName() {
        if (!isValid) return "Невалидный треугольник";
        return "Треугольник";
    }
}
