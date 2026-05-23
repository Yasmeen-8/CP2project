package Main;

import java.io.Serializable;

public class PolyStaff extends Member implements Serializable{
    double staffDiscount;
    String position;
    String department;
    
    PolyStaff(){
        this.userID++;
        staffDiscount = 0.0;
    }
    
}
