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
public class EmployeeData {
    
    ArrayList<Employee> employees;
    
    public EmployeeData(){
        employees = new ArrayList<Employee>();
    }
    
    public Employee search(String term) {
        Employee temp = null;
        
        return temp;
    }
    
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    
    // getters and setters

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    
}
