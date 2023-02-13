package Class_Employee;

public class Entry {
    public static void main(String[] args) {
        Employee nv1 = new Employee("Thao", 600000);
        Manager gd1 = new Manager("Van", 900000, 100213120 );
        nv1.display();
        gd1.display();
    }
}
