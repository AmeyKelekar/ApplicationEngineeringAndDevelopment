/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Transaction;

import Business.Person.Donor;
import java.util.Date;

/**
 *
 * @author Amey
 */
public class Transaction {
    private static int count=100;
    private int transactionID;
    private Donor sender;
    private String receiver = "GiveDirectly";
    private Date timeStamp;
    private float amount = 0;
    
    public Transaction() {
        count ++;
        transactionID = count;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public Donor getSender() {
        return sender;
    }

    public void setSender(Donor sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
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
}