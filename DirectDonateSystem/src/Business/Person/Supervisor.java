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
public class Supervisor extends Person{
    private String emailId;
    private String supervisorId;
    private static int count = 100;
    
    public Supervisor() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Supervisor");
        stringBuffer.append(++count);
        supervisorId = stringBuffer.toString();
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(String supervisorId) {
        this.supervisorId = supervisorId;
    }
    
    @Override
    public String toString() {
        return getFirstName();
    }
}
