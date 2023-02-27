package Class_Employee_Tren_Lop;

import Class_Employee_Ket_Noi_Database.Employee;
import Class_Interface_IShape.main;

public class Test {
    
    public static void main(String[] args) {
        IEmployee nv1 = new ParttimeEmployee("Cuong", 10000000, 5);
        IEmployee nv2 = new ParttimeEmployee("Phuong", 3800, 5);
        IEmployee nv3 = new FulltimeEmployee("Van", 95000);
        IEmployee nv4 = new FulltimeEmployee("Thuong", 10000);
        IEmployee list [] = {nv1, nv2, nv3, nv4};
        for (IEmployee iEmployee : list) {
            System.out.println("-Ten nhan vien: " + iEmployee.getName());
            System.out.println("-Luong moi ngay: " + iEmployee.calculateSalary() + "\n");        
        }
    }
}
