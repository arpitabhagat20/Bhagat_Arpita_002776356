/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author arpitabhagat
 */
public class PatientDirectory {
    private ArrayList<Patient> patientLogs;
    public PatientDirectory() {
    this.patientLogs= new ArrayList<Patient>();
    
    }

    public ArrayList<Patient> getPatientLogs() {
        return patientLogs;
    }

    public void setPatientLogs(ArrayList<Patient> patientLogs) {
        this.patientLogs = patientLogs;
    }
    
    public Patient addNewPatient(){
        Patient patient = new Patient();
        patientLogs.add(patient);
        return patient;
    }
    
    public void deletePatient(Patient patient)
    {   
        patientLogs.remove(patient);
    }
    
}
