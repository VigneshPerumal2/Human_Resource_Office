/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author vigy
 */
public class PatientDirectory {
    private ArrayList<Patient> history;

    public PatientDirectory() {
        this.history = new ArrayList<Patient>();
        
    }   

    public ArrayList<Patient> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Patient> history) {
        this.history = history;
    }
    
    public Patient addNewEmployee(Patient patient){
        System.out.println("Employee Added->"+patient);
        history.add(patient); 
        return patient;
    }
    
    public void deleteEmployee(int index){
        history.remove(index);
    }
    
    public void updateEmployee(Patient ep,int index){
        history.set(index,ep);
    }
    public void deleteAll(){
    history.removeAll(history);
    }
    @Override
    public String toString() {
        return "EmployeeProfileHistory{" + "history=" + history + '}';
    }
}