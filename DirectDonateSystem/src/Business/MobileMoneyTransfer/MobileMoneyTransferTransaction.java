/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MobileMoneyTransfer;

import Business.Person.Recepient;

/**
 *
 * @author Amey
 */
public class MobileMoneyTransferTransaction {
    private String sender;
    private Recepient recepient;
    private float transferAmount;
    private String transactionId;
    private static int count =1000;
    
    public MobileMoneyTransferTransaction(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("TRAN");
        stringBuffer.append(++count);
        transactionId = stringBuffer.toString();
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Recepient getRecepient() {
        return recepient;
    }

    public void setRecepient(Recepient recepient) {
        this.recepient = recepient;
    }

    public float getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(float transferAmount) {
        this.transferAmount = transferAmount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }    
}