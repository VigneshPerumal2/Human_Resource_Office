/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Admin;
import model.DoctorDirectory;
import model.EmployeeProfileHistory;
import model.PatientDirectory;

/**
 *
 * @author vigy
 */
public class MainJFrame extends javax.swing.JFrame {
    
    
    private EmployeeProfileHistory employeeProfileHistory;
    private PatientDirectory patientDirectory;
    private DoctorDirectory doctorDirectory;
    
    private Admin systemAdmin;
    private Admin hospitalAdmin;
    private Admin communityAdmin;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        employeeProfileHistory = new EmployeeProfileHistory();
        patientDirectory= new PatientDirectory();
        doctorDirectory= new DoctorDirectory();
        
        systemAdmin = new Admin("System", "SystemAdmin",  22,  "Male",  "asd@gmail.com",  123123,  "sysadmin",  "sysadmin");
        hospitalAdmin = new Admin("Hospital", "HospitalAdmin",  22,  "Male",  "asd@gmail.com",  123123,  "hosadmin",  "hosadmin");
        communityAdmin = new Admin("Community", "CommunityAdmin",  22,  "Male",  "asd@gmail.com",  123123,  "comadmin",  "comadmin");

        
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
        btnCreateEmployee = new javax.swing.JButton();
        btnEditEmployee = new javax.swing.JButton();
        btnSearchEmployee = new javax.swing.JButton();
        workspacePanel = new javax.swing.JPanel();
        labelHospitalManagementSystem = new javax.swing.JLabel();
        labelHospitalManagementSystem1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        labelHospitalManagementSystem2 = new javax.swing.JLabel();
        labelHospitalManagementSystem3 = new javax.swing.JLabel();
        cmbLoginType = new javax.swing.JComboBox<>();
        labelHospitalManagementSystem4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlPanel.setBackground(new java.awt.Color(0, 71, 119));
        controlPanel.setForeground(new java.awt.Color(51, 51, 255));

