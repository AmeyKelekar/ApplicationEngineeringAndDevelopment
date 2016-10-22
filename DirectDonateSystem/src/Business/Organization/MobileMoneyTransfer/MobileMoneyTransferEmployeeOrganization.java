/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.MobileMoneyTransfer;

import Business.MobileMoneyTransfer.MobileMoneyTransferAccountDirectory;
import Business.MobileMoneyTransfer.MobileMoneyTransferTransactionDirectory;
import Business.Organization.Organization;
import Business.Role.MobileMoneyTransferEmployeeRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Amey
 */
public class MobileMoneyTransferEmployeeOrganization extends Organization {
    private MobileMoneyTransferAccountDirectory mobileMoneyTransferAccountList;
    private MobileMoneyTransferTransactionDirectory mobileMoneyTransferTransactionList;
    
    public MobileMoneyTransferEmployeeOrganization() {
        super(Organization.Type.MobileMoneyTransferEmployee.getValue());
        mobileMoneyTransferAccountList = new MobileMoneyTransferAccountDirectory();
        mobileMoneyTransferTransactionList = new MobileMoneyTransferTransactionDirectory();
    }

    public MobileMoneyTransferAccountDirectory getMobileMoneyTransferAccountList() {
        return mobileMoneyTransferAccountList;
    }

    public void setMobileMoneyTransferAccountList(MobileMoneyTransferAccountDirectory mobileMoneyTransferAccountList) {
        this.mobileMoneyTransferAccountList = mobileMoneyTransferAccountList;
    }

    public MobileMoneyTransferTransactionDirectory getMobileMoneyTransferTransactionList() {
        return mobileMoneyTransferTransactionList;
    }

    public void setMobileMoneyTransferTransactionList(MobileMoneyTransferTransactionDirectory mobileMoneyTransferTransactionList) {
        this.mobileMoneyTransferTransactionList = mobileMoneyTransferTransactionList;
    }
     
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MobileMoneyTransferEmployeeRole());
        return roles;
    }
}