/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Community;
import model.CommunityDirectory;
import model.Doctor;
import model.DoctorDirectory;
import model.Encounter;
import model.EncounterDirectory;
import model.Patient;
import model.PatientDirectory;
import model.VitalSigns;

/**
 *
 * @author vigy
 */
public class PatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientJPanel
     */
    
    private PatientDirectory patientDirectory;
    private DoctorDirectory doctorDirectory;
    private CommunityDirectory communityDirectory;
    private EncounterDirectory encounterDirectory;
    
    private Patient currentPatient;
    private Doctor selectedDoctor;
    private ArrayList<Doctor> doctorList = new ArrayList<>();
    
    public PatientJPanel(PatientDirectory patientDirectory,DoctorDirectory doctorDirectory,CommunityDirectory communityDirectory,EncounterDirectory encounterDirectory,String username) {
        initComponents();
        this.patientDirectory=patientDirectory;
        this.doctorDirectory=doctorDirectory;
        this.communityDirectory=communityDirectory;
        this.encounterDirectory=encounterDirectory;
        
        this.currentPatient = patientDirectory.search(username);
        
        for(Community c:communityDirectory.getHistory()){
            drpCommunityName.addItem(String.valueOf(c.getCommunityName()));
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        patientTabs = new javax.swing.JTabbedPane();
        tabDoctor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        drpCommunityName = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        drpDoctorName = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDate = new com.toedter.calendar.JDateChooser();
        btnBook = new javax.swing.JButton();
        tabEncounters = new javax.swing.JPanel();
        splitPaneCommunity = new javax.swing.JSplitPane();
        splitNavigation1 = new javax.swing.JPanel();
        btnCreateCommunity = new javax.swing.JButton();
        splitWorkspace1 = new javax.swing.JPanel();
        tabDetails = new javax.swing.JPanel();
        splitPaneHouse = new javax.swing.JSplitPane();
        splitNavigation2 = new javax.swing.JPanel();
        btnCreateHouse = new javax.swing.JButton();
        splitWorkspace2 = new javax.swing.JPanel();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Dashbaord");

        patientTabs.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N

        jLabel2.setText("Select a community :");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel3.setText("Step 1:");

        drpCommunityName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        drpCommunityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpCommunityNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel4.setText("Step 2:");

        jLabel5.setText("Select a Doctor :");

        drpDoctorName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        drpDoctorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpDoctorNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel6.setText("Doctor Details");

        jLabel7.setText("Choose a date:");

        btnBook.setText("Book");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabDoctorLayout = new javax.swing.GroupLayout(tabDoctor);
        tabDoctor.setLayout(tabDoctorLayout);
        tabDoctorLayout.setHorizontalGroup(
            tabDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDoctorLayout.createSequentialGroup()
                .addGroup(tabDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabDoctorLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel7)
                        .addGap(29, 29, 29)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabDoctorLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(tabDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(tabDoctorLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel5))
                            .addGroup(tabDoctorLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2)))
                        .addGap(27, 27, 27)
                        .addGroup(tabDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(drpCommunityName, 0, 279, Short.MAX_VALUE)
                            .addComponent(drpDoctorName, 0, 279, Short.MAX_VALUE)
                            .addComponent(jLabel6)))
                    .addGroup(tabDoctorLayout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(btnBook)))
                .addContainerGap(386, Short.MAX_VALUE))
        );
        tabDoctorLayout.setVerticalGroup(
            tabDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDoctorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(tabDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(drpCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(tabDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(drpDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(tabDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(btnBook)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        patientTabs.addTab("Doctors", tabDoctor);

        btnCreateCommunity.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        btnCreateCommunity.setText("Read Encounters");
        btnCreateCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCommunityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout splitNavigation1Layout = new javax.swing.GroupLayout(splitNavigation1);
        splitNavigation1.setLayout(splitNavigation1Layout);
        splitNavigation1Layout.setHorizontalGroup(
            splitNavigation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigation1Layout.createSequentialGroup()
                .addComponent(btnCreateCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        splitNavigation1Layout.setVerticalGroup(
            splitNavigation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigation1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(btnCreateCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        splitPaneCommunity.setLeftComponent(splitNavigation1);

        splitWorkspace1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout splitWorkspace1Layout = new javax.swing.GroupLayout(splitWorkspace1);
        splitWorkspace1.setLayout(splitWorkspace1Layout);
        splitWorkspace1Layout.setHorizontalGroup(
            splitWorkspace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
        );
        splitWorkspace1Layout.setVerticalGroup(
            splitWorkspace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );

        splitPaneCommunity.setRightComponent(splitWorkspace1);

        javax.swing.GroupLayout tabEncountersLayout = new javax.swing.GroupLayout(tabEncounters);
        tabEncounters.setLayout(tabEncountersLayout);
        tabEncountersLayout.setHorizontalGroup(
            tabEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabEncountersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneCommunity)
                .addContainerGap())
        );
        tabEncountersLayout.setVerticalGroup(
            tabEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabEncountersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneCommunity)
                .addContainerGap())
        );

        patientTabs.addTab("Encounters", tabEncounters);

        btnCreateHouse.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        btnCreateHouse.setText("Search ");
        btnCreateHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHouseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout splitNavigation2Layout = new javax.swing.GroupLayout(splitNavigation2);
        splitNavigation2.setLayout(splitNavigation2Layout);
        splitNavigation2Layout.setHorizontalGroup(
            splitNavigation2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigation2Layout.createSequentialGroup()
                .addComponent(btnCreateHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        splitNavigation2Layout.setVerticalGroup(
            splitNavigation2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigation2Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(btnCreateHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        splitPaneHouse.setLeftComponent(splitNavigation2);

        splitWorkspace2.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout splitWorkspace2Layout = new javax.swing.GroupLayout(splitWorkspace2);
        splitWorkspace2.setLayout(splitWorkspace2Layout);
        splitWorkspace2Layout.setHorizontalGroup(
            splitWorkspace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 832, Short.MAX_VALUE)
        );
        splitWorkspace2Layout.setVerticalGroup(
            splitWorkspace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );

        splitPaneHouse.setRightComponent(splitWorkspace2);

        javax.swing.GroupLayout tabDetailsLayout = new javax.swing.GroupLayout(tabDetails);
        tabDetails.setLayout(tabDetailsLayout);
        tabDetailsLayout.setHorizontalGroup(
            tabDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneHouse)
                .addContainerGap())
        );
        tabDetailsLayout.setVerticalGroup(
            tabDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneHouse)
                .addContainerGap())
        );

        patientTabs.addTab("Details", tabDetails);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(patientTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(patientTabs))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1004, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCommunityActionPerformed
        // TODO add your handling code here:
        //        CreateDoctorJPanel createDoctorJPanel= new CreateDoctorJPanel(doctorDirectory);
        //        splitPaneCommunity.setRightComponent(createDoctorJPanel);
//        CreateCommunityJPanel createCommunityJPanel = new CreateCommunityJPanel(communityDirectory);
//        splitPaneCommunity.setRightComponent(createCommunityJPanel);
    }//GEN-LAST:event_btnCreateCommunityActionPerformed

    private void btnCreateHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHouseActionPerformed
        // TODO add your handling code here:
        //        CreateHospitalJPanel createHospitalJPanel= new CreateHospitalJPanel(hospitalDirectory);
        //        splitPaneHouse.setRightComponent(createHospitalJPanel);
//        CreateHouseJPanel createHouseJPanel = new CreateHouseJPanel(houseDirectory);
//        splitPaneHouse.setRightComponent(createHouseJPanel);
    }//GEN-LAST:event_btnCreateHouseActionPerformed

    private void drpDoctorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpDoctorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drpDoctorNameActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        
        String communityName = (String) drpCommunityName.getSelectedItem();
        String doctorName = (String) drpDoctorName.getSelectedItem();
        Date date = txtDate.getDate();
        
        Encounter encounter = new Encounter(date, new VitalSigns(), currentPatient, this.selectedDoctor);
        encounterDirectory.add(encounter);
        
        JOptionPane.showMessageDialog(this,"Added a new Encounter for "+ this.selectedDoctor.getName()+" with "+currentPatient.getName());
        
        
    }//GEN-LAST:event_btnBookActionPerformed

    private void drpCommunityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpCommunityNameActionPerformed
        // TODO add your handling code here:
        drpDoctorName.removeAllItems();
        String communityName = (String) drpCommunityName.getSelectedItem();
        for(Doctor c:doctorDirectory.getHistory()){
            if(c.getCommunity().getCommunityName().equals(communityName)){
                drpDoctorName.addItem(String.valueOf(c.getName()));
                this.selectedDoctor = c;
            }
            
        }
    }//GEN-LAST:event_drpCommunityNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnCreateCommunity;
    private javax.swing.JButton btnCreateHouse;
    private javax.swing.JComboBox<String> drpCommunityName;
    private javax.swing.JComboBox<String> drpDoctorName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane patientTabs;
    private javax.swing.JPanel splitNavigation1;
    private javax.swing.JPanel splitNavigation2;
    private javax.swing.JSplitPane splitPaneCommunity;
    private javax.swing.JSplitPane splitPaneHouse;
    private javax.swing.JPanel splitWorkspace1;
    private javax.swing.JPanel splitWorkspace2;
    private javax.swing.JPanel tabDetails;
    private javax.swing.JPanel tabDoctor;
    private javax.swing.JPanel tabEncounters;
    private com.toedter.calendar.JDateChooser txtDate;
    // End of variables declaration//GEN-END:variables
}
