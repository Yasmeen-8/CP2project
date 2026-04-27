package Main;
import java.util.*;

// We will add a method that is called for every update (also for when any alter is done called "save" and we will have the save / load in the place)
public class StoreUsers {
    
    static ArrayList<Member> members = new ArrayList<Member>();
    static ArrayList<Employee> employees = new ArrayList<Employee>();
    static ArrayList<Users> users = new ArrayList<Users>();

    public ArrayList<Users> getUsersList() {
        return users;
    }
    
        public void addUser(Users person){
    users.add(person);
    }
    public void removeUser(Users person){
    users.remove(person);
    }
    
    
    public void save(){
    
    }
    
    public void load(){
    
    }
    
}
