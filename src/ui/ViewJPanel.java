/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.EmployeeProfile;
import model.EmployeeProfileHistory;

/**
 *
 * @author vigy
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    EmployeeProfileHistory employeeProfileHistory;
    Image employeeImage;

    public Image getEmployeeImage() {
        return employeeImage;
    }

    public void setEmployeeImage(Image employeeImage) {
        this.employeeImage = employeeImage;
    }
    public ViewJPanel(EmployeeProfileHistory employeeProfileHistory) {
        initComponents();
        this.employeeProfileHistory =  employeeProfileHistory;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createEmployeeLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployeeHistory = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        drpPositionTitle = new javax.swing.JComboBox<>();
        txtAge = new javax.swing.JSpinner();
        drpGender = new javax.swing.JComboBox<>();
        btnPhoto = new javax.swing.JButton();
        photo = new javax.swing.JLabel();
        positionTitle = new javax.swing.JLabel();
        cellPhoneNumber = new javax.swing.JLabel();
        emailAddress = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtCellPhoneNumber = new javax.swing.JTextField();
        txtEmailAddress = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        employeeId = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        startDate = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        teamInfo = new javax.swing.JLabel();
        txtEmployeeId = new javax.swing.JTextField();
        txtStartDate = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(239, 210, 141));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createEmployeeLabel.setBackground(new java.awt.Color(0, 71, 119));
        createEmployeeLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        createEmployeeLabel.setForeground(new java.awt.Color(0, 71, 119));
        createEmployeeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createEmployeeLabel.setText("Edit Employee");
        createEmployeeLabel.setToolTipText("To create new employee");
        add(createEmployeeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 872, 39));

        tblEmployeeHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee Id", "Name", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Cell Phone Number", "Email Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmployeeHistory);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 45, 860, 98));

        btnDelete.setBackground(new java.awt.Color(163, 0, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(716, 149, -1, -1));

        btnRead.setBackground(new java.awt.Color(0, 71, 119));
        btnRead.setForeground(new java.awt.Color(255, 255, 255));
        btnRead.setText("Read");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });
        add(btnRead, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 149, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(255, 119, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 474, -1, -1));

        drpPositionTitle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Intern", "Junior Software Engineer", "Senior Software Engineer", "Team lead", "Project Manager" }));
        drpPositionTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpPositionTitleActionPerformed(evt);
            }
        });
        add(drpPositionTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 306, 249, -1));

        txtAge.setModel(new javax.swing.SpinnerNumberModel(18, 18, 60, 1));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 219, -1, -1));

        drpGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        add(drpGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 248, -1, -1));

        btnPhoto.setBackground(new java.awt.Color(0, 175, 181));
        btnPhoto.setForeground(new java.awt.Color(239, 210, 141));
        btnPhoto.setText("Upload Photo");
        btnPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhotoActionPerformed(evt);
            }
        });
        add(btnPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 382, 197, -1));

        photo.setForeground(new java.awt.Color(0, 71, 119));
        photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo.setText("Upload Employee Photo");
        photo.setSize(new java.awt.Dimension(50, 50));
        add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 230, 197, 149));

        positionTitle.setText("Position Title:");
        add(positionTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 309, -1, -1));

        cellPhoneNumber.setText("Cell Phone Number:");
        add(cellPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 396, -1, -1));

        emailAddress.setText("Email Address:");
        add(emailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 425, -1, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 161, 250, -1));

        txtLevel.setText("1");
        txtLevel.setEnabled(false);
        txtLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLevelActionPerformed(evt);
            }
        });
        add(txtLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 335, 250, -1));

        txtTeamInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeamInfoActionPerformed(evt);
            }
        });
        add(txtTeamInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 364, 250, -1));

        txtCellPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCellPhoneNumberActionPerformed(evt);
            }
        });
        add(txtCellPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 393, 250, -1));

        txtEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddressActionPerformed(evt);
            }
        });
        add(txtEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 422, 250, -1));

        name.setText("Name:");
        add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 164, -1, -1));

        employeeId.setText("Employee Id:");
        add(employeeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 193, -1, -1));

        age.setText("Age:");
        add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 222, -1, -1));

        gender.setText("Gender:");
        add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 251, -1, -1));

        startDate.setText("Start Date:");
        add(startDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 277, -1, -1));

        level.setText("Level:");
        add(level, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 338, -1, -1));

        teamInfo.setText("Team Info:");
        add(teamInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 367, -1, -1));

        txtEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIdActionPerformed(evt);
            }
        });
        add(txtEmployeeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 190, 250, -1));
        add(txtStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 277, 148, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEmployeeHistory.getSelectedRow() ;
        
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        else{
            employeeProfileHistory.deleteEmployee(selectedRow);
            populateTable();
            JOptionPane.showMessageDialog(this, "Employee Deleted");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEmployeeHistory.getSelectedRow() ;
        
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
            return;
        }
        
     EmployeeProfile ep = employeeProfileHistory.getHistory().get(selectedRow);
     
     txtAge.setValue(ep.getAge());
    txtCellPhoneNumber.setText(String.valueOf(ep.getCellPhoneNumber()));
    txtEmailAddress.setText(String.valueOf(ep.getEmailAddress()));
    txtEmployeeId.setText(String.valueOf(ep.getEmployeeId()));
     drpGender.setSelectedItem(String.valueOf(ep.getGender()));
    txtLevel.setText(String.valueOf(ep.getLevel()));
    txtName.setText(String.valueOf(ep.getName()));
    drpPositionTitle.setSelectedItem(String.valueOf(ep.getPositionTitle()));
     txtStartDate.setDate((ep.getStartDate()));
     txtTeamInfo.setText(String.valueOf(ep.getTeamInfo()));  
     photo.setIcon(new ImageIcon(ep.getPhoto()));
    }//GEN-LAST:event_btnReadActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEmployeeHistory.getSelectedRow() ;
        
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
            return;
        }
        
     EmployeeProfile ep = employeeProfileHistory.getHistory().get(selectedRow);
     String name = txtName.getText();
     int employeeId = Integer.parseInt(txtEmployeeId.getText()) ;
     int age = Integer.parseInt(String.valueOf(txtAge.getValue())) ;
     String gender = (String)drpGender.getSelectedItem(); 
     Date startDate = txtStartDate.getDate(); 
     int level = Integer.parseInt(txtLevel.getText()) ;
     String teamInfo = txtTeamInfo.getText() ;
     String positionTitle= (String)drpPositionTitle.getSelectedItem() ;
     Long cellPhoneNumber = Long.parseLong(txtCellPhoneNumber.getText()) ;
     String emailAddress= txtEmailAddress.getText();
     
     
     ep.setName(name);
     ep.setCellPhoneNumber(cellPhoneNumber);
     ep.setEmailAddress(emailAddress);
     ep.setEmployeeId(employeeId);
     ep.setGender(gender);
     ep.setLevel(level);
     ep.setPositionTitle(positionTitle);
     ep.setStartDate(startDate);
     ep.setTeamInfo(teamInfo);
     ep.setAge(age);
     ep.setPhoto(getEmployeeImage());
     employeeProfileHistory.updateEmployee(ep,selectedRow);
     JOptionPane.showMessageDialog(this, "Row is updated!");
     populateTable();
     txtName.setText("");
     txtEmployeeId.setText("");
     txtAge.setValue(18);
     drpGender.setSelectedItem("Male");
     txtStartDate.setDate(null);
     txtLevel.setText("");
     txtTeamInfo.setText("");
     drpPositionTitle.setSelectedItem("Intern");
     txtEmployeeId.setText("");
     txtEmailAddress.setText("");
     txtCellPhoneNumber.setText("");
     photo.setIcon(null);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void drpPositionTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpPositionTitleActionPerformed
        // TODO add your handling code here:
        if(drpPositionTitle.getSelectedItem().toString().equalsIgnoreCase("Intern"))
        txtLevel.setText("1");
        else if(drpPositionTitle.getSelectedItem().toString().equalsIgnoreCase("Junior Software Engineer"))
        txtLevel.setText("2");
        else if(drpPositionTitle.getSelectedItem().toString().equalsIgnoreCase("Senior Software Engineer"))
        txtLevel.setText("3");
        else if(drpPositionTitle.getSelectedItem().toString().equalsIgnoreCase("Team Lead"))
        txtLevel.setText("4");
        else if(drpPositionTitle.getSelectedItem().toString().equalsIgnoreCase("Project Manager"))
        txtLevel.setText("5");
    }//GEN-LAST:event_drpPositionTitleActionPerformed

    private void btnPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhotoActionPerformed
        // TODO add your handling code here:
        JFileChooser fc=new JFileChooser();
        int i=fc.showOpenDialog(this);

        if(i==JFileChooser.APPROVE_OPTION){
            File f=fc.getSelectedFile();
            String filepath = f.getAbsolutePath();
            ImageIcon icon = new ImageIcon(filepath);
            Image img = icon.getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH);
            photo.setIcon(new ImageIcon(img));
            setEmployeeImage(img);
        }
    }//GEN-LAST:event_btnPhotoActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLevelActionPerformed

    private void txtTeamInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeamInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeamInfoActionPerformed

    private void txtCellPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCellPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCellPhoneNumberActionPerformed

    private void txtEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddressActionPerformed

    private void txtEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPhoto;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel cellPhoneNumber;
    private javax.swing.JLabel createEmployeeLabel;
    private javax.swing.JComboBox<String> drpGender;
    private javax.swing.JComboBox<String> drpPositionTitle;
    private javax.swing.JLabel emailAddress;
    private javax.swing.JLabel employeeId;
    private javax.swing.JLabel gender;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel level;
    private javax.swing.JLabel name;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel positionTitle;
    private javax.swing.JLabel startDate;
    private javax.swing.JTable tblEmployeeHistory;
    private javax.swing.JLabel teamInfo;
    private javax.swing.JSpinner txtAge;
    private javax.swing.JTextField txtCellPhoneNumber;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private com.toedter.calendar.JDateChooser txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model =(DefaultTableModel) tblEmployeeHistory.getModel();
        model.setRowCount(0);
        
        for(EmployeeProfile e: employeeProfileHistory.getHistory()){
            Object row[]=new Object[10];
            row[0] = e.getEmployeeId();
            row[1] = e.getName();
            row[2] = e.getAge();
            row[3] = e.getGender();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
            String strDate = dateFormat.format(e.getStartDate()); 
            row[4] = strDate;
            row[5] = e.getLevel();
            row[6] = e.getTeamInfo();
            row[7] = e.getPositionTitle();
            row[8] = e.getCellPhoneNumber();
            row[9] = e.getEmailAddress();
            
            model.addRow(row);
            
        }
    }
}
