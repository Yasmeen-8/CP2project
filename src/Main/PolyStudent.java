package Main;

import java.io.Serializable;

public class PolyStudent extends Member implements Serializable{
    double studentDiscount;
    String course;
    boolean Inteam;
    String Teams;
    
    PolyStudent(){
        studentDiscount = 0.0;
        this.userID++;
    }
}
