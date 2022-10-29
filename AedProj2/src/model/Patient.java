/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author arpitabhagat
 */
class Patient extends Person{
    VitalSigns vitalSigns;
    Encounter enocunter;

    public Patient(VitalSigns vitalSigns, Encounter enocunter) {
        this.vitalSigns = vitalSigns;
        this.enocunter = enocunter;
    }

    public Patient() {
    }
    
    //Patient a= new Patient();
    //int c = a.getHeight();
    
}
