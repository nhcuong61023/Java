package Class_Pizza_Tren_Lop;

public class PizzaDeal {
    public Double deal(Pizza p) {
        return p.get_price() / p.get_shape().getArea();
    }

    public boolean betterDeal(Pizza p1, Pizza p2) {

        return deal(p1) > deal(p2);
    }
}
