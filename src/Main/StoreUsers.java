package Main;
import java.util.*;
import java.io.*;
import java.io.Serializable;

// Stores all users and handles saving/loading data
public class StoreUsers implements Serializable{

    // List that stores all users in the system
    public static ArrayList<Users> users = new ArrayList<>();

    // Returns the list of users
    public ArrayList<Users> getUsers() {
        return users;
    }

    // Saves all user data to a file
    public static void save(){
        try {

            ObjectOutputStream out =
                new ObjectOutputStream(
                new FileOutputStream("gymData.dat"));

            out.writeObject(users);

            out.close();

            System.out.println("Data saved successfully.");

        } catch (IOException e) {
            System.out.println("Save error: " + e.getMessage());
        }
    }

    // Loads saved user data from a file
    public static void load(){
        try {

            ObjectInputStream in =
                new ObjectInputStream(
                new FileInputStream("gymData.dat"));

            users = (ArrayList<Users>) in.readObject();

            in.close();

            System.out.println("Saved data loaded.");

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No saved data found.");
        }
    }

    // Loads the initial data from startup.txt
    public static void loadStartupFile() {

        try {

            Scanner file =
                new Scanner(new File("startup.txt"));

            // Read the number of employees in the file
            int employeeCount =
                Integer.parseInt(file.nextLine());

            for (int i = 0; i < employeeCount; i++) {

                // Read employee type (E or PT)
                String type = file.nextLine();

                String fname = file.nextLine();
                String lname = file.nextLine();
                String address = file.nextLine();
                String phone = file.nextLine();
                double salary =
                    Double.parseDouble(file.nextLine());

                // Create a regular employee
                if (type.equals("E")) {

                    OtherEmp emp = new OtherEmp();

                    emp.setName(fname + " " + lname);
                    emp.setAddress(address);
                    emp.setPhoneNumber(Integer.parseInt(phone));

                    users.add(emp);
                }

                // Create a personal trainer
                else if (type.equals("PT")) {

                    Trainer trainer = new Trainer();

                    trainer.setName(fname + " " + lname);
                    trainer.setAddress(address);
                    trainer.setPhoneNumber(Integer.parseInt(phone));

                    users.add(trainer);

                    // Read how many members belong to this trainer
                    int memberCount =
                        Integer.parseInt(file.nextLine());

                    for (int j = 0; j < memberCount; j++) {

                        // Read member information
                        String memberType = file.nextLine();

                        String mf = file.nextLine();
                        String ml = file.nextLine();
                        String ma = file.nextLine();
                        String dob = file.nextLine();
                        String mp = file.nextLine();
                        String gender = file.nextLine();

                        // Create a staff member
                        if (memberType.equals("staff")) {

                            PolyStaff m = new PolyStaff();

                            m.setName(mf + " " + ml);
                            m.setAddress(ma);
                            m.setPhoneNumber(Integer.parseInt(mp));

                            m.position = file.nextLine();
                            m.department = file.nextLine();

                            users.add(m);

                            // Assign member to trainer
                            trainer.assignMember(m);

                        } else {

                            // Create a student member
                            PolyStudent m = new PolyStudent();

                            m.setName(mf + " " + ml);
                            m.setAddress(ma);
                            m.setPhoneNumber(Integer.parseInt(mp));

                            m.course = file.nextLine();
                            m.Teams = file.nextLine();

                            users.add(m);

                            // Assign member to trainer
                            trainer.assignMember(m);
                        }
                    }
                }
            }

            file.close();

            System.out.println("Startup file loaded.");

        } catch (FileNotFoundException | NumberFormatException e) {
            System.out.println("Startup load error.");
        }
    }
}