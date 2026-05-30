package Main;

import java.io.Serializable;

public class Member extends Users implements Serializable {

    private boolean Active;
    private Employee AssignedTrainer;
    private String gender;
    private static int idCounter = 99;

    public Member() {
        this.userID = idCounter++;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getMemberID() {
        return this.userID;
    }

    public boolean isActive() {
        return Active;
    }

    public void setActive(boolean Active) {
        this.Active = Active;
    }

    public Employee getAssignedTrainer() {
        return AssignedTrainer;
    }

    public void setAssignedTrainer(Employee AssignedTrainer) {
        this.AssignedTrainer = AssignedTrainer;
    }

}
