/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author arpitabhagat
 */
public class Doctor extends Person { 
    String personName;
    public Doctor() {
       personName =  this.getPersonName();
    }
    @Override
    public String toString()
    {
           
           return personName;
    }
    
    
}
