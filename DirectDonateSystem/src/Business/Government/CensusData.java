/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Government;

/**
 *
 * @author Amey
 */
public class CensusData {
    private String firstName;
    private String lastName;
    private String country;
    private String region;
    private String address;
    private String nationalID;
    private float incomeAnually;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public float getIncomeAnually() {
        return incomeAnually;
    }

    public void setIncomeAnually(float incomeAnually) {
        this.incomeAnually = incomeAnually;
    }

    @Override
    public String toString() {
        return nationalID;
    }  
}
