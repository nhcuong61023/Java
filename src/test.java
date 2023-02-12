class demo{
    int balance = 0;
    int id;
    String name;
    public demo(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void deposit(int amount){
        System.out.println("So Tiền Được gửi vào là: "+ amount);
    }
    public void withdraw(int amount) {
        System.out.println("Số tiền rút là: " + amount);
    }
    public void display(){
        System.out.println("Số tiền sau khi thực hiện giao dịch là: " );
    }
}
public class test {
    demo acc1 = new demo(12312, "Cuong_Pro");
	
}
