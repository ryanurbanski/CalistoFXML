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
public class LoanApplication {
    
    int id;
    int idCount;
    int SSN;
    double ammountRequested;
    int userID;
    boolean pending;
    boolean accepted;
    
    public LoanApplication(int SSN, double amountRequested, int userId, boolean pending, 
            boolean accepted) {
        this.id = generateID();
        this.SSN = SSN;
        this.ammountRequested = amountRequested;
        this.userID = userId;
        this.pending = pending;
        this.accepted = accepted;
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
    
    /**
     * This method calculates credit score
     * @param firstName
     * @param lastName
     * @param SSN
     * @return 
     */
    private int calculateCreditScore(String firstName, String lastName, int SSN){
        return 800;
    }
    
    //----------getters and setters--------

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public double getAmmountRequested() {
        return ammountRequested;
    }

    public void setAmmountRequested(double ammountRequested) {
        this.ammountRequested = ammountRequested;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public boolean isPending() {
        return pending;
    }

    public void setPending(boolean pending) {
        this.pending = pending;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
    
    
}