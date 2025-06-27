public class Student {
    String Name,Address,Phn_no;
    int age;
    public Student(String name,String address,String ph,int age){
        this.Name=name;;
        this.Address=address;
        this.Phn_no=ph;
        this.age=age;
    }
    public String getName(){

        return Name;
    }
public String setName(String Name){
        this.Name=Name;
        return "Updated Name: "+Name;
}
    public String getAddress(){

        return Address;
    }
    public String setAddress(String address){
        this.Address=address;
        return "Updated Adress: "+address;
    }

    public String getPhn_no(){

        return Phn_no;
    }
    public String setPhone(String Phn_no){
        this.Phn_no=Phn_no;
        return "Updated Phone No.: "+Phn_no;
    }

    public int getAge(){

        return age;
    }
    public int setAge(int age){
          this.age=age;
          return age;
    }

}
