package tinhdonggoi;

public class Student {

    //Tạo biến private
    private String name;

    //khai báo phương thức set và get
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; //truyền tham số từ bên ngoài trùng với tên biến
    }
}
