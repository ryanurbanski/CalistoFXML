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
public abstract class UserFactory {
    
    public void createNewUser(int type, ArrayList<String> attributes) {
        
        if(type == 1) {
            createNewCustomer(attributes);
        } else {
            createNewEmployee(attributes);
        }
        
    }
    
    public void createNewCustomer(ArrayList<String> attributes) {
        Customer customer = new Customer(attributes.get(0), attributes.get(1),
        attributes.get(2), attributes.get(3), attributes.get(4));
        
        
    }
    
    public void createNewEmployee(ArrayList<String> attributes) {
        Employee employee = new Employee(attributes.get(0), attributes.get(1),
        attributes.get(2), attributes.get(3), attributes.get(4),
        Integer.parseInt( attributes.get(5)));
    }
    
}