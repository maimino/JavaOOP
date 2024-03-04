package phamvitruycap;

public class Student {
    private String name = "Nguyet";
    private int age = 23;

    //Pham vi truy cao private
    private void getInfoPrivate(){
        System.out.println(name);
        System.out.println(age);
    }

    //Pham vi truy cap protected
    protected void getInfoProtected(){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getInfoPrivate();
    }
}
