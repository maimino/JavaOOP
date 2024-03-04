package objectclass;

import java.util.ArrayList;

public class Company {
    public static void main(String[] args) {
        //Khoi tao doi tuong class SinhVien
        SinhVien sv1 = new SinhVien("Lan", 22, "Kinh Mon", "Developer");
        //sv1.printInfo();

        SinhVien sv2 = new SinhVien("Lien", 22, "Tu Son", "Backend");
        //sv2.printInfo();

        //Bai hom truoc
        /*
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add('Selenium');
        arrayList.add('Auto test');
        * */

        //Cach luu trong arraylist
        //kieu du lieu la SinhVien
        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
        listSinhVien.add(sv1); //Them bo data sv2 vao vi tri dau tien trong ArrayList
        listSinhVien.add(sv2);

        for (SinhVien sv : listSinhVien){
            System.out.println("=============");
            sv.printInfo();
        }
    }
}
