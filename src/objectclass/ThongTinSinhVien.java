package objectclass;

public class ThongTinSinhVien {
    public static void main(String[] args) {

        //Khai bao doi tuong class de truy xuat thong tin trong mot class
        SinhVien sv1 = new SinhVien(); //tuong ung voi ham xay dung khong co tham so

        //Goi thanh phan class thong qua doi tuong
        System.out.println(sv1.getName());
        System.out.println(sv1.getAge());
        System.out.println(sv1.getAddress());
        System.out.println(sv1.getClassName());

        //Khoi tao doi tuong cho class SinhVien nhung voi cau truc ham xay dung co tham so
        SinhVien sv2 = new SinhVien("Hoa", 22, "Thai Binh", "Ke toan");
        System.out.println("======================");
        System.out.println(sv2.getName());
        System.out.println(sv2.getAge());
        System.out.println(sv2.getAddress());
        System.out.println(sv2.getClassName());
    }
}
