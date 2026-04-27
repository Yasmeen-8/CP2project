package Main;


public class Member extends Users{
    int memberID;
    private boolean Active;
    private Employee AssignedTrainer;

    public int getMemberID() {
        return memberID;
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

    
    public Member(String Name){
        this.setName(Name);
        memberID++;
        }
    
}
