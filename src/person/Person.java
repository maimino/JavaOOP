package person;

public class Person {
   private String name;
   private int age;
   private String gender;
   private String address;
   private String phone;

   //Ham xay dung
    public Person(){
        name = "Nhung";
        age = 22;
        gender = "Nu";
        address = "Nghia Phu";
        phone = "0974665313";
    }

   //Lay thong tin
    public String getName(){
        return name;
    }

   public int getAge(){
        return age;
   }

   public String getGender(){
        return gender;
   }

   public String getAddress(){
        return address;
   }

   public String getPhone(){
        return phone;
   }
}
