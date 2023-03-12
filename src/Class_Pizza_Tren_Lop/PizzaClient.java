package Class_Pizza_Tren_Lop;

public class PizzaClient {
    public void run(){
        Pizza p1 = new Pizza(123.0, new Circle(9.9));
        System.out.println(p1.toString() + "\n");
        Pizza p2 = new Pizza(123.0, new Rectangle(9.0, 10.5));
        System.out.println(p2.toString() + "\n");
        PizzaDeal _deal = new PizzaDeal();
        if (_deal.betterDeal(p1, p2)){
            System.out.println("Banh pizza "+p1.get_shape() + " dang mua hon banh Pizza " + p2.get_shape());
        }
        else{
            System.out.println("Banh pizza "+p1.get_shape() + " dang mua hon banh Pizza " + p2.get_shape());
        }
    }
    public static void main(String[] args) {
        PizzaClient p1 = new PizzaClient();
        p1.run();
    }
}
