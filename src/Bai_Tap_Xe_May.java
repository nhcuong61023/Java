class Xe_May {
    String hang;
    String model;
    Float gia;
    String dung_Tich;
    String chu_Xe;
    Integer so_Km_da_chay;
    public Xe_May(){}
    public Xe_May(String hang, String model, Float gia, String dung_Tich, String chu_Xe, Integer so_Km_da_chay) {
        this.hang = hang;
        this.model = model;
        this.gia = gia;
        this.dung_Tich = dung_Tich;
        this.chu_Xe = chu_Xe;
        this.so_Km_da_chay = so_Km_da_chay;
    }   
    public void danh_gia() {
        if (this.so_Km_da_chay > 20000) {
            System.out.println("Xe cũ");
        } else if (this.so_Km_da_chay < 300) {
            System.out.println("Xe rất mới");
        }else
        {
            System.out.println("Xe còn khá mới");
        }
    }
    public void thong_tin() {
        System.out.println("Chủ xe là: " + this.chu_Xe);
        System.out.println("Hãng xe là: " + this.hang);
        System.out.println("Model: " + this.model);
        System.out.println("Giá: " + this.gia);
        System.out.println("Dung tích của xe: " + this.dung_Tich);
    } 
}
public class Bai_Tap_Xe_May{
    public static void main(String[] args) {
        Xe_May xe1 = new Xe_May("HonDa", "54RTX", 120000.0f, "120cc", "Cuong", 500);
        xe1.thong_tin();
        xe1.danh_gia();
    }
}
