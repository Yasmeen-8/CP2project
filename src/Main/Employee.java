
package Main;
import java.util.*;

public class Employee extends Users{
    
    ArrayList<Member> assignedMembers = new ArrayList<Member>();
    int empID;
    private String name;
    private String email;
    private int phoneNumber;
    private String department;

    public ArrayList<Member> getAssignedMembers() {
        return assignedMembers;
    }

    public int getEmpID() {
        return empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
  
    
    public Employee(){
    empID++;
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
