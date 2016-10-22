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
public class GovernmentAdmin extends Person {
    private static int count = 100;
    private String governmentAdminId;
    private String emailId;
    
    public GovernmentAdmin() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("GovernmentAdminId");
        stringBuffer.append(++count);
        governmentAdminId = stringBuffer.toString();
    }

    public String getGovernmentAdminId() {
        return governmentAdminId;
    }

    public void setGovernmentAdminId(String governmentAdminId) {
        this.governmentAdminId = governmentAdminId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    @Override
    public String toString() {
        return governmentAdminId;
    }
}
