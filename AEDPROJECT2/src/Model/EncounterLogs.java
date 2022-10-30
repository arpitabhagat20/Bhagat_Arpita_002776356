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
public class EncounterLogs {
     private ArrayList<Encounter> encounterLogs;
    public EncounterLogs() {
    this.encounterLogs = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterLogs() {
        return encounterLogs;
    }

    public void setEncounterLogs(ArrayList<Encounter> encounterLogs) {
        this.encounterLogs = encounterLogs;
    }
    public Encounter addNewEncounter() {
        Encounter encounter = new Encounter();
    encounterLogs.add(encounter);
    return encounter;
   
    }
    
}

