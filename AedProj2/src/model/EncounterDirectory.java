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
public class EncounterDirectory {
    private ArrayList<Encounter> encounterLogs;
    public EncounterDirectory() {
    this.encounterLogs = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterLogs() {
        return encounterLogs;
    }

    public void setEncounterLogs(ArrayList<Encounter> encounterDirectory) {
        this.encounterLogs = encounterLogs;
    }
    public Encounter addNewEncounter() {
    Encounter encounter = new Encounter();
    encounterLogs.add(encounter);
    return encounter;
   
    }
}
