package Main;

import java.io.Serializable;

public class Users implements Serializable{
    private String name;
    private String email;
    private String address;
    private int phoneNumber;
    private String age;
    public int userID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getAddress() {
    return address;
}

    public void setAddress(String address) {
    this.address = address;
}

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    
}
