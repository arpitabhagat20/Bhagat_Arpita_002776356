/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author arpitabhagat
 */
public class UserLogs {
    private ArrayList<User> userDirectory;

    public UserLogs() {
        this.userDirectory = new ArrayList<User>();
    }

    public ArrayList<User> getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(ArrayList<User> userDirectory) {
        this.userDirectory = userDirectory;
    }
    
    public User addNewUser(){
        User user = new User();
        userDirectory.add(user);
        return user;
        
    }
    
    public void deleteUser(User user)
    {   
        userDirectory.remove(user);
    }
}
