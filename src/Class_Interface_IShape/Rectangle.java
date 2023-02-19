package Class_Interface_IShape;

public class Rectangle implements IShape{
    double lenght;
    double width;
    
    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return lenght * width;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 2 * (lenght + width);
    }
    
    
}
