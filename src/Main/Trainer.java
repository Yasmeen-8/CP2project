package Main;

import java.io.Serializable;
import java.util.ArrayList;


// Trainer: employee who can have assigned members
public class Trainer extends Employee implements Serializable{
    // list of members assigned to this trainer
    private ArrayList<Member> assignedMembers = new ArrayList<Member>();

    // Constructor increments user id
    Trainer(){
        this.userID++;
    }

    // Returns assigned members list
    public ArrayList<Member> getAssignedMembers() {
        return assignedMembers;
    }

    // Assign a member to this trainer
    public void assignMember(Member member){
        assignedMembers.add(member);
    }
    
    // Remove a member from this trainer
    public void removeMember(Member member){
        assignedMembers.remove(member);
    }

}
