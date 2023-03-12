package Class_Abstract_Shape;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return super.length;
    }

    public void setSide(double Side) {
        super.length = Side;
        super.width = Side;
    }

    public void setWidth(double Side) {
        super.width = Side;
        super.length = Side;
    }

    public void setLength(double Side) {
        super.width = Side;
        super.length = Side;
    }

    @Override
    public String toString() {
        return "Square [Side = " + super.length + ", Area = " + super.getArea() + ", Perimeter = "
                + super.getPerimeter() + ", Color = " + super.getColor()
                + ", Filled = " + super.isFilled()
                + "]";
    }

    /*
     * public static void main(String[] args) {
     * Square demo1 = new Square();
     * // demo1.setLength(12);
     * // demo1.setLength(23);
     * demo1.setWidth(54);
     * System.out.println(demo1.getSide()); // ! Thử lấy ra chiều dài của hình vuông
     * }
     */

}
