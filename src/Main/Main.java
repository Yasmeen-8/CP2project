/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import java.util.*;


    
public class Main {
    
    public int navigation = 0;
    static Scanner scan = new Scanner(System.in);
    
    
    
    public static void main(String[] args){
        menu();
    }
    
    public void menu(){
    do{
    System.out.println("Please choose an option from the following menu");
    System.out.println("--- add user ---");
    System.out.println("1: add a new member");
    System.out.println("2: add a new employee");
    System.out.println("");
    System.out.println("--- edit user ---");
    System.out.println("3: alter member details");
    System.out.println("4: alter employee details");
    System.out.println("");
    System.out.println("--- trainer manage ---");
    System.out.println("6: assign a member to a personal trainer");
    System.out.println("7: remove a member from a personal trainers list of members");
    System.out.println("");
    System.out.println("");
    System.out.println("8: delete gym employees");
    System.out.println("9: delete members");
    System.out.println("10: List assigned members to trainer");
    System.out.println("11: download marketing report");
    navigation = scan.nextInt();
    }while(navigation <= 0 || navigation >= 12);
    
    }
}

    public void checknum(){
        switch(navigation){
            case 1:
                
                break;
        
        }
    }