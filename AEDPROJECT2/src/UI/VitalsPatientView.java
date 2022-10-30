/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.DoctorLogs;
import Model.Encounter;
import Model.EncounterLogs;
import Model.PersonLogs;
import Model.UserLogs;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arpit
 */
public class VitalsPatientView extends javax.swing.JPanel {

    /**
     * Creates new form VitalsPatientView
     */
    PersonLogs logs;
    UserLogs userLogs;
    JSplitPane jSplitPane1;
    String userName;
    DoctorLogs doctorLogs;
    EncounterLogs encounterLogs;
    String role;
    
    public VitalsPatientView(PersonLogs logs,UserLogs userLogs, JSplitPane jSplitPane1,String userName,String role,DoctorLogs doctorLogs,EncounterLogs encounterLogs) {
        initComponents();
        this.logs = logs;
        this.userLogs = userLogs;
        this.jSplitPane1 = jSplitPane1;
        this.userName = userName;
        this.doctorLogs = doctorLogs;
        this.encounterLogs= encounterLogs;
        this.role = role;
        
        populateEncounterTable();{
        DefaultTableModel model = (DefaultTableModel) tblViewPateintView.getModel();
         model.setRowCount(0);
        for (Encounter eh : encounterLogs.getEncounterLogs())
        {
        Object[] row = new Object[6];
        row[0] = eh.getDoctor().getUserName();
        row[1] = eh.getVitalSigns().getBloodPressure();
        row[2] = eh.getVitalSigns().getBodyTemperature();
        row[3] = eh.getVitalSigns().getPulseRate();
        row[4] = eh.getVitalSigns().getRespirationRate();
        row[5] = eh.getEncounterDate();
        if(eh.getPatient().getUserName().equals(userName)){
        model.addRow(row);
        }
    }
    }
   }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewPateintView = new javax.swing.JTable();
        patientVitals = new javax.swing.JLabel();

        tblViewPateintView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DOCTOR", "BLOOD PRESSURE", "BODY TEMPERATURE", "PULSE RATE", "RESPERATORY RATE", "DATE & TIME"
            }
        ));
        jScrollPane1.setViewportView(tblViewPateintView);

        patientVitals.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        patientVitals.setText("PATIENT VITALS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(patientVitals)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(patientVitals)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel patientVitals;
    private javax.swing.JTable tblViewPateintView;
    // End of variables declaration//GEN-END:variables

    private void populateEncounterTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
