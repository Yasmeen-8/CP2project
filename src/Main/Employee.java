package Main;

import java.io.Serializable;
import java.util.*;

// Employee: base class for employee-type users
public class Employee extends Users implements Serializable {

    // unique employee/staff identifier
    private int staffID;
    private String Position;
    private String Department;
    private static int idCounter = 199;

    // Constructor assigns a new user ID
    public Employee() {
        this.userID = idCounter++;
    }
    
    // Returns the internal employee ID
    public int getEmpID() {
        return this.userID;
    }

}
