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
public class IdentificationTeamPerson extends Person{
    private String emailId;
    private String identificationPersonId;
    private static int count = 100;
    
    public IdentificationTeamPerson() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("IdentificationPerson");
        stringBuffer.append(++count);
        identificationPersonId = stringBuffer.toString();
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getIdentificationPersonId() {
        return identificationPersonId;
    }

    public void setIdentificationPersonId(String identificationPersonId) {
        this.identificationPersonId = identificationPersonId;
    }
    
    @Override
    public String toString() {
        return getFirstName();
    }
}