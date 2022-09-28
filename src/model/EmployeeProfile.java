/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vigy
 */
public class EmployeeProfile {
    
    private String name ;
    private int employeeId;
    private int age; 
    private String gender ;
    private String startDate ;
    private int level ;
    private String teamInfo ;
    private String positionTitle ;
    //Add photo
    private int cellPhoneNumber;
    private String emailAddress;
    private ContactInfo contactInfo;

    public EmployeeProfile() {
        this.contactInfo = new ContactInfo();
    }
    
    public int getCellPhoneNumber() {
        return contactInfo.getCellPhoneNumber();
    }

    public void setCellPhoneNumber(int cellPhoneNumber) {
        this.contactInfo.setCellPhoneNumber(cellPhoneNumber);
    }

    public String getEmailAddress() {
        return contactInfo.getEmailAddress();
    }

    public void setEmailAddress(String emailAddress) {
        this.contactInfo.setEmailAddress(emailAddress);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTeamInfo() {
        return teamInfo;
    }

    public void setTeamInfo(String teamInfo) {
        this.teamInfo = teamInfo;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }
    
}
