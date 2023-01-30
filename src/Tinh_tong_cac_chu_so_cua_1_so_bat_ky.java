import java.util.Scanner;

public class Tinh_tong_cac_chu_so_cua_1_so_bat_ky {
    private static Scanner scanner = new Scanner(System.in);
    public static int DEC_10 = 10;

    public static void main(String[] args) {
        System.out.print("Nhap so nguyen duong n = ");
        int n = scanner.nextInt();
        System.out.printf("Tong cua cac chu so "
                + "cua %d la: %d\n123", n, totalDigitsOfNumber(n));
    }

    public static int totalDigitsOfNumber(int n) {
        int total = 0;
        do {
            total = total + n % DEC_10;
            n = n / DEC_10;
        } while (n > 0);
        return total;
    }
}
