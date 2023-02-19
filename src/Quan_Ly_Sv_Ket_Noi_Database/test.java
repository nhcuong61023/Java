package Quan_Ly_Sv_Ket_Noi_Database;

import java.util.Scanner;
import java.util.List;
import java.io.IOException;
import java.sql.SQLException;

public class test {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        boolean isExisted = false;
        String url = "jdbc:mysql://localhost:3306/db_quan_ly_sinh_vien";
        String username = "root";
        String password = "";
        try {
            StudentManager studentManager = new StudentManager(url, username, password);
            showMenu();
            while (true) {
                choose = scanner.nextLine();
                switch (choose) {
                    case "1":
                        Student student1 = new Student();
                        student1.nhap_du_lieu();
                        studentManager.addStudent(student1);
                        break;
                    case "2":
                        System.out.print("Nhập ID cần sửa: ");
                        String id = scanner.next();
                        List<Student> studentList = studentManager.getAllStudents();
                        int size = studentList.size();
                        isExisted = false;
                        for (int i = 0; i < size; i++) {
                            if (studentList.get(i).getId().equals(id)) {
                                isExisted = true;
                                studentManager.updateStudent(studentList.get(i));
                                break;
                            }
                        }
                        if (!isExisted) {
                            System.out.printf("id = %s not existed.\n", id);
                        }
                        break;

                    case "3":
                        System.out.print("Nhập ID cần xoá: ");
                        String x = scanner.next();
                        studentManager.deleteStudent(x);
                        break;

                    case "4":
                        String a1 = "ID";
                        String a2 = "Name";
                        String a3 = "Age";
                        String a4 = "Email";
                        String a5 = "GPA";
                        List<Student> students1 = studentManager.getAllStudents();
                        System.out.format("%-10s | %-20s | %-5s | %-25s | %-10s\n", a1, a2, a3, a4, a5);
                        for (Student student : students1) {
                            
                            System.out.format("%-10s | ", student.getId());
                            System.out.format("%-20s | ", student.getName());
                            System.out.format("%-5d | ", student.getAge());
                            System.out.format("%-25s | ", student.getEmail());
                            System.out.format("%-10.1f%n", student.getGpa());

                        }
                        try {
                            System.in.read();
                            
                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        break;
                    case "0":
                        System.out.println("exited!");
                        exit = true;
                        break;
                    default:
                        System.out.println("invalid! please choose action in below menu:");
                        showMenu();
                        break;
                }
                if (exit) {
                    break;
                }

            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void showMenu() {
        System.out.println("            -----------------MENU-----------------");
        System.out.println("            |   1. Add student.                  |");
        System.out.println("            |   2. Edit student by id.           |");
        System.out.println("            |   3. Delete student by id.         |");
        System.out.println("            |   4. Show student.                 |");
        System.out.println("            |   0. exit.                         |");
        System.out.println("            |____________________________________|");
        System.out.print("              Please choose: ");
    }
}
