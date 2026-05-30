package Main;
import GUI.MarketingReport;
import java.io.File;
import java.util.*;


    
public class Main{ //START OF CLASS
    
    public static int navigation = 0;
    static Scanner scan = new Scanner(System.in);
    static boolean EditingMember = false;
    
    
    public static void main(String[] args){
        File f = new File("gymData.dat");

    if (f.exists()) {
        StoreUsers.load();
    } else {
        StoreUsers.loadStartupFile();
    }
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
                System.out.println("Enter the following number for each category");
                System.out.println("1. Member: polytechnic Student");
                System.out.println("2. Member: polytechnic Staff");
                System.out.println("3. Employee: Other");
                System.out.println("4. Employee: Trainer");
                int addType = scan.nextInt();
                System.out.println("enter name");
                String addName = scan.next();

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
                if(emp.getAssignedMembers() != null){
                for(int i = 0; i < emp.getAssignedMembers().size(); i++){
                    Member person = emp.getAssignedMembers().get(i);
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
                int trainerId = scan.nextInt();
                Trainer trainer = getTrainerByID(trainerId);
                System.out.println("Enter the member ID you would like to add: ");
                int memberIdToAdd = scan.nextInt();
                assignMemberToTrainer(trainer, memberIdToAdd);
            }

            case 6 -> {
                System.out.println("--- Delete member from trainer list ---");
                System.out.println("");
                System.out.println("enter Trainer ID:");
                int trainerId = scan.nextInt();
                Trainer trainer = getTrainerByID(trainerId);
                System.out.println("Enter the member ID you would like to remove: ");
                int memberIdToRemove = scan.nextInt();
                removeMemberFromTrainer(trainer, memberIdToRemove);
            }
            case 7 -> {
                System.out.println("--- Delete user from system ---");
                System.out.println("");
                System.out.println("enter user ID");
                int id = scan.nextInt();
                removeUser(id);
            }
            case 8 -> {
                System.out.println("--- downloading marketing report ---");
                System.out.println("");
                MarketingReport ui = new MarketingReport();
                ui.setVisible(true);
            }
            case 9 -> {
                System.out.println("Thank you for using our system.");
                System.exit(0);
            }
            default -> menu();
                
        }
    }
    
    public static void assignMemberToTrainer(Trainer trainer, int memberID){
        Member memb = getMemberByID(memberID);
        if(memb != null){
            trainer.assignMember(memb);
            System.out.println("Member assigned to trainer");
        } else {
            System.out.println("Member not found; cannot assign");
        }
    }
    
    public static void removeMemberFromTrainer(Trainer trainer, int memberID){
        ArrayList<Member> membList = trainer.getAssignedMembers();
        if(membList == null){
            System.out.println("Trainer has no assigned members");
            return;
        }
        Member found = null;
        for(Member m : membList){
            if(m.getMemberID() == memberID){
                found = m;
                break;
            }
        }
        if(found != null){
            trainer.removeMember(found);
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
    
    
    //Main.Main.addUser(1, firstName, surname, Phone, address, dob, gender, course, team);
    public static void addUser(int input, String name, String surname, int phone, String address, String dob, String gender, String other1, String other2){
                switch(input){
                    case 1 -> { // adding a student
                        PolyStudent person = new PolyStudent();
                        person.setName(name + " " + surname);
                        person.setPhoneNumber(phone);
                        person.setAddress(address);
                        person.setDateOfBirth(dob);
                        person.setGender(gender);
                        person.setCourse(other1);
                        if(other2 != null){
                        person.setInteam(true);
                        person.setTeams(other2);
                        }
                        StoreUsers.users.add(person);
                        System.out.println("Student added");
                        
                    }
                    case 2 -> { // adding a staff member
                        PolyStaff person = new PolyStaff();
                        person.setName(name + " " + surname);
                        person.setPhoneNumber(phone);
                        person.setAddress(address);
                        person.setDateOfBirth(dob);
                        person.setGender(gender);
                        StoreUsers.users.add(person);
                        System.out.println("Staff added");
                    }
                    case 3 -> { // adding a employee
                        OtherEmp person = new OtherEmp();
                        person.setName(name + " " + surname);
                        person.setPhoneNumber(phone);
                        person.setAddress(address);
                        StoreUsers.users.add(person);
                        System.out.println("Other employee added");
                    }
                    case 4 -> { //adding a trainer employee
                        Trainer person = new Trainer();
                        person.setName(name + " " + surname);
                        person.setPhoneNumber(phone);
                        person.setAddress(address);
                        StoreUsers.users.add(person);
                        System.out.println("Trainer added");
                    }
                }
    }
    
    public static void removeUser(int userID){
        Users person = getUser(userID);
        StoreUsers.users.remove(person);
    }
    
public static String generateMarketingReport(String type) {

    String text = "";

    // ================= STAFF =================

    if(type.equals("all") || type.equals("staff")) {

        text += "===== POLYTECHNIC STAFF =====\n\n";

        int count = 0;

        for(Users u : StoreUsers.users) {

            if(u instanceof PolyStaff s) {
                
                text += "Name: " + s.getName() + "\n";
                text += "Address: " + s.getAddress() + "\n";
                text += "Phone: " + s.getPhoneNumber() + "\n";
                text += "Position: " + s.getPosition() + "\n";
                text += "Department: " + s.getDepartment() + "\n";

                text += "----------------------------------\n";

                count++;
            }
        }

        text += "\nTotal Staff Members: " + count + "\n\n";
    }

    // ================= STUDENTS =================

    if(type.equals("all") || type.equals("students")) {

        text += "===== POLYTECHNIC STUDENTS =====\n\n";

        int count = 0;

        for(Users u : StoreUsers.users) {

            if(u instanceof PolyStudent s) {

                text += "Name: " + s.getName() + "\n";
                text += "Address: " + s.getAddress() + "\n";
                text += "Phone: " + s.getPhoneNumber() + "\n";
                text += "Course: " + s.getCourse() + "\n";
                text += "Team: " + s.getTeams() + "\n";

                text += "----------------------------------\n";

                count++;
            }
        }

        text += "\nTotal Student Members: " + count + "\n";
    }

    return text;
}
}// END OF CLASS