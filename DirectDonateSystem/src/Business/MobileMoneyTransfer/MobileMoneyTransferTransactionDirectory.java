/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MobileMoneyTransfer;

import java.util.ArrayList;

/**
 *
 * @author Amey
 */
public class MobileMoneyTransferTransactionDirectory {
    private ArrayList<MobileMoneyTransferTransaction> mobileMoneyTransferTransactionList;

    public MobileMoneyTransferTransactionDirectory(){
        mobileMoneyTransferTransactionList = new ArrayList<>();
    }
    
    public ArrayList<MobileMoneyTransferTransaction> getMobileMoneyTransferTransactionList() {
        return mobileMoneyTransferTransactionList;
    }

    public void setMobileMoneyTransferTransactionList(ArrayList<MobileMoneyTransferTransaction> mobileMoneyTransferTransactionList) {
        this.mobileMoneyTransferTransactionList = mobileMoneyTransferTransactionList;
    }
    
    public MobileMoneyTransferTransaction addMobileMoneyTransferTransaction(){
        MobileMoneyTransferTransaction mobileMoneyTransferTransaction = new MobileMoneyTransferTransaction();
        mobileMoneyTransferTransactionList.add(mobileMoneyTransferTransaction);
        return mobileMoneyTransferTransaction;
    }
    public void removeMobileMoneyTransferAccount(MobileMoneyTransferTransaction mobileMoneyTransferTransaction){
        mobileMoneyTransferTransactionList.remove(mobileMoneyTransferTransaction);
    }
}
