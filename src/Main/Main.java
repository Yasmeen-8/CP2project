package Main;
import java.util.*;

    
public class Main{ //START OF CLASS
    
    public static int navigation = 0;
    static Scanner scan = new Scanner(System.in);
    public static boolean EditingMember = false;
    
    
    
    public static void main(String[] args){
        menu();
    }
    
    public static void menu(){ //FIX NUMBERS
    do{
    System.out.println("Please choose an option from the following menu");
    System.out.println("--- add user ---");
    System.out.println("1: Add user");
    System.out.println("");
    System.out.println("--- edit user ---");
    System.out.println("2: alter member details");
    System.out.println("3: alter employee details");
    System.out.println("");
    System.out.println("--- trainer manage ---");
    System.out.println("4: List assigned members to trainer"); // Change to trainer manage
    System.out.println("5: assign a member to a personal trainer");
    System.out.println("6: remove a member from a personal trainers list of members"); // 
    System.out.println("");
    System.out.println("");
    System.out.println("7: Delete User");
    System.out.println("8: download marketing report");
    System.out.println("");
    System.out.println("9: exit system");
    navigation = scan.nextInt();
    }while(navigation <= 0 || navigation >= 10);
    checknum();

    }
 
    public static void checknum(){
        switch(navigation){
            case 1 -> {
                System.out.println("--- Adding new User ---");
                System.out.println("");
                addUser();

            }
            case 2 -> {
                System.out.println(" --- alter Member ---");
                System.out.println("");
                System.out.println("Enter id:");
                int input = scan.nextInt();
                UserManage.getUser(input);
                EditingMember = true;
                UserManage.alterMenu();
            }
            case 3 -> {
                System.out.println(" --- alter Member ---");
                System.out.println("");
                System.out.println("Enter id:");
                int input = scan.nextInt();
                UserManage.getUser(input);
                EditingMember = true;
                UserManage.alterMenu();
            }
            case 4 -> {// LIST TRAINER ASSIGNED MEMBERS
                int id = 0;
                System.out.println(" --- Listing trainers assigned members --- ");
                System.out.println("");
                System.out.println("enter ID:");
                id = scan.nextInt();
                Trainer emp;
                emp = getTrainerByID(id);
                if(emp.assignedMembers != null){
                for(int i = 0; i < emp.assignedMembers.size(); i++){
                    Member person = emp.assignedMembers.get(i);
                    System.out.println("member no: " + Integer.toString(i));
                    System.out.println("Member ID = " + Integer.toString(person.getMemberID()) + "Member name: " + person.getName());
                }
                }else{
                System.out.println("Employee is not a trainer, or does not have any members assigned");
                menu();}
            }
            case 5 -> {
                System.out.println(" --- Assign Member to trainer---");
                System.out.println("");
                System.out.println("Enter trainer ID: ");
                int input = scan.nextInt();
                assignMemberToTrainer(getTrainerByID(input));
            }

            case 6 -> {
                System.out.println("--- Delete member from trainer list ---");
                System.out.println("");
                System.out.println("enter Trainer ID:");
                int id = scan.nextInt();
                removeMemberFromTrainer(getTrainerByID(id));
            }
            case 7 -> {
                System.out.println("--- Delete user from system ---");
                System.out.println("");
                System.out.println("enter user ID");
                int id = scan.nextInt();
                removeUser(id);
            }
            case 8 -> {
                System.out.println("");
                System.out.println("");
            }
            case 9 -> {
                System.out.println("Thank you for using our system.");
                System.exit(0);
            }
            default -> menu();
                
        }
    }
    
    public static void assignMemberToTrainer(Trainer trainer){
        System.out.println("Enter the member ID you would like to add: ");
        int id = scan.nextInt();
        Member memb = getMemberByID(id);
        trainer.assignMember(memb);
    }
    
