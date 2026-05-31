package Main;

import java.io.Serializable;

// Users: base class containing common user fields
public class Users implements Serializable{
    // Basic personal information
    private String name;
    private String email;
    private String address;
    private int phoneNumber;
    private String age;
    // public id used across system
    public int userID;
    private String DOB;
    private double salary; 

    // Name accessors
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Email accessors
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Phone accessors
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    // Address accessors
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Age accessors
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    // DOB accessors
    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    // Salary accessors
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
