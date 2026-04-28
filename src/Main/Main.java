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
    System.out.println("3: alter member details");
    System.out.println("4: alter employee details");
    System.out.println("");
    System.out.println("--- trainer manage ---");
    System.out.println("5: List assigned members to trainer"); // Change to trainer manage
    System.out.println("6: assign a member to a personal trainer");
    System.out.println("7: remove a member from a personal trainers list of members"); // 
    System.out.println("");
    System.out.println("");
    System.out.println("8: Delete User");
    System.out.println("10: download marketing report");
    System.out.println("");
    System.out.println("11: exit system");
    navigation = scan.nextInt();
    }while(navigation <= 0 || navigation >= 12);
    checknum();

    }
    
    
 
    public static void checknum(){
        switch(navigation){
            case 1 -> {
                System.out.println("--- Adding new User ---");
                System.out.println("");
                AddMember();

            }
            case 2 -> {
                System.out.println("--- Adding new Employee ---");
                System.out.println("");
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
            case 4 -> {
                System.out.println(" --- alter Employee ---");
                System.out.println("");
                System.out.println("Enter id:");
                int input = scan.nextInt();
                UserManage.getUser(input);
                EditingMember = false;
                UserManage.alterMenu();
            }
            case 5 -> {// LIST TRAINER ASSIGNED MEMBERS
                int id = 0;
                System.out.println(" --- Listing trainers assigned members --- ");
                System.out.println("");
                System.out.println("enter ID:");
                id = scan.nextInt();
                Employee emp = getEmpoloyeeByID(id);
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
            case 6 -> {
                System.out.println(" --- Assign Member to trainer---");
                System.out.println("");
                System.out.println("Enter trainer ID: ");
                int input = scan.nextInt();
                assignMemberToTrainer(getEmpoloyeeByID(input));
            }
            case 7 -> {
                System.out.println("");
                System.out.println("");
            }
            case 8 -> {
                System.out.println("");
                System.out.println("");
            }
            case 9 -> {
                System.out.println("");
                System.out.println("");
            }
            case 10 -> {
                System.out.println("");
                System.out.println("");
            }
            case 11 -> {
            System.out.println("Thank you for using our system.");
            System.exit(0);
            }
            default -> menu();
                
        }
    }
    
    public static void assignMemberToTrainer(Employee employee){
        System.out.println("Enter the member ID you would like to add: ");
        int id = scan.nextInt();
        Member memb = getMemberByID(id);
        employee.assignMember(memb);
    }
    
    //returns the member from the list by checking and searching
    public static Member getMemberByID(int memberID){
    Member person = null;
    if(checkMember(memberID)){
    person = (Member) StoreUsers.users.get(memberID);
    }else{
    person = null;
    System.out.println("Id does not exist");
    menu(); // can make it so it returns/loops until exist (like in the alter member number 5)
    }
    return person;}
    
    //returns the member from the list by checking and searching
    public static Employee getEmpoloyeeByID(int employeeID){
    Employee person = null;
    if(checkMember(employeeID)){
    person = (Employee) StoreUsers.users.get(employeeID);
    }else{
    person = null;
    System.out.println("Id does not exist");
    menu(); // can make it so it returns/loops until exist (like in the alter member number 5)
    }
    return person;
    }
    
    //returns true if member is in the members list
    public static boolean checkMember(int memberID){ 
        Users member = StoreUsers.users.get(memberID);
        return member instanceof Member;
    
    }
    
    //returns true if employee is in the employee list
    public static boolean checkEmployee(int employeeID){ //returns true if employee is in the employee list
        Users emp = StoreUsers.users.get(employeeID);
        return emp instanceof Employee;
    }     
    
    public static void getUser(int userID){
        Users users = StoreUsers.users.get(userID);
        Boolean userExist;
        userExist = users instanceof Users;
    }
    
    public static void AddMember(){
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
    
    public static void removeUser(){
    
    }

}// END OF CLASS