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
public class FinanceAccount {
    private static FinanceAccount financeAccount;
    private String accountName = "Give Directly Current Account";
    private float balanceAmount;
    private Date timestamp;
    private FinanceTransactionDirectory financeTransactionDirectory;
    private double amountConsumed; 
    
    public static FinanceAccount getInstance(){
        if (financeAccount == null){
            financeAccount = new FinanceAccount();
        }
        return financeAccount;
    }
    
    private FinanceAccount(){
       //organizationDirectory = new OrganizationDirectory();
       //masterOrderCatalog = new MasterOrderCatalog();
        financeTransactionDirectory = new FinanceTransactionDirectory();
    }

    public FinanceTransactionDirectory getFinanceTransactionDirectory() {
        return financeTransactionDirectory;
    }

    public void setFinanceTransactionDirectory(FinanceTransactionDirectory financeTransactionDirectory) {
        this.financeTransactionDirectory = financeTransactionDirectory;
    }

    public double getAmountConsumed() {
        return amountConsumed;
    }

    public void setAmountConsumed(double amountConsumed) {
        this.amountConsumed = amountConsumed;
    }
    
    
    
    
    public float getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(float balanceAmount) {
        this.balanceAmount = balanceAmount;
    } 

    public String getAccountName() {
        return accountName;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    
     
    public void updateDirectory(float amount, UserAccount sender, UserAccount receiver)
    {
        FinanceTransaction financeTransaction = new FinanceTransaction();
        financeTransaction.setTransactionId(financeTransaction.getTransactionId());
        financeTransaction.setAmount(amount);
        financeTransaction.setTimeStamp(new Date());
        financeTransaction.setSender(sender);
        financeTransaction.setReceiver(receiver);
        
        financeAccount.getFinanceTransactionDirectory().addFinanceTransaction(financeTransaction);
                
               
    }
    
    
}