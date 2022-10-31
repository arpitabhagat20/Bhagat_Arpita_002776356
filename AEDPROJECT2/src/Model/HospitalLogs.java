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
public class HospitalLogs {
    private ArrayList<Hospital> hospitalLogs;
    public HospitalLogs() {
    this.hospitalLogs = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalLogs;
    }

    public void setHospitalLogs(ArrayList<Hospital> hospitalLogs) {
        this.hospitalLogs = hospitalLogs;
    }
    public Hospital addNewHospital() {
        Hospital encounter = new Hospital();
    hospitalLogs.add(encounter);
    return encounter;
   
    }
    
}
