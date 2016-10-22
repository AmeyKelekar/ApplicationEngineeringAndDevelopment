/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GiveDirectly.FinanceTeamRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.GiveDirectly.RecepientOrganization;
import Business.Organization.MobileMoneyTransfer.MobileMoneyTransferEmployeeOrganization;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Person.Recepient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MakeAccountWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amey
 */
public class RequestMoneyTransferAccountJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Organization organization;
    private EcoSystem system;
    /**
     * Creates new form RequestMoneyTransferJPanel
     */
    public RequestMoneyTransferAccountJPanel(JPanel userJPanel, Enterprise enterprise, 
            Organization organization,UserAccount account,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userJPanel;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userAccount = account;
        this.system = system;
        populateRequestTable();
    }

    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();   
        model.setRowCount(0);
        
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((MakeAccountWorkRequest) request).getResult();
            row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
        }
    }
    
    private void populateRecepientData(){
        DefaultTableModel model = (DefaultTableModel) populateRecepientDataJTable.getModel();   
        model.setRowCount(0);
        for(Organization recepientOrganization:enterprise.getOrganizationDirectory().getOrganizationList()){
            if(recepientOrganization instanceof RecepientOrganization){
                for(Person person:recepientOrganization.getPersonDirectory().getPersonList()){
                    Recepient recepient = (Recepient)person;
                    if(recepient.isMoneyTransferAccount()){
                        Object object[] = new Object[6];
                        object[0] = recepient.getFirstName();
                        object[1] = recepient.getLastName();
                        object[2] = recepient.getNationalId();
                        object[3] = recepient.getRecipientId();
                        object[4] = recepient.getPhoneNumber();
                        object[5] = recepient.isMoneyTransferAccount();
                        model.addRow(object); 
                    }
                }
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

        messageJLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        requestDataJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        requestMoneyTransferJLabel = new javax.swing.JLabel();
        viewDataJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        populateRecepientDataJTable = new javax.swing.JTable();
        messageJComboBox = new javax.swing.JComboBox();

        messageJLabel.setText("Message");

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        requestDataJButton.setText("Request Data");
        requestDataJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestDataJButtonActionPerformed(evt);
            }
        });

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        requestMoneyTransferJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        requestMoneyTransferJLabel.setText("Request Money Transfer Account");

        viewDataJButton.setText("View Data");
        viewDataJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDataJButtonActionPerformed(evt);
            }
        });

        populateRecepientDataJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "National ID", "Recepient ID", "Phone Number", "Money Transfer Account Exixts"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(populateRecepientDataJTable);

        messageJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Create Recepient Account" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(requestMoneyTransferJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(backJButton)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(messageJLabel)
                        .addGap(92, 92, 92)
                        .addComponent(messageJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(refreshTestJButton)
                        .addGap(34, 34, 34)
                        .addComponent(requestDataJButton)
                        .addGap(36, 36, 36)
                        .addComponent(viewDataJButton)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(requestMoneyTransferJLabel)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageJLabel)
                    .addComponent(messageJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDataJButton)
                    .addComponent(requestDataJButton)
                    .addComponent(refreshTestJButton))
                .addGap(56, 56, 56)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(backJButton)
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestDataJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestDataJButtonActionPerformed
//        if (messageJTextField.getText().trim().equals("")) {
//            JOptionPane.showMessageDialog(null, "Please enter the message!!!");
//            messageJTextField.setText("");
//            messageJTextField.requestFocus();
//        }
        if (messageJComboBox.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Please select the message!!!");
            messageJComboBox.requestFocus();
        }
        else{
            String message = (String)messageJComboBox.getSelectedItem();

            MakeAccountWorkRequest request = new MakeAccountWorkRequest();
            request.setMessage(message);
            request.setSender(userAccount);
            request.setStatus("Sent");
            request.setRequestDate(new Date());

            System.out.println("enterprise is " + enterprise);
            System.out.println("size " + enterprise.getOrganizationDirectory().getOrganizationList());

            for(Network network: system.getNetworkList()){
                for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                        System.out.println(organization);
                        if (organization instanceof MobileMoneyTransferEmployeeOrganization){
                            System.out.println("HELLO HI");
                            organization.getWorkQueue().getWorkRequestList().add(request);
                            userAccount.getWorkQueue().getWorkRequestList().add(request);
                            break;
                        }
                    }
                }
            }
            populateRequestTable();
        }
    }//GEN-LAST:event_requestDataJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
        populateRequestTable();
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void viewDataJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDataJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if(selectedRow < 0 )
        {
            JOptionPane.showMessageDialog(null, "Please select a row to view data!!!");
            return;
        }
        if(workRequestJTable.getValueAt(selectedRow,3).equals("Waiting")){
            JOptionPane.showMessageDialog(null, "Data not yet recevied from the Money Transfer Employee!!!");
            return;
        }
        MakeAccountWorkRequest request = (MakeAccountWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        populateRecepientData();
    }//GEN-LAST:event_viewDataJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox messageJComboBox;
    private javax.swing.JLabel messageJLabel;
    private javax.swing.JTable populateRecepientDataJTable;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestDataJButton;
    private javax.swing.JLabel requestMoneyTransferJLabel;
    private javax.swing.JButton viewDataJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}