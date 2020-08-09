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
public class LoanAppList {

    ArrayList<LoanApplication> loanApps;

    public LoanAppList() {

    }

    public ArrayList<LoanApplication> returnPendingLoans() {
        ArrayList<LoanApplication> pending;
        pending = new ArrayList<LoanApplication>((Collection<? extends LoanApplication>) new LoanApplication(
                555555555, 5000, 123, true, false));
        return pending;
    }

    public void addLoan(LoanApplication loan) {
        loanApps.add(loan);
    }

    public void deleteLoan(LoanApplication loan) {

    }
}
