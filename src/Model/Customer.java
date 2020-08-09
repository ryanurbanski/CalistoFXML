/*
 * Penn State University
 * IST 412
 * Ryan Urbanski
 */

package Model;

/**
 *
 * @author ryan
 */
public class Customer extends UserFactory {
    
    int id;
    int idCount = 0;
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String password;
    
    public Customer(String firstName, String lastName, 
            String email, String phoneNumber, String password) {
        this.id = generateID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    private int generateID() {
        int idTemp = idCount;
        idCount +=1;
        return idTemp;
    }
    
    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCount() {
        return idCount;
    }

    public void setIdCount(int idCount) {
        this.idCount = idCount;
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
    
    
}