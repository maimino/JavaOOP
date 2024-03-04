package tinhkethua;

public class Empolyee extends Person{

    private String address;

    public Empolyee(String name, int age, float height, String address) {
        super(name, age, height);
        this.address = address;
    }

    //Ghi de phuong thuc tu class con doi voi class cha (Person)
    public void getInfo(){
        super.getInfo();
        System.out.println("Dia chi: " + address);
    }

    public static void main(String[] args) {
        Empolyee employee1 = new Empolyee("Nghi", 24, 120, "Quy Nhat");
        employee1.getInfo(); //in ra thieu dia chi address vi lop cha khong co address
        //Khi do class con se ghi de phuong thuc getInfo() cua class cha
        //System.out.println("Address: " + employee1.address);
    }
}
