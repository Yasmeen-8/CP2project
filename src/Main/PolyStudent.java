package Main;

import java.io.Serializable;

public class PolyStudent extends Member implements Serializable{
    private double studentDiscount;
    private String course;
    private boolean Inteam;
    private String Teams;
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
   
    
    PolyStudent(){
        studentDiscount = 0.0;
        this.userID++;
    }
}
