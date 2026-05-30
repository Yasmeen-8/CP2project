package Main;

import java.io.Serializable;

public class PolyStaff extends Member implements Serializable{
    double staffDiscount;
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
    
    PolyStaff(){
        this.userID++;
        staffDiscount = 0.0;
    }
    
}
