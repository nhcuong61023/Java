package Class_Pizza_Tren_Lop;
public class Circle implements IShape{
    private Double _radius;

    public Circle(Double _radius) {
        this._radius = _radius;
    }

    @Override
    public Double getArea() {
        return _radius * _radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle [_radius=" + _radius + "]";
    }
}   