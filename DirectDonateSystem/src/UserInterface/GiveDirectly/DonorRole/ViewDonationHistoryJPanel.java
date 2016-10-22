/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GiveDirectly.DonorRole;

import Business.Enterprise.GiveDirectlyEnterprise;
import Business.Person.Donor;
import Business.Transaction.Transaction;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amey
 */
public class ViewDonationHistoryJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private GiveDirectlyEnterprise giveDirectlyEnterprise;
    private Donor donor;
    
    /**
     * Creates new form ViewDonationHistoryJPanel
     */
    public ViewDonationHistoryJPanel(JPanel userJPanel,GiveDirectlyEnterprise enterprise,Donor donor) {
        initComponents();
        this.userProcessContainer = userJPanel;
        this.giveDirectlyEnterprise = enterprise;
        this.donor = donor;
        populateTransactionHistory();
    }
    
    private void populateTransactionHistory(){
        DefaultTableModel model = (DefaultTableModel)donationHistoryJTable.getModel();
        model.setRowCount(0);
        for(Transaction transaction : giveDirectlyEnterprise.getTransactionDirectory().getTransactionList()){
            if(transaction.getSender().equals(donor)){
                Object[] object = new Object[3];
                object[0] = transaction.getTransactionID();
                object[1] = transaction.getTimeStamp();
                object[2] = transaction.getAmount();
                model.addRow(object);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        donationHistoryJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        donationHistoryJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();

        donationHistoryJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        donationHistoryJLabel.setText("View Donation History");

        donationHistoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tran ID", "Date", "Amount Donated"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(donationHistoryJTable);

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(donationHistoryJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(backJButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(donationHistoryJLabel)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(backJButton)
                .addGap(316, 316, 316))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel donationHistoryJLabel;
    private javax.swing.JTable donationHistoryJTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}