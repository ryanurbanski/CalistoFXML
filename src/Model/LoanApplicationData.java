/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author JSakyi
 */
public class LoanApplicationData {
    
    ArrayList<LoanApplication> loanApplications;
    
    public LoanApplicationData() {
        loanApplications = new ArrayList<LoanApplication>();

        ArrayList<LoanApplication> loanApplications = new ArrayList<LoanApplication>();
        LoanApplication temp = new LoanApplication(123456789, 20000.0, false, true, false);
        LoanApplication temp1 = new LoanApplication(123456781, 40000.0, false, true, false);
        
        loanApplications.add(temp);
        loanApplications.add(temp);
    }
    
    public LoanApplication search(String term) {
        ArrayList<LoanApplication> loanApplications = new ArrayList<LoanApplication>();

        LoanApplication temp = new LoanApplication(123456789, 20000.0, false, true, false);
        return temp;
    }
    
    public void addLoanApplication(LoanApplication loanApplication) {
        loanApplications.add(loanApplication);
    }
    
    // getters and setters

    public ArrayList<LoanApplication> getLoanApplications() {
        return loanApplications;
    }

    public void setLoanApplications(ArrayList<LoanApplication> loanApplications) {
        this.loanApplications = loanApplications;
    }
    
}
