/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author arpitabhagat
 * 
 */
public class DoctorDirectory {
    private ArrayList<Doctor> doctorLogs;
    public DoctorDirectory() {
    this.doctorLogs= new ArrayList<Doctor>();
    
    }

    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorLogs;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorLogs) {
        this.doctorLogs = doctorLogs;
    }
    
    public Doctor addNewDoctor(){
        Doctor doctor = new Doctor();
        doctorLogs.add(doctor);
        return doctor;
    }
    
    public void deleteDoctor(Doctor doctor)
    {   
        doctorLogs.remove(doctor);
    }
    
}
