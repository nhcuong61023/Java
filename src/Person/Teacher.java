package Person;

public class Teacher extends person{
    private int salary;

    public Teacher(String name, int age, String address, int salary) {
        super(name, age, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void dislay(){
        super.display();
        System.out.println("Salary: "+salary);
    }
}
