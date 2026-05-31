package Main;

import java.io.Serializable;

// PolyStaff: member type for polytechnic staff
public class PolyStaff extends Member implements Serializable{
    // staff discount rate
    double staffDiscount;
    // staff position title
    public String position;

    public double getStaffDiscount() {
        return staffDiscount;
    }

    public void setStaffDiscount(double staffDiscount) {
        this.staffDiscount = staffDiscount;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String department;
    
    // Constructor initializes defaults
    PolyStaff(){
        this.userID++;
        staffDiscount = 0.0;
    }
    
}
