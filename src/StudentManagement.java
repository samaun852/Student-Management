import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {

      StudentCollection coll=new StudentCollection();


        Admins dear=new Admins("1","1");
        AdminsCollection ac_dear=new AdminsCollection(dear);

        // Implement login funtion
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = s.next();

            System.out.println("Enter your password: ");
            String pass = s.next();
            boolean result = ac_dear.check_login(name, pass);
            if (result) {
                do {
                    System.out.println("*********************************");

                    System.out.println("*Students Management");
                    System.out.println("1.Add Students Information");
                    System.out.println("2.Display Students Information");
                    System.out.println("3.Search Students Information");
                    System.out.println("4.Delete Students Information");
                    System.out.println("5.Update Students Information");
                    System.out.println("6.Exit");
                    System.out.println("*********************************");

                    System.out.print("\n\nEnter your choice: \n");
                    int choice = s.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter student Name:");
                            String sn = s.next();
                            System.out.println("Enter student Address:");
                            String sa = s.next();
                            System.out.println("Enter student Phone:");
                            String sp = s.next();
                            System.out.println("Enter student Age:");
                            int sAge = s.nextInt();
                            Student st = new Student(sn, sa, sp, sAge);
                            coll.addinfo(st);
                            System.out.println("\nInformation Added Sucessfully\n");
                            break;

                        case 2:
                            coll.DisplayInfo();
                            break;

                        case 3:
                            coll.Search();
                            break;
                        case 4:
                            coll.Delete();
                            break;

                        case 5:
                            coll.update();
                            break;

                        case 6:
                            System.exit(0);
                            break;

                        default: {
                            System.out.println("Choice between 1-6");
                        }
                        break;
                    }
                } while (true);


            } else {
                System.out.println("Login failed. Try agin");
            }
        }catch(Exception e){
            System.out.println("\nWrong input,Please try again\n");

        }
    }
}