    public static void removeMemberFromTrainer(Trainer trainer){
        System.out.println("Enter the member ID you would like to remove: ");
        int id = scan.nextInt();
        ArrayList<Member> membList = trainer.getAssignedMembers();
        Member person = membList.get(id);
        if(person != null){
            trainer.removeMember(person);
            System.out.println("Member removed");
        }else{
            System.out.println("Member is not in the List");
        }
        
        
    }
    
    //returns the member from the list of users
    public static Member getMemberByID(int memberID){
    Member person = null;
    if(checkMember(memberID)){
    person = (Member) StoreUsers.users.get(memberID);
    }else{
    person = null;
    System.out.println("Id does not exist/is not a member");
    menu(); // can make it so it returns/loops until exist (like in the alter member number 5)
    }
    return person;}
    
    //returns the member from the list of users
    public static Employee getEmpoloyeeByID(int employeeID){
    Employee person = null;
    if(checkEmployee(employeeID)){
    person = (Employee) StoreUsers.users.get(employeeID);
    }else{
    person = null;
    System.out.println("Id does not exist/is not an employee");
    menu(); // can make it so it returns/loops until exist (like in the alter member number 5)
    }
    return person;
    }
    // returns the trainer from the list of Users
    public static Trainer getTrainerByID(int trainerID){
    Trainer person = null;
    if(checkTrainer(trainerID)){
    person = (Trainer) StoreUsers.users.get(trainerID);
    }else{
    person = null;
    System.out.println("Id does not exist/is not a Trainer");
    menu(); // can make it so it returns/loops until exist (like in the alter member number 5)
    }
    return person;
    }
   
    //returns true if the id belongs to a member
    public static boolean checkMember(int memberID){ 
        Users member = StoreUsers.users.get(memberID);
        return member instanceof Member;
    }
    
    //returns true if the id belongs to a member
    public static boolean checkEmployee(int employeeID){ //returns true if employee is in the employee list
        Users emp = StoreUsers.users.get(employeeID);
        return emp instanceof Employee;
    }     
    
    public static boolean checkTrainer(int trainerID){
        Users emp = StoreUsers.users.get(trainerID);
        return emp instanceof Employee;
    }
    
    public static Users getUser(int userID){
    Users person = StoreUsers.users.get(userID);
    if(person != null){
        return person; 
    }else{
    person = null;
    System.out.println("Id does not exist/is not a member");
    menu(); // can make it so it returns/loops until exist (like in the alter member number 5)
    }
    return person;}
    
    public static void addUser(){
                int input;
                System.out.println("Enter the following number for each category"); // add a toggle clicking between all of this
                System.out.println("1. Member: polytechnic Student");
                System.out.println("2. Member: polytechnic Staff");
                System.out.println("3. Employee: Other");
                System.out.println("4. Employee: Trainer");
                input = scan.nextInt();
                
                switch(input){
                    case 1 -> {
                        
                    PolyStudent person = new PolyStudent();
                    System.out.println("enter name");
                    person.setName(scan.next());
                    StoreUsers.users.add(person);
                    System.out.println("Student added");
                    
                    }
                    case 2 -> {
                    
                    PolyStaff person = new PolyStaff();
                    System.out.println("enter name");
                    person.setName(scan.next());
                    StoreUsers.users.add(person);
                    System.out.println("Staff added");
                    
                    }
                    case 3 -> {
                    
                    OtherEmp person = new OtherEmp();
                    System.out.println("enter name");
                    person.setName(scan.next());
                    StoreUsers.users.add(person);
                    System.out.println("Other employee added");
                    
                    }
                    case 4 -> {
                    
                    Trainer person = new Trainer();
                    System.out.println("enter name");
                    person.setName(scan.next());
                    StoreUsers.users.add(person);
                    System.out.println("Trainer added");
                    
                    }
                    
                }
                
                
                 // we can make it print the user info/id (separate method for this is better to reuse somewhere else)
    }
    
    public static void removeUser(int userID){
        Users person = getUser(userID);
        StoreUsers.users.remove(person);
    }

}// END OF CLASS