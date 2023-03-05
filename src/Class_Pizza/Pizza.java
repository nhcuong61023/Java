package Class_Pizza;

public class Pizza {
    private Double _price;
    private IShape _shape;

    public Pizza(Double _price, IShape _shape) {
        this._price = _price;
        this._shape = _shape;
    }

    public Double get_price() {
        return _price;
    }

    public IShape get_shape() {
        return _shape;
    }

    @Override
    public String toString() {
        return "Pizza [_price=" + _price + ", _shape=" + _shape + "]";
        // return null;
    }

}