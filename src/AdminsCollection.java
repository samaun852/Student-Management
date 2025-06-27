import java.util.LinkedList;

public class AdminsCollection {
    LinkedList<Admins> a_list=new LinkedList<Admins>();

    public  AdminsCollection(Admins a){ //aa==dear,sagar
        a_list.add(a);
    }
    public  boolean check_login(String name,String password){
        boolean flag=false;
        for (Admins l:a_list){
            if (l.name.equals(name) && l.password.equals(password)){
                flag=true;
            }else
            {
                flag=false;
            }
        }
        return flag;
    }
}
