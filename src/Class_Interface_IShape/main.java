package Class_Interface_IShape;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class main {
    public static void main(String[] args) {
        IShape hinh_1 = new Rectangle(10, 20);
        IShape hinh_2 = new Circle(10.5);
        IShape hinh_3 = new Rectangle(19, 25);
        IShape hinh_4 = new Circle(6.9);

        IShape list [] = {hinh_1,hinh_2,hinh_3,hinh_4};
        /* for (IShape  gia_tri: list) {
            System.out.println("Dien tich la: " + gia_tri.getArea());
            System.out.println("Chu vi la: " + gia_tri.getPerimeter());
            System.out.println();
        } */
        for (int index = 0; index < list.length; index++) {
            System.out.println("Dien tich hinh "+(index +1)+" la: " +  list[index].getArea());
            System.out.println("Chu vi hinh "+(index +1) +" la: " + list[index].getPerimeter());
            System.out.println();
        }
        

    }
}
