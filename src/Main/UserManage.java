package Main;
import java.util.*;


public class UserManage {
    public int navigation = 0;
    Scanner scan = new Scanner(System.in);
    
    public void alterMenu(){
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
    
     public  void checknum(){
         int id = 0;
        switch(navigation){
            case 1 -> {
                System.out.println("-- Edit name ---");
                System.out.println("");
                System.out.println("enter ID:");
                id = scan.nextInt();
                Member person = Main.getMemberByID(id);
                System.out.println("enter new name: ");
                String newname = scan.next();
                person.setName(newname);
            }
            case 2 -> {
            }
            case 3 -> {
            }
            case 4 -> {
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
