package Class_Employee_Tren_Lop;

public class ParttimeEmployee extends Employee {
    int workingHours;
    
    public ParttimeEmployee(String name, int paymentPerhour, int workingHours) {
        super(name, paymentPerhour);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        // TODO Auto-generated method stub
        return workingHours * paymentPerhour;
    }
    
    
}
