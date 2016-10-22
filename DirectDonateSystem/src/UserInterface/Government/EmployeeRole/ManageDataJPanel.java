/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Government.EmployeeRole;

import Business.Enterprise.GovernmentEnterprise;
import Business.Government.CensusData;
import Business.Government.CensusDataDirectory;
import Business.Organization.Government.GovernmentEmployeeOrganization;
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
public class ManageDataJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private GovernmentEnterprise governmentEnterprise;
    private UserAccount userAccount;
    private GovernmentEmployeeOrganization governmentEmployeeOrganization;
    private CensusDataDirectory censusDataDirectory;
    /**
     * Creates new form ManageDataJPanel
     */
    public ManageDataJPanel(JPanel userJPanel,GovernmentEnterprise enterprise,
            GovernmentEmployeeOrganization organization,UserAccount account,CensusDataDirectory censusDataList) {
        initComponents();
        this.userProcessContainer = userJPanel;
        this.governmentEnterprise = enterprise;
        this.governmentEmployeeOrganization = organization;
        this.userAccount = account;
        this.censusDataDirectory = censusDataList;
        //this.censusDataDirectory.addData();
        populateTable();
    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel)requestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : governmentEmployeeOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getPerson().getFirstName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getPerson().getFirstName();
            row[3] = request.getStatus();
            model.addRow(row);
        }
    }
    
    private void populateCensusData(){
        DefaultTableModel model = (DefaultTableModel)censusDataJTable.getModel();
        model.setRowCount(0);
        for(CensusData censusData : censusDataDirectory.getCensusDataList()){
            Object[] object = new Object[7];
            object[0] = censusData.getFirstName();
            object[1] = censusData.getLastName();
            object[2] = censusData.getNationalID();
            object[3] = censusData.getCountry();
            object[4] = censusData.getRegion();
            object[5] = censusData.getAddress();
            object[6] = censusData.getIncomeAnually();
            model.addRow(object);
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

        manageJLabel = new javax.swing.JLabel();
        getCensusDataJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        censusDataJTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        requestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        manageJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageJLabel.setText("Manage Data");

        getCensusDataJButton.setText("Get Census Data");
        getCensusDataJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getCensusDataJButtonActionPerformed(evt);
            }
        });

        censusDataJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "National ID", "Country", "Region", "Address", "Income"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(censusDataJTable);

        requestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Description", "Sender", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(requestJTable);

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

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
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getCensusDataJButton)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(manageJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(assignJButton)
                        .addGap(69, 69, 69)
                        .addComponent(submitJButton)))
                .addGap(223, 223, 223))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(manageJLabel)
                .addGap(23, 23, 23)
                .addComponent(getCensusDataJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignJButton)
                    .addComponent(submitJButton)
                    .addComponent(backJButton))
                .addGap(97, 97, 97))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getCensusDataJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getCensusDataJButtonActionPerformed
        // TODO add your handling code here:
        populateCensusData();
    }//GEN-LAST:event_getCensusDataJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row to submit!!!!");
            return;
        }
        Object object = requestJTable.getValueAt(selectedRow,2);
        if(object == null){
            JOptionPane.showMessageDialog(null, "The request is not yet assigned!!!");
            return;
        }
        CensusDataWorkRequest request = (CensusDataWorkRequest)requestJTable.getValueAt(selectedRow, 0);
        request.setStatus("Completed");
        request.setDataResult("Approved");
        request.setResolveDate(new Date());
        request.setCensusDataDirectory(censusDataDirectory);
        populateTable();
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row to assign!!!");
            return;
        }  
        WorkRequest request = (WorkRequest)requestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JTable censusDataJTable;
    private javax.swing.JButton getCensusDataJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel manageJLabel;
    private javax.swing.JTable requestJTable;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
