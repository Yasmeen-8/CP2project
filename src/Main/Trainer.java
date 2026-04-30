package Main;

import java.util.ArrayList;

public class Trainer extends Employee{
    ArrayList<Member> assignedMembers = new ArrayList<Member>();
    
    Trainer(){
    this.userID++;
    }

    public ArrayList<Member> getAssignedMembers() {
        return assignedMembers;
    }

    public void assignMember(Member member){
        assignedMembers.add(member);
    }
    
    public void removeMember(Member member){
        assignedMembers.remove(member);
    }


}
