package Class_Pizza;

public class Circle implements IShape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

}
