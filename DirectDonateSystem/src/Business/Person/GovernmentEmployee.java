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
public class GovernmentEmployee extends Person{
    private static int count = 100;
    private String governmentEmployeeId;
    private String emailId;
    
    public GovernmentEmployee() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("GovernmentEmployeeId");
        stringBuffer.append(++count);
        governmentEmployeeId = stringBuffer.toString();
    }

    public String getGovernmentEmployeeId() {
        return governmentEmployeeId;
    }

    public void setGovernmentEmployeeId(String governmentEmployeeId) {
        this.governmentEmployeeId = governmentEmployeeId;
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
