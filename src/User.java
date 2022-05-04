import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class User {
  private   String FirstName;
  private  String LastName;
  private  String userName;


    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }


    public  void createUser(String xmlFile) {
        try (FileOutputStream fos = new FileOutputStream(xmlFile);
             XMLEncoder s = new XMLEncoder(fos)) {
            s.writeObject(this);
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
    }
    public static User  showAllUsers(String file){
        User user = new User();
        try (FileInputStream fis = new FileInputStream(file);
             XMLDecoder objIn = new XMLDecoder(fis)) {
            user = (User) objIn.readObject();
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
        return user;
    }

    public void addTask(String xmlFile){

    }
    }

