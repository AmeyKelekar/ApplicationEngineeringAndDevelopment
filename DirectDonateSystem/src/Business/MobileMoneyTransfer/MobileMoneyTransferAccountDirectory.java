/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MobileMoneyTransfer;

import Business.Person.Recepient;
import java.util.ArrayList;

/**
 *
 * @author Amey
 */
public class MobileMoneyTransferAccountDirectory {
    private ArrayList<MobileMoneyTransferAccount> mobileMoneyTransferAccountList;
    
    public MobileMoneyTransferAccountDirectory(){
        mobileMoneyTransferAccountList = new ArrayList<>();
    }

    public ArrayList<MobileMoneyTransferAccount> getMobileMoneyTransferAccountList() {
        return mobileMoneyTransferAccountList;
    }

    public void setMobileMoneyTransferAccountList(ArrayList<MobileMoneyTransferAccount> mobileMoneyTransferAccountList) {
        this.mobileMoneyTransferAccountList = mobileMoneyTransferAccountList;
    }
    
    public MobileMoneyTransferAccount addMobileMoneyTransferAccount(Recepient recepient){
        MobileMoneyTransferAccount mobileMoneyTransferAccount = new MobileMoneyTransferAccount();
        mobileMoneyTransferAccount.setRecepient(recepient);
        mobileMoneyTransferAccountList.add(mobileMoneyTransferAccount);
        return mobileMoneyTransferAccount;
    }
    public void removeMobileMoneyTransferAccount(MobileMoneyTransferAccount mobileMoneyTransferAccount){
        mobileMoneyTransferAccountList.remove(mobileMoneyTransferAccount);
    }
}