        btnCreateEmployee.setText("Create Employee");
        btnCreateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEmployeeActionPerformed(evt);
            }
        });

        btnEditEmployee.setText("Edit Employee");
        btnEditEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditEmployeeActionPerformed(evt);
            }
        });

        btnSearchEmployee.setText("Search Employee");
        btnSearchEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreateEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearchEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(btnCreateEmployee)
                .addGap(18, 18, 18)
                .addComponent(btnEditEmployee)
                .addGap(18, 18, 18)
                .addComponent(btnSearchEmployee)
                .addContainerGap(509, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlPanel);

        workspacePanel.setBackground(new java.awt.Color(239, 210, 141));

        labelHospitalManagementSystem.setBackground(new java.awt.Color(153, 153, 153));
        labelHospitalManagementSystem.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        labelHospitalManagementSystem.setForeground(new java.awt.Color(0, 71, 119));
        labelHospitalManagementSystem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHospitalManagementSystem.setText("Please enter the login credentials");
        labelHospitalManagementSystem.setToolTipText("To create new employee");

        labelHospitalManagementSystem1.setBackground(new java.awt.Color(153, 153, 153));
        labelHospitalManagementSystem1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        labelHospitalManagementSystem1.setForeground(new java.awt.Color(0, 71, 119));
        labelHospitalManagementSystem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHospitalManagementSystem1.setText("Hospital Management System");
        labelHospitalManagementSystem1.setToolTipText("To create new employee");

        txtPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtUserName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        labelHospitalManagementSystem2.setBackground(new java.awt.Color(153, 153, 153));
        labelHospitalManagementSystem2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        labelHospitalManagementSystem2.setForeground(new java.awt.Color(0, 71, 119));
        labelHospitalManagementSystem2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHospitalManagementSystem2.setText("Login As :");
        labelHospitalManagementSystem2.setToolTipText("To create new employee");

        labelHospitalManagementSystem3.setBackground(new java.awt.Color(153, 153, 153));
        labelHospitalManagementSystem3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        labelHospitalManagementSystem3.setForeground(new java.awt.Color(0, 71, 119));
        labelHospitalManagementSystem3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHospitalManagementSystem3.setText("User Name :");
        labelHospitalManagementSystem3.setToolTipText("To create new employee");

        cmbLoginType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System", "Hospital", "Community" }));

        labelHospitalManagementSystem4.setBackground(new java.awt.Color(153, 153, 153));
        labelHospitalManagementSystem4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        labelHospitalManagementSystem4.setForeground(new java.awt.Color(0, 71, 119));
        labelHospitalManagementSystem4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHospitalManagementSystem4.setText("Password :");
        labelHospitalManagementSystem4.setToolTipText("To create new employee");

        btnLogin.setBackground(new java.awt.Color(0, 71, 119));
        btnLogin.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout workspacePanelLayout = new javax.swing.GroupLayout(workspacePanel);
        workspacePanel.setLayout(workspacePanelLayout);
        workspacePanelLayout.setHorizontalGroup(
            workspacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workspacePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(workspacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workspacePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(workspacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workspacePanelLayout.createSequentialGroup()
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(494, 494, 494))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workspacePanelLayout.createSequentialGroup()
                                .addGroup(workspacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(workspacePanelLayout.createSequentialGroup()
                                        .addComponent(labelHospitalManagementSystem3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workspacePanelLayout.createSequentialGroup()
                                        .addGroup(workspacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelHospitalManagementSystem2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelHospitalManagementSystem4, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(workspacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbLoginType, 0, 284, Short.MAX_VALUE)
                                            .addComponent(txtPassword)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workspacePanelLayout.createSequentialGroup()
                                        .addComponent(labelHospitalManagementSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(165, 165, 165)))
                                .addGap(332, 332, 332))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workspacePanelLayout.createSequentialGroup()
                        .addComponent(labelHospitalManagementSystem1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        workspacePanelLayout.setVerticalGroup(
            workspacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workspacePanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(labelHospitalManagementSystem1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(labelHospitalManagementSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(workspacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHospitalManagementSystem3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(workspacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHospitalManagementSystem4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(workspacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLoginType, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHospitalManagementSystem2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(397, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(workspacePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEmployeeActionPerformed
        // TODO add your handling code here:
        
        CreateJPanel createJPanel= new CreateJPanel(employeeProfileHistory);
        splitPane.setRightComponent(createJPanel);
      

    }//GEN-LAST:event_btnCreateEmployeeActionPerformed

    private void btnEditEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditEmployeeActionPerformed
        // TODO add your handling code here:
        ViewJPanel viewJPanel = new ViewJPanel(employeeProfileHistory);
        splitPane.setRightComponent(viewJPanel);
    }//GEN-LAST:event_btnEditEmployeeActionPerformed

    private void btnSearchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEmployeeActionPerformed
        // TODO add your handling code here:
        //SearchJPanel viewJPanel = new SearchJPanel(employeeProfileHistory);
        SearchJPanel searchJPanel = new SearchJPanel(employeeProfileHistory);
        splitPane.setRightComponent(searchJPanel);
    }//GEN-LAST:event_btnSearchEmployeeActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String username = txtUserName.getText();
        String password = txtPassword.getText();
        String role = (String)cmbLoginType.getSelectedItem();
        
        System.out.println(username + password + role);
        
        if(systemAdmin.getUserName().equals(username) && systemAdmin.getPassword().equals(password) && role.equals("System") ){
            JOptionPane.showMessageDialog(this,"Logged in as System Admin");
            AdminDashboardJPanel adminDashboardJPanel = new AdminDashboardJPanel(patientDirectory,doctorDirectory);
            splitPane.setRightComponent(adminDashboardJPanel);
        }
        
        else if(hospitalAdmin.getUserName().equals(username) && hospitalAdmin.getPassword().equals(password) && role.equals("Hospital") ){
            JOptionPane.showMessageDialog(this,"Logged in as Hospital Admin");
        }
        
        else if(communityAdmin.getUserName().equals(username) && communityAdmin.getPassword().equals(password) && role.equals("Community") ){
            JOptionPane.showMessageDialog(this,"Logged in as Community Admin");
        }
        
        
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateEmployee;
    private javax.swing.JButton btnEditEmployee;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSearchEmployee;
    private javax.swing.JComboBox<String> cmbLoginType;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel labelHospitalManagementSystem;
    private javax.swing.JLabel labelHospitalManagementSystem1;
    private javax.swing.JLabel labelHospitalManagementSystem2;
    private javax.swing.JLabel labelHospitalManagementSystem3;
    private javax.swing.JLabel labelHospitalManagementSystem4;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JPanel workspacePanel;
    // End of variables declaration//GEN-END:variables
}
