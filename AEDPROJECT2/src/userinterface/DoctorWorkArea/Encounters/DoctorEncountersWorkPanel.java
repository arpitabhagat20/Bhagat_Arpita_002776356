/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.DoctorWorkArea.Encounters;
import userinterface.SystemWorkArea.Encounters.*;
import model.DoctorDirectory;
import model.PatientDirectory;


/**
 *
 * @author arpitabhagat
 */
public class DoctorEncountersWorkPanel extends javax.swing.JPanel {

    PatientDirectory patientDirectory;
    DoctorDirectory doctorDirectory;
    String username;
    /**
     * Creates new form SystemPatient
     */
    public DoctorEncountersWorkPanel(String username, PatientDirectory patientDirectory, DoctorDirectory doctorDirectory) {
        initComponents();
        this.patientDirectory = patientDirectory;
        this.doctorDirectory = doctorDirectory;
        this.username = username;      
        
        DoctorViewEncounter doctorViewEncounter = new DoctorViewEncounter(username,patientDirectory);
        splitPane.setRightComponent(doctorViewEncounter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnViewEncounters = new javax.swing.JButton();
        btnCreateEncounter = new javax.swing.JButton();
        btnUpdateEncounter = new javax.swing.JButton();
        patientWorkArea = new javax.swing.JPanel();

        setBackground(new java.awt.Color(160, 132, 202));

        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        controlPanel.setBackground(new java.awt.Color(153, 153, 255));
        controlPanel.setPreferredSize(new java.awt.Dimension(150, 609));
        controlPanel.setVerifyInputWhenFocusTarget(false);

        btnViewEncounters.setText("View Encounters");
        btnViewEncounters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEncountersActionPerformed(evt);
            }
        });

        btnCreateEncounter.setText("Create Encounter");
        btnCreateEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEncounterActionPerformed(evt);
            }
        });

        btnUpdateEncounter.setText("Update Encounter");
        btnUpdateEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEncounterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(btnViewEncounters, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnCreateEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btnUpdateEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreateEncounter, btnUpdateEncounter, btnViewEncounters});

        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnViewEncounters, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreateEncounter, btnViewEncounters});

        splitPane.setLeftComponent(controlPanel);

        patientWorkArea.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout patientWorkAreaLayout = new javax.swing.GroupLayout(patientWorkArea);
        patientWorkArea.setLayout(patientWorkAreaLayout);
        patientWorkAreaLayout.setHorizontalGroup(
            patientWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        patientWorkAreaLayout.setVerticalGroup(
            patientWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(patientWorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEncounterActionPerformed
        // TODO add your handling code here:
        DoctorCreateEncounter doctorCreateEncounter = new DoctorCreateEncounter(username,patientDirectory, doctorDirectory);
        splitPane.setRightComponent(doctorCreateEncounter);
    }//GEN-LAST:event_btnCreateEncounterActionPerformed

    private void btnViewEncountersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEncountersActionPerformed
        // TODO add your handling code here:
        DoctorViewEncounter doctorViewEncounter = new DoctorViewEncounter(username,patientDirectory);
        splitPane.setRightComponent(doctorViewEncounter );
    }//GEN-LAST:event_btnViewEncountersActionPerformed

    private void btnUpdateEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEncounterActionPerformed
        // TODO add your handling code here:
        DoctorUpdateEncounter doctorUpdateEncounter = new DoctorUpdateEncounter(username,patientDirectory,doctorDirectory);
        splitPane.setRightComponent(doctorUpdateEncounter);
    }//GEN-LAST:event_btnUpdateEncounterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateEncounter;
    private javax.swing.JButton btnUpdateEncounter;
    private javax.swing.JButton btnViewEncounters;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel patientWorkArea;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
