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
public class DoctorLogs {
    private ArrayList<Doctor> doctorLogs;
    public DoctorLogs() {
    this.doctorLogs = new ArrayList<Doctor>();
    
    }

    public ArrayList<Doctor> getDoctorLogs() {
        return doctorLogs;
    }

    public void setDoctorLogs(ArrayList<Doctor> doctorLogs) {
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
