/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author arpitabhagat
 */
public class Encounter {
    VitalSigns vitalSigns;
    Doctor doctor;
    String userName;
 
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
    
    public Encounter() {
        vitalSigns = new VitalSigns();
        doctor = new Doctor();
    }

    @Override
    public String toString() {
        return doctor.getUserName();
    }

  

    
}
