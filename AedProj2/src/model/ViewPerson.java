/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author arpit
 */
public class ViewPerson {
    private ArrayList<Person> logs;
    public ViewPerson(){
    this.logs= new ArrayList<>();
}

    public ArrayList<Person> getLogs() {
        return logs;
    }

    public void setLogs(ArrayList<Person> register) {
        this.logs = logs;
    }
    
    public Person addNewPerson(){
        Person newPerson = new Person();
        logs.add(newPerson);
        return newPerson;
    }
    
    public void deletelogs(Person user){
        logs.remove(user);
    }
}
