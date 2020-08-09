/*
 * Penn State University
 * IST 412
 * Ryan Urbanski
 */

package Model;

import java.util.ArrayList;

/**
 *
 * @author ryan
 */
public class User {
    int id;
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String password;
    int employeeNum;
    
    int idCount = 0;
    
    /**
     * This is a customer specific User constructor
     * @param firstName
     * @param lastName 
     * @param email 
     * @param phoneNumber 
     * @param password 
     */
    public User(String firstName, String lastName, 
            String email, String phoneNumber, String password) {
        this.id = generateID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
    
    /**
     * This is employee specific User constructor 
     * @param firstName
     * @param lastName
     * @param password
     * @param employeeNum 
     * @param email 
     * @param phoneNumber 
     */
    public User(String firstName, String lastName, 
            String email, String phoneNumber, String password, int employeeNum) {
        this.id = generateID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.employeeNum = employeeNum;
    }
    
    /**
     * This method returns a unique integer to identify each new user of the application.
     * @return 
     */
    private int generateID() {
        int idTemp = idCount;
        idCount +=1;
        return idTemp;
    }
    
    //------------getters and setters-----------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    public int getIdCount() {
        return idCount;
    }

    public void setIdCount(int idCount) {
        this.idCount = idCount;
    }
    
    
}