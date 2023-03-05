package Class_Pizza;

public class PizzaDeal {
    public Double deal(Pizza p) {
        return p.get_price() / p.get_shape().getArea();
        //? Lấy ra diện tích của Pizza thông qua hàm get_shape ( vì get_shape sẽ trả về kiểu hình cho p nên co thể gọi hàm getArea() từ đó)
    }
    public boolean betterDeal(Pizza p1, Pizza p2) {
        return deal(p1) > deal(p2);
    }

}