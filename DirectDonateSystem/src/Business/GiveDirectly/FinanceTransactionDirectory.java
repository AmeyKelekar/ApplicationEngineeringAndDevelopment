/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GiveDirectly;

import java.util.ArrayList;

/**
 *
 * @author Amey
 */
public class FinanceTransactionDirectory {
    private ArrayList<FinanceTransaction> financeTransactionList;

    public FinanceTransactionDirectory(){
        financeTransactionList = new ArrayList<>();
    }

    public ArrayList<FinanceTransaction> getFinanceTransactionList() {
        return financeTransactionList;
    }

    public void setFinanceTransactionList(ArrayList<FinanceTransaction> financeTransactionList) {
        this.financeTransactionList = financeTransactionList;
    }
    
    public void addFinanceTransaction(FinanceTransaction financeTransaction){
        this.financeTransactionList.add(financeTransaction);
    }
    
    public void removeFinanceTransaction(FinanceTransaction financeTransaction){
        this.financeTransactionList.remove(financeTransaction);
    }
}
