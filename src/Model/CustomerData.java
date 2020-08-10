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
public class CustomerData {
    ArrayList<Customer> customers;
    
    public CustomerData() {
        customers = new ArrayList<Customer>();

        ArrayList<LoanApplication> loanApplications = new ArrayList<LoanApplication>();
        Customer temp = new Customer("First", "Last",
                "email@email.com", "555-555-5555", "password", 0.00, loanApplications);

        customers.add(temp);
    }
    
    public Customer search(String term) {
        ArrayList<LoanApplication> loanApplications = new ArrayList<LoanApplication>();

        Customer temp = new Customer("First", "Last", 
                "email@email.com", "5555555555", "password", 0.00, loanApplications);
        return temp;
    }
    
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    
    // getters and setters

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
    
    
}
