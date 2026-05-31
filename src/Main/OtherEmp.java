package Main;

import java.io.Serializable;

// OtherEmp: simple subclass for non-trainer employees
public class OtherEmp extends Employee implements Serializable{
    // Default constructor increments the user id
    OtherEmp(){
        this.userID++;
    }
}
