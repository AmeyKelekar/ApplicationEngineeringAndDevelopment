/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GiveDirectly.RecepientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.MobileMoneyTransferEnterprise;
import Business.MobileMoneyTransfer.MobileMoneyTransferTransaction;
import Business.Network.Network;
import Business.Organization.MobileMoneyTransfer.MobileMoneyTransferEmployeeOrganization;
import Business.Organization.Organization;
import Business.Person.Recepient;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amey
 */
public class ViewDonationReceivedHistoryJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem system;
    /**
     * Creates new form ViewTransactionHistoryJPanel
     */
    public ViewDonationReceivedHistoryJPanel(JPanel userJPanel,UserAccount account,EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userJPanel;
        this.userAccount = account;
        this.system = ecoSystem;
        populateTransactionHistoryTable();
        displayTotalDonationReceived();
    }

    private void populateTransactionHistoryTable(){
        DefaultTableModel model = (DefaultTableModel)donationReceivedHistoryJTable.getModel();
        model.setRowCount(0);

        for(Network network:system.getNetworkList()){
            System.out.println("View History Network loop:"+network);
            for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                System.out.println("View History Enterprise Loop:"+enterprise);
                if(enterprise instanceof  MobileMoneyTransferEnterprise){
                    for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                        System.out.println("View History Organization loop:"+organization);
                        if(organization instanceof MobileMoneyTransferEmployeeOrganization){
                            System.out.println("View History Organization if condition:"+organization);
                            MobileMoneyTransferEmployeeOrganization mobileMoneyTransferEmployeeOrganization = 
                                    (MobileMoneyTransferEmployeeOrganization)organization;
                            for(MobileMoneyTransferTransaction mobileMoneyTransferTransaction:
                                    mobileMoneyTransferEmployeeOrganization.getMobileMoneyTransferTransactionList().getMobileMoneyTransferTransactionList()){
                                System.out.println("Inside transaction loop");
                                Recepient recepient = (Recepient)userAccount.getPerson();
                                if(mobileMoneyTransferTransaction.getRecepient().getRecipientId().equals(recepient.getRecipientId())){
                                    Object object[] = new Object[3];
                                    object[0] = mobileMoneyTransferTransaction.getTransactionId();
                                    object[1] = mobileMoneyTransferTransaction.getTransferAmount();
                                    object[2] = mobileMoneyTransferTransaction.getSender();
                                    model.addRow(object);
                                }
                            }
                        }
                    }
                }
            }
        }       
    }
    
    private void displayTotalDonationReceived(){
        int rowCount= donationReceivedHistoryJTable.getRowCount();
        float sum = 0;  
        System.out.println("rowcount is"+rowCount);
        for (int i=0;i < rowCount;i++){
            sum += (Float)donationReceivedHistoryJTable.getValueAt(i,1);
        }
        totalAmountReceivedJTextField.setText(String.valueOf(sum));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        donationReceivedJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        donationReceivedHistoryJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        totalAmountReceivedJLabel = new javax.swing.JLabel();
        totalAmountReceivedJTextField = new javax.swing.JTextField();

        donationReceivedJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        donationReceivedJLabel.setText("View Donation Received History");

        donationReceivedHistoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction ID", "Balance", "Sender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(donationReceivedHistoryJTable);

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        totalAmountReceivedJLabel.setText("Total Donation Received");

        totalAmountReceivedJTextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(donationReceivedJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(totalAmountReceivedJLabel)
                        .addGap(74, 74, 74)
                        .addComponent(totalAmountReceivedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(backJButton)))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(donationReceivedJLabel)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalAmountReceivedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalAmountReceivedJLabel))
                .addGap(50, 50, 50)
                .addComponent(backJButton)
                .addContainerGap(234, Short.MAX_VALUE))
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
    private javax.swing.JTable donationReceivedHistoryJTable;
    private javax.swing.JLabel donationReceivedJLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel totalAmountReceivedJLabel;
    private javax.swing.JTextField totalAmountReceivedJTextField;
    // End of variables declaration//GEN-END:variables
}
