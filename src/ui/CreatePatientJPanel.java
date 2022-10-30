/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.House;
import model.HouseDirectory;
import model.Patient;
import model.PatientDirectory;

/**
 *
 * @author vigy
 */
public class CreatePatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePatientJPanel
     */
    
    PatientDirectory patientDirectory ;
    HouseDirectory houseDirectory;
    
    public CreatePatientJPanel(PatientDirectory patientDirectory,HouseDirectory houseDirectory) {
        initComponents();
        this.patientDirectory=patientDirectory;
        this.houseDirectory=houseDirectory;
        
        for(House h:houseDirectory.getHistory()){
            drpHouse.addItem(String.valueOf(h.getStreetName()));
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

        splitWorkspace = new javax.swing.JPanel();
        employeeId = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        txtAge = new javax.swing.JSpinner();
        txtName = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        gender = new javax.swing.JLabel();
        emailAddress = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        createEmployeeLabel = new javax.swing.JLabel();
        txtCellPhoneNumber = new javax.swing.JTextField();
        drpGender = new javax.swing.JComboBox<>();
        age = new javax.swing.JLabel();
        cellPhoneNumber = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        employeeId1 = new javax.swing.JLabel();
        txtDisease = new javax.swing.JTextField();
        emailAddress1 = new javax.swing.JLabel();
        emailAddress2 = new javax.swing.JLabel();
        drpHouse = new javax.swing.JComboBox<>();

        splitWorkspace.setBackground(new java.awt.Color(204, 204, 255));

        employeeId.setText("Username:");

        save.setBackground(new java.awt.Color(255, 119, 0));
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Register");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        txtAge.setModel(new javax.swing.SpinnerNumberModel(18, 18, 60, 1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        name.setText("Name:");

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        gender.setText("Gender:");

        emailAddress.setText("Email Address:");

        txtEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddressActionPerformed(evt);
            }
        });

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        createEmployeeLabel.setBackground(new java.awt.Color(153, 153, 153));
        createEmployeeLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        createEmployeeLabel.setForeground(new java.awt.Color(0, 71, 119));
        createEmployeeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createEmployeeLabel.setText("Create Patient");
        createEmployeeLabel.setToolTipText("To create new employee");

        txtCellPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCellPhoneNumberActionPerformed(evt);
            }
        });

        drpGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        age.setText("Age:");

        cellPhoneNumber.setText("Cell Phone Number:");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        employeeId1.setText("Password:");

        txtDisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiseaseActionPerformed(evt);
            }
        });

        emailAddress1.setText("Disease:");

        emailAddress2.setText("Choose a house:");

        javax.swing.GroupLayout splitWorkspaceLayout = new javax.swing.GroupLayout(splitWorkspace);
        splitWorkspace.setLayout(splitWorkspaceLayout);
        splitWorkspaceLayout.setHorizontalGroup(
            splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                .addComponent(emailAddress)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                .addComponent(cellPhoneNumber)
                                .addGap(18, 18, 18)
                                .addComponent(txtCellPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                .addComponent(employeeId1)
                                .addGap(18, 18, 18)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(emailAddress1)
                                    .addComponent(reset)
                                    .addComponent(emailAddress2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDisease, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(drpHouse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                .addComponent(age)
                                .addGap(18, 18, 18)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
                            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                .addComponent(gender)
                                .addGap(18, 18, 18)
                                .addComponent(drpGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(472, Short.MAX_VALUE))
            .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(splitWorkspaceLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(createEmployeeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(splitWorkspaceLayout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(employeeId, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(18, 18, 18)
                            .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 471, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        splitWorkspaceLayout.setVerticalGroup(
            splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeId1)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender)
                    .addComponent(drpGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cellPhoneNumber)
                    .addComponent(txtCellPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(emailAddress)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(emailAddress1)
                    .addComponent(txtDisease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailAddress2)
                    .addComponent(drpHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(reset))
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(splitWorkspaceLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(createEmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(name)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(employeeId)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(453, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 894, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(splitWorkspace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(splitWorkspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:

        //Reset validation
        //        valName.setText("");
        //        valEmployeeId.setText("");
        //        valDate.setText("");
        //        valTeamInfo.setText("");
        //        valCellPhoneNumber.setText("");
        //        valEmailAddress.setText("");
        //        valPhoto.setText("");
        //        if(validation()){
            String name = txtName.getText();
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            int age = Integer.parseInt(txtAge.getValue().toString());
            String gender = (String) drpGender.getSelectedItem();
            long cellPhoneNumber = Long.parseLong(txtCellPhoneNumber.getText());
            String emailAddress = txtEmailAddress.getText();
            String disease = txtDisease.getText();
            House house = houseDirectory.search(String.valueOf(drpHouse.getSelectedItem()));

            Patient p = new Patient(disease, house,name, age, gender, emailAddress, cellPhoneNumber, username, password);

            patientDirectory.add(p);
            JOptionPane.showMessageDialog(this, "New Patient Details was created ! ");
            txtName.setText("");
            txtUsername.setText("");
            txtAge.setValue(18);
            drpGender.setSelectedItem("Male");
            txtUsername.setText("");
            txtEmailAddress.setText("");
            txtCellPhoneNumber.setText("");
            txtUsername.setText("");
            txtPassword.setText("");
            txtDisease.setText("");
            drpHouse.setSelectedIndex(0);
            //    }
    }//GEN-LAST:event_saveActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        txtName.setText("");
        txtUsername.setText("");
        txtAge.setValue(18);
        drpGender.setSelectedItem("Male");
        txtUsername.setText("");
        txtEmailAddress.setText("");
        txtCellPhoneNumber.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtDisease.setText("");
        //Reset validation
        //        valName.setText("");
        //        valEmployeeId.setText("");
        //        valDate.setText("");
        //        valTeamInfo.setText("");
        //        valCellPhoneNumber.setText("");
        //        valEmailAddress.setText("");
        //        valPhoto.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void txtEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddressActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtCellPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCellPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCellPhoneNumberActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiseaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiseaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel cellPhoneNumber;
    private javax.swing.JLabel createEmployeeLabel;
    private javax.swing.JComboBox<String> drpGender;
    private javax.swing.JComboBox<String> drpHouse;
    private javax.swing.JLabel emailAddress;
    private javax.swing.JLabel emailAddress1;
    private javax.swing.JLabel emailAddress2;
    private javax.swing.JLabel employeeId;
    private javax.swing.JLabel employeeId1;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel name;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JPanel splitWorkspace;
    private javax.swing.JSpinner txtAge;
    private javax.swing.JTextField txtCellPhoneNumber;
    private javax.swing.JTextField txtDisease;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
