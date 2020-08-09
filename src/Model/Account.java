/*
 * Penn State University
 * IST 412
 * Ryan Urbanski
 */

package Model;

import java.util.ArrayList;

/**
 * This class will hold definitions for Account objects.
 * @author bradl
 */
public class Account {
    
    int userID;
    String firstName;
    String lastName;
    double balance;
    ArrayList<LoanApplication> loans;
    
    /**
     * 
     * @param userID
     * @param firstName
     * @param lastName
     * @param balance
     * @param loans 
     */
    public Account(int userID, String firstName, String lastName, 
            double balance, ArrayList<LoanApplication> loans) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.loans = loans;
    }
    
    /**
     * This method modifies (deposits is a positive value, withdrawal
     * is a negative value) the account balance
     * @param amount 
     */
    public void modifyBalance(double amount) {
        balance += amount;
    }

    //-------------getters and setters-------------------
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public ArrayList<LoanApplication> getLoans() {
        return loans;
    }

    public void setLoans(ArrayList loans) {
        this.loans = loans;
    }
    
    
}
