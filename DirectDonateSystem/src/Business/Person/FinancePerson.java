/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.GiveDirectly.FinanceAccount;
import Business.Transaction.Transaction;

/**
 *
 * @author Amey
 */
public class FinancePerson extends Person {
    private String emailId;
    private String financePersonId;
    private Transaction transaction;
    private FinanceAccount financeAccount;
    private static int count = 100;
    
    public FinancePerson() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FinancePerson");
        stringBuffer.append(++count);
        financePersonId = stringBuffer.toString();
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getFinancePersonId() {
        return financePersonId;
    }

    public void setFinancePersonId(String financePersonId) {
        this.financePersonId = financePersonId;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public FinanceAccount getFinanceAccount() {
        return financeAccount;
    }

    public void setFinanceAccount(FinanceAccount financeAccount) {
        this.financeAccount = financeAccount;
    }
    
    @Override
    public String toString() {
        return getFirstName();
    }
}
