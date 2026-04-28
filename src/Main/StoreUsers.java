package Main;
import java.util.*;

// We will add a method that is called for every update (also for when any alter is done called "save" and we will have the save / load in the place)
public class StoreUsers {
    
    static ArrayList<Users> users = new ArrayList<>();

    public ArrayList<Users> getUsers() {
        return users;
    }

    public void addEmployee(Users user){
        users.add(user);
    }
    
    public void removeEmployee(Users user){
        users.add(user);
    }
    
    
    public void save(){
    
    }
    
    public void load(){
    
    }
    
}
