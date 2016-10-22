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
public class MoneyTransferEmployee extends Person{
    private static int count = 100;
    private String mobileMoneyTransferEmployeeId;
    private String emailId;
    
    public MoneyTransferEmployee() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("MobileMoneyTransferEmployeeId");
        stringBuffer.append(++count);
        mobileMoneyTransferEmployeeId = stringBuffer.toString();
    }

    public String getMobileMoneyTransferEmployeeId() {
        return mobileMoneyTransferEmployeeId;
    }

    public void setMobileMoneyTransferEmployeeId(String mobileMoneyTransferEmployeeId) {
        this.mobileMoneyTransferEmployeeId = mobileMoneyTransferEmployeeId;
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
