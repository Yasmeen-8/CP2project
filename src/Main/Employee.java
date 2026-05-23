package Main;
import java.io.Serializable;
import java.util.*;

public class Employee extends Users implements Serializable{
    
   private int staffID;
   private double salary;


    public int getEmpID() {
        return this.userID;
    }


}
