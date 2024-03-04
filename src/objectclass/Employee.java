package objectclass;

public class Employee {
    //Thanh phan cua lop
    String name = "Mai";
    int age = 22;
    String address = "Nam Dinh";

    //Khoi lenh dang block thuc thi truoc ham main
    //Chay dau tien trong class nay
    static {
        System.out.println("Load config");
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        //Khai bao Class va Object
        Employee employee1 = new Employee();
        System.out.println(employee1.getName());

        Employee employee2 = new Employee();
        System.out.println(employee2.age);

    }
}

