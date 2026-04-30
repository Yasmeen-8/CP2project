package Main;
import java.util.*;

public class Employee extends Users{
    
    
    private String department;



    public int getEmpID() {
        return this.userID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    

    
}
