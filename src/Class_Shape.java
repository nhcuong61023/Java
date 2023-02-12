class Shape{
    double area;
    public double getArea() {
        double ket_qua = 0;
        return ket_qua;
    }
}
class Rectangle extends Shape{
    double lenght;
    double width;
    public Rectangle(double lenght,double width ){
        this.lenght = lenght;
        this.width = width;
    }
    public double getArea(){
        return lenght * width;
    }
}
class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
public class Class_Shape{
    public static void main(String[] args) {
        Shape  hinh_cn_1  = new Rectangle(7,8);
        Shape hinh_tron_1 = new Circle(30);
        Shape hinh_cn_2 = new Rectangle(15, 25);
        Shape hinh_tron_2 = new Circle(24);
        Shape list [] = {hinh_cn_1, hinh_tron_1, hinh_cn_2, hinh_tron_2};
        // for (Shape s: list){
        //     System.out.println("Dien tich la: "+ s.getArea());
        // }
        for ( int i = 0; i<4; i++){
            System.out.println("Ket qua: " + list[i].getArea());
        }
    }
}
