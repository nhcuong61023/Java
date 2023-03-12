package Class_Abstract_Shape;

public class Main {
    public static void main(String[] args) {
        Shape h1 = new Square("Red", true, 12);

        Shape h2 = new Circle(11, "Yellow", true);

        Shape h3 = new Rectangle();
        Rectangle r3 = ((Rectangle) h3);
        r3.setLength(15);
        r3.setWidth(8);
        r3.setColor("Pink");
        r3.setFilled(true);

        Shape hinh_dang[] = { h1, h2, h3 };
        for (Shape shape : hinh_dang) {
            System.out.println(shape.toString() + "\n");
        }
    }
}
