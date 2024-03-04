package objectclass;

public class SinhVien {
    private String name;
    private int age;
    private String address;
    private String className;

    //Ham xay dung - contructor khong co tham so
    public SinhVien(){
        name = "Mai";
        age = 22;
        address = "Nam Dinh";
        className = "Java OOP";
    }

    //Ham xay dung co tham so
    public SinhVien(String name, int age, String address, String className){
        this.name = name;
        this.age = age;
        this.address = address;
        this.className = className;
    }

    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(className);
    }

    //Cac ham truy xuat thong tin
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getAddress(){
        return address;
    }

    public String getClassName(){
        return className;
    }
}
