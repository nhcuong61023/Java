package Class_Pizza_Tren_Lop;
public class Rectangle implements IShape{
    private Double _width;
    private Double _height;
    public Rectangle(Double _width, Double _height) {
        this._width = _width;
        this._height = _height;
    }
    @Override
    public Double getArea() {
        return _width * _height;
    }
    @Override
    public String toString() {
        return "Rectangle [_width=" + _width + ", _height=" + _height + "]";
    }
    
}