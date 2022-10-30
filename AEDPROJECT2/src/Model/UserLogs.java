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
    private ArrayList<User> userLogs;

    public UserLogs() {
        this.userLogs = new ArrayList<User>();
    }

    public ArrayList<User> getUserLogs() {
        return userLogs;
    }

    public void setUserLogs(ArrayList<User> userLogs) {
        this.userLogs = userLogs;
    }
    
    public User addNewUser(){
        User user = new User();
        userLogs.add(user);
        return user;
        
    }
    
    public void deleteUser(User user)
    {   
        userLogs.remove(user);
    }
}
