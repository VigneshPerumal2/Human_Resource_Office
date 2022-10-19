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
public class DoctorDirectory {
    private ArrayList<Doctor> history;

    public DoctorDirectory() {
        this.history = new ArrayList<Doctor>();
        
    }   

    public ArrayList<Doctor> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Doctor> history) {
        this.history = history;
    }
    
    public Doctor addNewEmployee(Doctor patient){
        System.out.println("Employee Added->"+patient);
        history.add(patient); 
        return patient;
    }
    
    public void deleteEmployee(int index){
        history.remove(index);
    }
    
    public void updateEmployee(Doctor ep,int index){
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
