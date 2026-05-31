package Main;

import java.io.Serializable;

public class PolyStudent extends Member implements Serializable{ //polystudent class where it extends the member and impliments the seiralizable
    private double studentDiscount;
    public String course;
    private boolean Inteam;
    public String Teams;
    public double getStudentDiscount() {
        return studentDiscount;
    }

    public void setStudentDiscount(double studentDiscount) {
        this.studentDiscount = studentDiscount;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) { 
        this.course = course;
    }

    public boolean isInteam() {
        return Inteam;
    }

    public void setInteam(boolean Inteam) {
        this.Inteam = Inteam;
    }

    public String getTeams() {
        return Teams;
    }

    public void setTeams(String Teams) {
        this.Teams = Teams;
    }
   
    
    // Constructor sets defaults for a polytechnic student
    PolyStudent(){
        studentDiscount = 0.0;
        this.userID++;
    }
}
