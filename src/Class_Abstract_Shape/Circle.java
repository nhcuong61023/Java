package Class_Abstract_Shape;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * 3.14;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * 3.14;
    }

    @Override
    public String toString() {
        return "Circle [Radius = " + radius + ", Area = " + getArea() + ", Perimeter = "
                + getPerimeter() + ", Color = " + super.getColor() + ", Filled = " + super.isFilled()
                + "]";
    }

}
