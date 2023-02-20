package Class_Employee_Partime_Fulltime;

public class Entry {
	public static void main(String[] args) {
		IEmployee employee1 = new PartTimeEmployee("Van", 5000000, 2);
		IEmployee employee2 = new PartTimeEmployee("Phuong", 35000000, 1);
		IEmployee employee3 = new FullTimeEmployee("Cuong", 90000000);

		IEmployee list[] = { employee1, employee2, employee3 };
		for (int i = 0; i < list.length; i++) {
			System.out.println("Thong tin nhan vien " + (i + 1) +": ");
			System.out.println("-Name: " + list[i].getName());
			System.out.println("-Salary per day: " + list[i].calculateSalary() + "\n");
		}
	}
}
