package Class_Employee_Tren_Lop;

public abstract class Employee implements IEmployee {
    String name;
    int paymentPerhour;
    public Employee(String name, int paymentPerhour) {
        this.name = name;
        this.paymentPerhour = paymentPerhour;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPaymentPerhour() {
        return paymentPerhour;
    }
    public void setPaymentPerhour(int paymentPerhour) {
        this.paymentPerhour = paymentPerhour;
    }
        
}
