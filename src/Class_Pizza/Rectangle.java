package Class_Pizza;

public class Rectangle implements IShape {
    private Double length;
    private Double width;

    public Rectangle(Double length, Double width) {
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    public Double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }

}
