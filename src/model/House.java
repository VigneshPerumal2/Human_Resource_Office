/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vigy
 */
public class House extends Community {
    
    private String houseName;
    private int numberOfPeople;

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public House(String houseName, int numberOfPeople, String communityName, String cityName) {
        super(communityName, cityName);
        this.houseName = houseName;
        this.numberOfPeople = numberOfPeople;
    }
    
    
    
}
