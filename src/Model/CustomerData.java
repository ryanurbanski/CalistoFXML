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
    }
    
    public Customer search(String term) {
        Customer temp = new Customer("First", "Last", 
                "dummyemail@address.com", "5555555555", "password");
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
