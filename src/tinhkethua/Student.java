package tinhkethua;

public class Student extends Person{
    public Student(String name, int age, float height) {

        //từ khóa super để cho lớp con truy cập những thứ liên quan đến lớp cha
        super(name, age, height); //tu khoa super bat buoc phai xay ra khi dung extends
    }
//    public void LayThongTin(){
//        getInfo();
//    }

    public static void main(String[] args) {
        Student s1 = new Student("Luong", 22, 100);
        s1.getInfo();
    }
}
