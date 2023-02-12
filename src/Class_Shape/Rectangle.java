package Class_Shape;

public class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return this.length * this.width;
    }
}
