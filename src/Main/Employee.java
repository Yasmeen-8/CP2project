package Main;
import java.util.*;

public class Employee extends Users{
    
    ArrayList<Member> assignedMembers = new ArrayList<Member>();
    private String department;

    public ArrayList<Member> getAssignedMembers() {
        return assignedMembers;
    }

    public int getEmpID() {
        return this.userID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    public void assignMember(Member member){
        if(this.department.equals("Trainer")){
        assignedMembers.add(member);
        }else{
        System.out.println("this Employee is not a Trainer");
        }
    }
    
    public void removeMember(Member member){
        if(this.department.equals("Trainer")){
        assignedMembers.remove(member);
        }else{
        System.out.println("this Employee is not a Trainer");
        }
    }
    
}
