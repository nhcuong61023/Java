package Quan_Ly_Sv_Ket_Noi_Database_MySQL;
import java.util.Scanner;

public class Student {
    public Scanner scanner = new Scanner(System.in);
    private String id;
    private String name;
    private int age;
    private String email;
    private double gpa;
    
    public Student(String id, String name, int age, String email,double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.gpa = gpa;
    } 
    public Student() {
    }
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;

    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void nhap_du_lieu(){
        System.out.print("Nhập ID: ");
        setId(scanner.nextLine());
        System.out.print("Nhập Tên: ");
        setName(scanner.nextLine());
        do {
            System.out.print("Nhập Tuổi(từ 0 đến 100): ");
            age = scanner.nextInt();
        } while (age < 0 || age > 100); // Điều kiện
        System.out.print("Nhập Email: ");
        setEmail(scanner.next());
        do {
            System.out.print("Nhập Điểm Gpa (từ 0 đến 4.0): ");
            gpa = scanner.nextDouble();
        } while (gpa < 0 || gpa > 4.0); // Điều kiện
        System.out.println("--------------Đã nhập thành công--------------\n");
    }
    public void sua_lai_du_lieu(){
        System.out.print("Nhập Lại Tên: ");
        setName(scanner.next());
        do {
            System.out.print("Nhập Lại Tuổi (từ 0 đến 100): ");
            age = scanner.nextInt();
        } while (age < 0 || age > 100); // Điều kiện
        System.out.print("Nhập Email: ");
        setEmail(scanner.next());
        do {
            System.out.print("Nhập Lại Điểm Gpa (từ 0 đến 4.0): ");
            gpa = scanner.nextDouble();
        } while (gpa < 0 || gpa > 4.0); // Điều kiện
    }

}
