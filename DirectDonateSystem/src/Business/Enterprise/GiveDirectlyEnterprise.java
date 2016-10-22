/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.Transaction.TransactionDirectory;
import java.util.ArrayList;

/**
 *
 * @author Amey
 */
public class GiveDirectlyEnterprise extends Enterprise {
    private TransactionDirectory transactionDirectory;
    
    public GiveDirectlyEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.GiveDirectly);
        transactionDirectory = new TransactionDirectory();
    }

    public TransactionDirectory getTransactionDirectory() {
        return transactionDirectory;
    }

    public void setTransactionDirectory(TransactionDirectory transactionDirectory) {
        this.transactionDirectory = transactionDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       return null;
    } 
}
