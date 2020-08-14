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

    CustomerData cd;
    EmployeeData ed;
    LoanApplicationData ld;

    public Model() {
        cd = new CustomerData();
        ed = new EmployeeData();
        ld = new LoanApplicationData();
    }
    
    //----------getters and setters----------

    public CustomerData getCd() {
        return cd;
    }

    public void setCd(CustomerData cd) {
        this.cd = cd;
    }

    public EmployeeData getEd() {
        return ed;
    }

    public void setEd(EmployeeData ed) {
        this.ed = ed;
    }
    public LoanApplicationData getLd() {
        return ld;
    }

    public void setLd(LoanApplicationData ld) {
        this.ld = ld;
    }
}