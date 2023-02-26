/* Phần mềm quản lý sinh viên, chạy trên console, hiện tại gồm 4 chức năng cơ bản CRUD ( CREAT, READ, UPDATE, DELETE)
 * Dùng ngôn ngữ MySQL ( phần mềm Xamp ) để kết nối với csdl
 * Còn thiếu chức năng tìm kiếm, với chức năng sắp xếp nữa ヾ(⌐■_■)ノ♪
 */
package Quan_Ly_Sv_Ket_Noi_Database_MySQL;

import java.util.Scanner;
import java.util.List;
import java.sql.SQLException;

public class test {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int lua_chon;
        boolean exit = false; // Biến này dùng để thoát hàm switch ở dưới. Nếu nó True thì thoát khỏi hàm
                              // Switch
        boolean isExisted = false; // Biến này dùng để kiếm tra xem Id sinh viên có tồn tại ko. Mặc định đang là
                                   // FALSE
        // Kết nối vs database
        String url = "jdbc:mysql://localhost:3306/db_quan_ly_sinh_vien";
        String username = "root";
        String password = "";
        try {
            StudentManager studentManager = new StudentManager(url, username, password);
            showMenu();

            while (true) {
                lua_chon = scanner.nextInt();
                if (lua_chon == 1) {
                    Student student1 = new Student();
                    student1.nhap_du_lieu();
                    studentManager.addStudent(student1);
                    // Khi nhập xong thì gọi lại hàm để hiện lại menu
                    showMenu();
                }
                else if (lua_chon == 2) {
                    System.out.print("Nhập ID cần sửa: ");
                    String id = scanner.next();
                    /*
                     * Hàm getAllStudents sẽ trả về một danh sách gồm các dòng id, name, age, email,
                     * gpa tương ứng vs csdl
                     * Tạo một biến studentList1 kiểu list để chứa danh sách đó
                     */
                    List<Student> studentList1 = studentManager.getAllStudents();
                    int size1 = studentList1.size();
                    isExisted = false;
                    /*
                     * Dùng hàm for để quét tất cả csdl
                     * Kiểm tra xem tất cả id trong csdl có cái nào trùng với id người dùng nhập
                     * không
                     * Nếu không thì break thoát khỏi vòng lặp for và thông báo ra màn hình là id đó
                     * không tồn tại
                     */
                    for (int i = 0; i < size1; i++) {
                        if (studentList1.get(i).getId().equals(id)) {
                            isExisted = true;
                            while (true) {
                                showMenu_case_2();
                                int id_case_2 = scanner.nextInt();
                                if (id_case_2 == 1) {
                                    // Cập nhật lại tên
                                    studentManager.updateStudent_name_by_id(id);
                                    System.out.println("--------------Cập nhật thành công--------------\n");
                                } else if (id_case_2 == 2) {
                                    // Cập nhật lại tuổi
                                    studentManager.updateStudent_age_by_id(id);
                                    System.out.println("--------------Cập nhật thành công--------------\n");
                                } else if (id_case_2 == 3) {
                                    // Cập nhật lại Email
                                    studentManager.updateStudent_Email_by_id(id);
                                    System.out.println("--------------Cập nhật thành công--------------\n");
                                } else if (id_case_2 == 4) {
                                    // Cập nhật lại điểm GPA
                                    studentManager.updateStudent_GPA_by_id(id);
                                    System.out.println("--------------Cập nhật thành công--------------\n");
                                } else if (id_case_2 == 5) {
                                    // Cập nhật lại tất cả thông tin của sinh viên
                                    studentManager.updateStudent_all_by_id(id);
                                    System.out.println("--------------Cập nhật thành công--------------\n");
                                } else if (id_case_2 == 0) {
                                    System.out.println(
                                            "--------------Đã thoát khỏi trình chỉnh sửa thông tin--------------\n");
                                    break;
                                } else {
                                    // Nếu những lựa chọn của người dùng không trùng khớp với những câu lệnh If trên
                                    // thì hiện lại menu.
                                    showMenu_case_2();
                                }
                            }
                        }
                    }
                    if (!isExisted) {
                        System.out.printf("id = %s không tồn tại.\n", id);
                    }
                    showMenu();
                }
                else if (lua_chon == 3) {
                    System.out.print("Nhập ID cần xoá: ");
                    String id_delete = scanner.next();
                    List<Student> studentList2 = studentManager.getAllStudents();
                    int size2 = studentList2.size();
                    isExisted = false;
                    for (int i = 0; i < size2; i++) {
                        if (studentList2.get(i).getId().equals(id_delete)) {
                            isExisted = true;
                            studentManager.deleteStudent(id_delete);
                            System.out.println("--------------Xoá thành công--------------\n");
                        }
                    }
                    if (!isExisted) {
                        System.out.printf("id = %s không tồn tại.\n", id_delete);
                    }
                    showMenu();
                }
                else if (lua_chon == 4) {
                    String a1 = "ID";
                    String a2 = "Name";
                    String a3 = "Age";
                    String a4 = "Email";
                    String a5 = "GPA";
                    // Đưa các thông tin của csdl vào 1 biến kiểu dữ liệu List. Để duyệt từng phẩn
                    // tử và in ran màn hình
                    List<Student> students1 = studentManager.getAllStudents();
                    /*
                     * %-10s:
                     * - Vì đây dùng System.out.format nên dùng % giống như c, c++...
                     * - 10 ở đây là khoảng cách = 10 lần '_' (10 lần phím cách)
                     * - dấu "-" dùng dùng để căn trái, không dùng gì thì căn phải, còn căn giữa thì
                     * chịu U_U
                     * - s: là định dạng của String, d: interger, f: float || double
                     */
                    System.out.format("%-10s | %-25s | %-5s | %-35s | %-10s\n", a1, a2, a3, a4, a5);
                    for (Student student : students1) {

                        System.out.format("%-10s | ", student.getId());
                        System.out.format("%-25s | ", student.getName());
                        System.out.format("%-5d | ", student.getAge());
                        System.out.format("%-35s | ", student.getEmail());
                        System.out.format("%-10.1f%n", student.getGpa());
                    }
                    System.out.println();
                    showMenu();
                }
                else if (lua_chon == 0){
                    System.out.println("Good Bye ლ(╹◡╹ლ)!");
                    exit = true;
                }
                else {
                    System.out.println("Hãy chọn những chức năng ở bảng dưới: ");
                    showMenu();
                }
                if (exit) {
                    break;
                }
            }
        } catch (SQLException e) {
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

    public static void showMenu_case_2() {
        System.out.println("            --------------Menu Edit---------------");
        System.out.println("            |   1. Edit Name.                    |");
        System.out.println("            |   2. Edit Age.                     |");
        System.out.println("            |   3. Edit Email.                   |");
        System.out.println("            |   4. Edit Gpa.                     |");
        System.out.println("            |   5. Edit All                      |");
        System.out.println("            |   0. Close Edit Menu               |");
        System.out.println("            |____________________________________|");
        System.out.print("              Please choose: ");
    }

}
