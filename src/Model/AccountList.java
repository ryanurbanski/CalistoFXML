/*
 * Penn State University
 * IST 412
 * Ryan Urbanski
 */

package Model;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author ryan
 */
public class AccountList {
    
    ArrayList<Account> accounts;
    
    public AccountList(){
        accounts = new ArrayList<Account>();
    }
    
    public Account search(String term) {
//        Account temp;
//        temp = new Account(
//                123, "First", "Last", 1234.72, new ArrayList<LoanApplication>(
//                        (Collection<? extends LoanApplication>) new LoanApplication(555555555, 5000, 123, true, false)));
        Account found = null;
        for (int i = 0; i < accounts.size(); i++) {
            if (term == accounts.get(i).firstName) {
                found = accounts.get(i);
                return found;
            } else if (term == accounts.get(i).lastName) {
                found = accounts.get(i);
                return found;
            } else if (term == String.valueOf(accounts.get(i).balance)) {
                found = accounts.get(i);
                return found;
            } else if (term == String.valueOf(accounts.get(i).userID)) {
                found = accounts.get(i);
                return found;
            } 
        }
        return found;
    }
    
    public void delete(int userID) {
        for (int i = 0; i < accounts.size(); i++) {
            Account temp = accounts.get(i);
            if (temp.getUserID() == userID) {
                accounts.remove(i);
            }
        }
    }
    
    public void add(Account account) {
        accounts.add(account);
    }
    
    //---------getters and setters----------

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    
    
}