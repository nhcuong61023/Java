package Quan_Ly_Sv_Ket_Noi_Database_MySQL;

import java.util.Scanner;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

public class StudentManager {
    public static Scanner scanner = new Scanner(System.in);
    private Connection conn;
    public StudentManager(String url, String username, String password) throws SQLException {
        conn = DriverManager.getConnection(url, username, password);
    }

    public void addStudent(Student student) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("INSERT INTO thong_tin_sv (id, name, age, email, gpa) VALUES (?, ?, ?, ?, ?)");
        ps.setString(1, student.getId());
        ps.setString(2, student.getName());
        ps.setInt(3, student.getAge());
        ps.setString(4, student.getEmail());
        ps.setDouble(5, student.getGpa());
        ps.executeUpdate();
    }
    public void updateStudent_all_by_id(String id) throws SQLException {
        Student student = new Student();
        PreparedStatement ps = conn.prepareStatement("UPDATE thong_tin_sv SET name=?, age=?, email=?, gpa =? WHERE id=?");
        student.sua_lai_du_lieu();
        ps.setString(1, student.getName());
        ps.setInt(2, student.getAge());
        ps.setString(3, student.getEmail());
        ps.setDouble(4, student.getGpa());
        ps.setString(5, id);
        ps.executeUpdate();
    }
    public void updateStudent_name_by_id(String id) throws SQLException {
        Student student = new Student();
        PreparedStatement ps = conn.prepareStatement("UPDATE thong_tin_sv SET name=? WHERE id=?");
        System.out.print("Nhập lai Tên: ");
        student.setName(scanner.next());
        ps.setString(1, student.getName());
        ps.setString(2, id);
        ps.executeUpdate();
    }

    public void updateStudent_age_by_id(String id) throws SQLException {
        Student student = new Student();
        PreparedStatement ps = conn.prepareStatement("UPDATE thong_tin_sv SET age=? WHERE id=?");
        do {
            System.out.print("Nhập lại tuổi (từ 0 đến 100): ");
            student.setAge(scanner.nextInt());
        } while (student.getAge() < 0 || student.getAge()  > 100);
        ps.setInt(1, student.getAge());
        ps.setString(2, id);
        ps.executeUpdate();
    }

    public void updateStudent_Email_by_id(String id) throws SQLException {
        Student student = new Student();
        PreparedStatement ps = conn.prepareStatement("UPDATE thong_tin_sv SET email=? WHERE id=?");
        System.out.print("Nhập lại Email: ");
        student.setEmail(scanner.next());
        ps.setString(1, student.getEmail());
        ps.setString(2, id);
        ps.executeUpdate();
    }

    public void updateStudent_GPA_by_id(String id) throws SQLException {
        Student student = new Student();
        PreparedStatement ps = conn.prepareStatement("UPDATE thong_tin_sv SET gpa=? WHERE id=?");
        do {
            System.out.print("Nhập lại Điểm Gpa (từ 0 đến 4.0): ");
            student.setGpa(scanner.nextDouble());
        } while (student.getGpa() < 0 || student.getGpa() > 4.0);
        ps.setDouble(1, student.getGpa());
        ps.setString(2, id);
        ps.executeUpdate();
    }

    public void deleteStudent(String id) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("DELETE FROM thong_tin_sv WHERE id=?");
        ps.setString(1, id);
        ps.executeUpdate();
    }

    public List<Student> getAllStudents() throws SQLException {
        List<Student> students = new ArrayList<>();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM thong_tin_sv");
        while (rs.next()) {
            Student student = new Student(rs.getString("id"), rs.getString("name"), rs.getInt("age"),
                    rs.getString("email"), rs.getDouble("gpa"));
            students.add(student);
        }
        return students;
    }
    
}
