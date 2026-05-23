package Main;

import java.io.Serializable;

public class OtherEmp extends Employee implements Serializable{
    OtherEmp(){
    this.userID++;
    }
}
