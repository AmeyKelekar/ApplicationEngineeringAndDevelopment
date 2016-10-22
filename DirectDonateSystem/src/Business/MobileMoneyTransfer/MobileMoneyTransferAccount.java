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
public class MobileMoneyTransferAccount {
    private Recepient recepient;
    private String accountNumber;
    private float accountBalance;
    private static int count=102030405;

    public MobileMoneyTransferAccount(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("MPESA");
        stringBuffer.append(++count);
        accountNumber = stringBuffer.toString();
    }
    
    public Recepient getRecepient() {
        return recepient;
    }

    public void setRecepient(Recepient recepient) {
        this.recepient = recepient;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }
}
