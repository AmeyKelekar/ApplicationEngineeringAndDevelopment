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
public class MoneyTransferAdmin extends Person {
    private static int count = 100;
    private String mobileMoneyTransferAdminId;
    private String emailId;
    
    public MoneyTransferAdmin() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("MobileMoneyTransferAdminId");
        stringBuffer.append(++count);
        mobileMoneyTransferAdminId = stringBuffer.toString();
    }

    public String getMobileMoneyTransferAdminId() {
        return mobileMoneyTransferAdminId;
    }

    public void setMobileMoneyTransferAdminId(String mobileMoneyTransferAdminId) {
        this.mobileMoneyTransferAdminId = mobileMoneyTransferAdminId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    @Override
    public String toString() {
        return mobileMoneyTransferAdminId;
    }
}
