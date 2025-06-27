import java.util.LinkedList;
import java.util.Scanner;

public class StudentCollection {
Scanner in=new Scanner(System.in);
       static  LinkedList<Student>s_list=new LinkedList<Student>();

   public void addinfo(Student s){
    s_list.add(s);

}


        public void DisplayInfo () {
        for (Student s : s_list) {
            try {
                System.out.println("\nName is: " + s.Name + "\nAddress: " +
                        s.Address + "\nPhone No.: " + s.Phn_no + "\nAge: " + s.age + "\n");
            }catch(Exception e){
                System.out.println("\nWrong input\n");

            }
            }

    }

        public void Search () {
        System.out.print("Enter Name which one you want to search: ");
        try {
            String sName = in.next();
            boolean isSearch = false;

            for (int i = 0; i < s_list.size(); i++) {
                if (sName.equals(s_list.get(i).Name)) {
                    System.out.println("*********************************");
                    System.out.println("\nName: " + s_list.get(i).getName());
                    System.out.println("Address: " + s_list.get(i).getAddress());
                    System.out.println("Phone No.: " + s_list.get(i).getPhn_no());
                    System.out.println("AGe: " + s_list.get(i).getAge());
                    System.out.println("*********************************");
                    isSearch = true;
                    System.out.println("\n");
                }

            }

            if (!isSearch) {
                System.out.println("Student inforamtion couldn't found,\n");
            }
        }catch(Exception e){
            System.out.println("\nWrong input\n");
        }

    }
        public void Delete () {
        System.out.print("Enter Name which you want to Delete: ");
        try {
            String sName = in.next();
            boolean isSearch = false;
            for (int i = 0; i < s_list.size(); i++) {
                if (sName.equals(s_list.get(i).Name)) {
                    s_list.remove(i);
                    System.out.println("Student information has deleted sucessfully\n");

                    isSearch = true;
                }
            }
            if (!isSearch) {
                System.out.println("Student inforamtion couldn't found\n");
            }
        }catch(Exception e){
            System.out.println("\nWrong input\n");
        }
    }

        public void update () {
        System.out.print("\nEnter Name which one you want to Update: ");
        try {
            String sName = in.next();
            boolean isSearch = false;

            for (int i = 0; i < s_list.size(); i++) {
                if (sName.equals(s_list.get(i).Name)) {
                    System.out.println("*********************************");
                    System.out.println("\n1.Name: " + s_list.get(i).getName());
                    System.out.println("2.Address: " + s_list.get(i).getAddress());
                    System.out.println("3.Phone No.: " + s_list.get(i).getPhn_no());
                    System.out.println("4.AGe: " + s_list.get(i).getAge());
                    System.out.println("\nChoose your option which you want to edit: ");
                    System.out.println("*********************************");
                    int ch = in.nextInt();
                    switch (ch) {
                        case 1:
                            System.out.println("Enter your Expected Name: ");
                            String sun = in.next();

                            s_list.get(i).setName(sun);

                            break;

                        case 2:
                            System.out.println("Enter your Expected Adress: ");
                            String sua = in.next();

                            s_list.get(i).setAddress(sua);
                            break;

                        case 3:
                            System.out.println("Enter your Expected Phone No.: ");
                            String sup = in.next();

                            s_list.get(i).setPhone(sup);
                            break;

                        case 4:
                            System.out.println("Enter your Expected Age: ");
                            int suA = in.nextInt();

                            System.out.println("Update Age: " + s_list.get(i).setAge(suA));
                            break;

                        default:
                            System.out.println("Wronng input");

                    }
                    System.out.println("Updated Succefully");
                    isSearch = true;
                }

            }
            if (!isSearch) {
                System.out.println("Student inforamtion couldn't found,");
            }

        }catch (Exception e){
            System.out.println("\nWrong input\n");

        }
    }


}
