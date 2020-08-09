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
public class Model {
    UserList ul;
    AccountList al;
    LoanAppList lal;
    
    public Model() {
        
    }
    
    //----------getters and setters----------

    public UserList getUl() {
        return ul;
    }

    public void setUl(UserList ul) {
        this.ul = ul;
    }

    public AccountList getAl() {
        return al;
    }

    public void setAl(AccountList al) {
        this.al = al;
    }

    public LoanAppList getLal() {
        return lal;
    }

    public void setLal(LoanAppList lal) {
        this.lal = lal;
    }
    
}