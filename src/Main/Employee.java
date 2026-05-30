package Main;

import java.io.Serializable;
import java.util.*;

public class Employee extends Users implements Serializable {

    private int staffID;
    private String Position;
    private String Department;
    private static int idCounter = 199;

    public Employee() {
        this.userID = idCounter++;
    }
    
    public int getEmpID() {
        return this.userID;
    }


}
