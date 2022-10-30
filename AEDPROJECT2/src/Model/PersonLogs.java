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
public class PersonLogs {
    private ArrayList<Person> personLogs;
    public PersonLogs() {
    this.personLogs = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonLogs() {
        return personLogs;
    }

    public void setPersonLogs(ArrayList<Person> personLogs) {
        this.personLogs = personLogs;
    }
    
    public Person addNewPerson(){
        Person person = new Person();
        personLogs.add(person);
        return person;
    }
    
    public void deletePerson(Person person)
    {   
        personLogs.remove(person);
    }
    public Person updatePerson(int i)
    {   
        Person person = new Person();
        personLogs.set(i, person);
        return person;
    }
}
