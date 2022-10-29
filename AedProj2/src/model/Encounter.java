/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author arpitabhagat
 */
public class Encounter {
    Patient patient;
    VitalSigns vitalSigns;
    public Encounter(Patient patient) {
        this.patient = patient;
        
    }

    public Encounter() {
    }
}
