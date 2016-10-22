/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GiveDirectly;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Amey
 */
public class FinanceTransaction {
    private String transactionId;
    private Date timeStamp;
    private float amount = 0;
    private UserAccount sender;
    private UserAccount receiver;
    private static int count=12345;
    
    public FinanceTransaction(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FinTran");
        stringBuffer.append(++count);
        transactionId = stringBuffer.toString();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }   
}