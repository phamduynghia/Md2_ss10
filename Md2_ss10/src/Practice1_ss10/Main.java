package Practice1_ss10;

public class Main {
    public static void main(String[] args) {
//        khởi tạo đối tượng
        Triangle triangle = new Triangle(3,4,5);
//        tính chu vi
        System.out.println("chu vi của tam giác là : "+ triangle.tinhChuVi());
//        tính diện tích
        System.out.println("diện tích của tam giác là : "+triangle.tinhDienTich());
    }
}
