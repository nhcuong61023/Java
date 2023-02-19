package Quan_Ly_Sv_Ket_Noi_Database;

import java.util.Scanner;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

public class StudentManager {
    private Connection conn;
    public static Scanner scanner = new Scanner(System.in);

    public StudentManager(String url, String username, String password) throws SQLException {
        conn = DriverManager.getConnection(url, username, password);
    }

    public void addStudent(Student student) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("INSERT INTO thong_tin_sv (id,name, age, email,gpa) VALUES (?, ?, ?, ?, ?)");
        ps.setString(1, student.getId());
        ps.setString(2, student.getName());
        ps.setInt(3, student.getAge());
        ps.setString(4, student.getEmail());
        ps.setDouble(5, student.getGpa());
        ps.executeUpdate();
    }

    public void updateStudent(Student student) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("UPDATE thong_tin_sv SET name=?, age=?, email=?, gpa =? WHERE id=?");
        student.sua_lai_du_lieu();
        ps.setString(1, student.getName());
        ps.setInt(2, student.getAge());
        ps.setString(3, student.getEmail());
        ps.setDouble(4, student.getGpa());
        ps.setString(5, student.getId());
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
