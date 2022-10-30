/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vigy
 */
public class House extends Community{

    private String streetName;
    private int houseNumber;
    private int numberOfPeople;

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public House(String streetName, int houseNumber, int numberOfPeople,String communityName, int pinCode, String landMark,String cityName, String stateName, String country) {
        super(communityName, pinCode, landMark, cityName, stateName, country);
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.numberOfPeople = numberOfPeople;
    }

}
