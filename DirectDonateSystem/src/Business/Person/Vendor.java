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
public class Vendor extends Person{
    private String vendorId;
    private String emailId;
    private static int count = 100;
    
    public Vendor() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Vendor");
        stringBuffer.append(++count);
        vendorId = stringBuffer.toString();
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    @Override
    public String toString() {
        return getFirstName();
    }
}
