/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GiveDirectly.IdentificationTeamRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Government.GovernmentEmployeeOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CensusDataWorkRequest;
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
public class RequestCensusDataJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Organization organization;
    private EcoSystem system;
    
    /**
     * Creates new form RequestCensusDataJPanel
     */
    public RequestCensusDataJPanel(JPanel userJPanel,Enterprise enterprise,UserAccount account,
            Organization organization,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userJPanel;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.organization = organization;
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
            String result = ((CensusDataWorkRequest) request).getDataResult();
            row[3] = result == null ? "Waiting" : result;
            
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        refreshTestJButton = new javax.swing.JButton();
        requestDataJButton = new javax.swing.JButton();
        messageJLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        viewDataJButton = new javax.swing.JButton();
        messageJComboBox = new javax.swing.JComboBox();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
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

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        requestDataJButton.setText("Request Data");
        requestDataJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestDataJButtonActionPerformed(evt);
            }
        });

        messageJLabel.setText("Message");

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        viewDataJButton.setText("View Data");
        viewDataJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDataJButtonActionPerformed(evt);
            }
        });

        messageJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Share Census Data" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addGap(42, 42, 42)
                        .addComponent(requestDataJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewDataJButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(refreshTestJButton)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(messageJLabel)
                        .addGap(91, 91, 91)
                        .addComponent(messageJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(419, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(refreshTestJButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageJLabel)
                    .addComponent(messageJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(requestDataJButton)
                    .addComponent(viewDataJButton))
                .addContainerGap(242, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
        populateRequestTable();
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void requestDataJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestDataJButtonActionPerformed
        if (messageJComboBox.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the message!!!");
            messageJComboBox.requestFocus();
        }
        else{
            String message = (String)messageJComboBox.getSelectedItem();

            CensusDataWorkRequest request = new CensusDataWorkRequest();
            request.setMessage(message);
            request.setSender(userAccount);
            request.setStatus("Sent");
            request.setRequestDate(new Date());

            System.out.println("system is " + system);
            System.out.println("enterprise is " + enterprise);
            System.out.println("size " + enterprise.getOrganizationDirectory().getOrganizationList());

            for(Network network: system.getNetworkList()){
                for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                        System.out.println(organization);
                        if (organization instanceof GovernmentEmployeeOrganization){
                            System.out.println("HEKKIO");
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

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void viewDataJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDataJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if(selectedRow < 0 )
        {
            JOptionPane.showMessageDialog(null, "Please select a row to view data!!!");
            return;
        }
        if(workRequestJTable.getValueAt(selectedRow,3).equals("Waiting")){
            JOptionPane.showMessageDialog(null, "Census data not yet recevied from the Government!!!");
            return;
        }
        CensusDataWorkRequest request = (CensusDataWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        ViewDataJPanel viewDataJPanel = new ViewDataJPanel(userProcessContainer, userAccount,enterprise,request);
        userProcessContainer.add("ViewDataJPanel", viewDataJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewDataJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox messageJComboBox;
    private javax.swing.JLabel messageJLabel;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestDataJButton;
    private javax.swing.JButton viewDataJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}