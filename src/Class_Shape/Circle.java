package Class_Shape;

public class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}