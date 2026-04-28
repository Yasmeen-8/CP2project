package Main;
import java.util.*;


public class UserManage {
    public static int navigation = 0;
    static Scanner scan = new Scanner(System.in);
    static Users person;
    
    public static void alterMenu(){
    do{
    System.out.println(" --- Alter User Menu ---");
    System.out.println("1: edit name");
    System.out.println("2: edit phone");
    System.out.println("3: edit email");
    System.out.println("4: edit Activity");
    System.out.println("5: <-- return");
    
    navigation = scan.nextInt();
    }while(navigation <= 0 || navigation >= 6);
    checknum();
    }
    
     public static  void checknum(){
        int id = 0;
        int phone = 0;
        String email = " ";
        boolean Activity;
        switch(navigation){
            case 1 -> {
                System.out.println("--- Edit name ---");
                System.out.println("");
                System.out.println("enter new name: ");
                String newname = scan.next();
                person.setName(newname);

            }
            case 2 -> {
                System.out.println("--- Edit phone ---");
                System.out.println("");
                System.out.println("enter new phone number: ");
                int newPhone = scan.nextInt();
                person.setPhoneNumber(newPhone);
            }
            case 3 -> {
                System.out.println("--- Edit email ---");
                System.out.println("");
                System.out.println("enter new email: ");
                String newEmail = scan.next();
                person.setEmail(newEmail);
            }
            case 4 -> {
                System.out.println("--- Edit Activity ---");
                System.out.println("");
                System.out.println("enter new Activity: ");
                Activity = scan.nextBoolean();
                if(Main.EditingMember){
                Member personM = (Member) person;
                personM.setActive(Activity);}
                else{
                    System.out.println(" This person is an employee ");
                    Main.menu();
                }
            }
            case 5 -> {
                System.out.println("Returning to main Menu...");
                System.out.println("");
                System.out.println("");
                Main.menu();
            }
            default -> alterMenu(); 
        }
    }
     
    
}
