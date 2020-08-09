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
public class UserList {
    
    ArrayList<User> users;
    
    public UserList() {
        users = new ArrayList<User>();
        users.add(new User("First", "Last", 
                "dummyemail@address.com", "5555555555", "password", 1));
    }
    
    public User search(String term) {
        User temp = null;
        for(int i = 0; i < users.size(); i++) {
           User indexUser = users.get(i);
        if(indexUser.getEmail().compareTo(term) == 0){
            temp = indexUser;
        }
    }
        return temp;
    }
    
    public void addUser(User user) {
        users.add(user);
    }
    
    //--------getters and setters------

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    
}
