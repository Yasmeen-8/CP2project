package Main;


public class Member {
    int memberID;
    private String name;
    private String age;
    private int phoneNumber;
    private boolean Active;
    private Employee AssignedTrainer;

    public int getMemberID() {
        return memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
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
        name = Name;
        memberID++;
        }
    
}
