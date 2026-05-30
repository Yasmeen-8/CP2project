package Main;

import java.io.Serializable;
import java.util.*;

public class Employee extends Users implements Serializable {

    private int staffID;
    private double salary;
    private String Position;
    private String Department;
    
    public int getEmpID() {
        return this.userID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
