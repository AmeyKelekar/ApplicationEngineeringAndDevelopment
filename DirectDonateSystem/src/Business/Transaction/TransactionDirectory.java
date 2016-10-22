/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Transaction;

import java.util.ArrayList;

/**
 *
 * @author Amey
 */
public class TransactionDirectory {
    private ArrayList<Transaction> transactionList;
    
    public TransactionDirectory(){
        this.transactionList = new ArrayList<>();
    }

    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(ArrayList<Transaction> transactionList) {
        this.transactionList = transactionList;
    }
    
    public Transaction addTransaction(){
        Transaction transaction = new Transaction();
        this.transactionList.add(transaction);
        return transaction;
    }
    
    public void removeTransaction(Transaction transaction){
        this.transactionList.remove(transaction);
    }
}