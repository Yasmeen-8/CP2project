/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import java.util.*;


public class StoreUsers {
    
    static ArrayList<Member> members = new ArrayList<Member>();
    static ArrayList<Employee> employees = new ArrayList<Employee>();

    public ArrayList<Member> getMembers() {
        return members;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    
    public void addEmployee(Employee employee){
    employees.add(employee);
    }
    
    public void addMember(Member member){
    members.add(member);
    }
    
    public void removeMember(Member member){
    members.remove(member);
    }
    
    public void removeEmployee(Employee employee){
    employees.remove(employee);
    }
    
    
}
