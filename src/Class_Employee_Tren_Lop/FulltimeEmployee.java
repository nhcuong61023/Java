package Class_Employee_Tren_Lop;

public class FulltimeEmployee extends Employee {

    public FulltimeEmployee(String name, int paymentPerhour) {
        super(name, paymentPerhour);
    }

    @Override
    public int calculateSalary() {
        // TODO Auto-generated method stub
        return 8 * paymentPerhour;
    }
    
}
