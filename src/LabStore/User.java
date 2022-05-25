package LabStore;
import java.io.Serializable;

public class User implements Serializable{ //calvin's
    //private static final long serialVersionUID = 12351313554L; ///???
    private String firstName;
    private String lastName;
    private String userName;
    private String id; //user id
    private String passNum;
    private role_project role;

    
    public User(String id){
        this.id = id;
    }
    public User(String id,String firstName, String lastName, String userName, String passNum, role_project role) { //need role and or id
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName; 
        this.userName = userName;
        this.passNum = passNum;
        this.role = role;
    }

    public User() {
    }

    public String getId(){
        return id;
    }

    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassNum() {
        return passNum;
    }

    public void setPassNum(String passNum) {
        this.passNum = passNum;
    }
    public role_project getRole() {
        return role;
    }

    public void setRole(role_project role) {
        this.role = role;
    }
}