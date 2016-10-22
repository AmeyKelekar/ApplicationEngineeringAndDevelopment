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
public class GiveDirectlyAdmin extends Person {
    private static int count = 100;
    private String giveDirectlyAdminId;
    private String emailId;
    
    public GiveDirectlyAdmin() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("GiveDirectlyAdminId");
        stringBuffer.append(++count);
        giveDirectlyAdminId = stringBuffer.toString();
    }

    public String getGiveDirectlyAdminId() {
        return giveDirectlyAdminId;
    }

    public void setGiveDirectlyAdminId(String giveDirectlyAdminId) {
        this.giveDirectlyAdminId = giveDirectlyAdminId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    @Override
    public String toString() {
        return giveDirectlyAdminId;
    }
}
