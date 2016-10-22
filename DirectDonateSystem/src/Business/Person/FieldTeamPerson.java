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
public class FieldTeamPerson extends Person{
    private String emailId;
    private String fieldPersonId;
    private static int count = 100;
    
    public FieldTeamPerson() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FieldPerson");
        stringBuffer.append(++count);
        fieldPersonId = stringBuffer.toString();
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getFieldPersonId() {
        return fieldPersonId;
    }

    public void setFieldPersonId(String fieldPersonId) {
        this.fieldPersonId = fieldPersonId;
    }
    
    @Override
    public String toString() {
        return getFirstName();
    }
}
