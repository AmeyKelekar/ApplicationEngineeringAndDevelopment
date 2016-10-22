/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author Amey
 */
public class Donor extends Person{
    private String emailId;
    private String donorId;
    private int amountDonated;
    private static int count = 100;
    
    public Donor() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Donor");
        stringBuffer.append(++count);
        donorId = stringBuffer.toString();
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getDonorId() {
        return donorId;
    }

    public void setDonorId(String donorId) {
        this.donorId = donorId;
    }

    public int getAmountDonated() {
        return amountDonated;
    }

    public void setAmountDonated(int amountDonated) {
        this.amountDonated = amountDonated;
    } 
    
    @Override
    public String toString() {
        return getFirstName();
    }
}