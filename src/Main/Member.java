package Main;

import java.io.Serializable;

// Member: represents a gym member (student/staff)
public class Member extends Users implements Serializable {

    // whether the member is currently active
    private boolean Active;
    // trainer assigned to this member
    private Employee AssignedTrainer;
    private String gender;
    private static int idCounter = 99;

    // Constructor assigns a new member ID
    public Member() {
        this.userID = idCounter++;
    }

    // Gender getter/setter
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Returns the member's ID
    public int getMemberID() {
        return this.userID;
    }

    // Active flag getter/setter
    public boolean isActive() {
        return Active;
    }

    public void setActive(boolean Active) {
        this.Active = Active;
    }

    // Assigned trainer getter/setter
    public Employee getAssignedTrainer() {
        return AssignedTrainer;
    }

    public void setAssignedTrainer(Employee AssignedTrainer) {
        this.AssignedTrainer = AssignedTrainer;
    }

}
