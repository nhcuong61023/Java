package Class_Pizza;

public class PizzaClient {
    public void run() {
        Pizza p1 = new Pizza(10.0, new Circle(10.0));
        System.out.println(p1.toString() + "\n"); // ? Lấy ra thông tin của Pizza
        Pizza p2 = new Pizza(20.0, new Rectangle(5.0, 6.0));
        System.out.println(p2.toString() + "\n");
        PizzaDeal _deal = new PizzaDeal();
        if (_deal.betterDeal(p1, p2)) {
            System.out.println("Bánh Pizza " + p1.get_shape() + " đáng mua hơn bánh Pizza " + p2.get_shape());
        } else {
            System.out.println("Bánh Pizza " + p2.get_shape() + " đáng mua hơn bánh Pizza " + p1.get_shape());
        }
    }

    public static void main(String[] nu) {
        new PizzaClient().run();
    }

}