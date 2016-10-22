/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GiveDirectly.SupervisorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.GiveDirectly.RecepientOrganization;
import Business.Organization.GiveDirectly.SupervisorOrganization;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Person.Recepient;
import Business.Role.RecepientRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RecepientApprovalWorkRequest;
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
public class ValidateRecepientJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    //private SupervisorOrganization supervisorOrganization;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private EcoSystem system;
    /**
     * Creates new form ValidateRecepientJPanel
     */
    public ValidateRecepientJPanel(JPanel userJPanel, Enterprise enterprise,UserAccount account,EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userJPanel;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = ecoSystem;
        populateTable();
    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel)requestJTable.getModel();
        model.setRowCount(0);
        
        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof SupervisorOrganization){
                for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
                    Object[] row = new Object[4];
                    row[0] = request;
                    row[1] = request.getSender().getPerson().getFirstName();
                    row[2] = request.getReceiver() == null ? null : request.getReceiver().getPerson().getFirstName();
                    row[3] = request.getStatus();
            
                    model.addRow(row);
                }
            }
        }
    }
    
    private void populateRecepientData(){
        DefaultTableModel model = (DefaultTableModel)recepientJTable.getModel();
        model.setRowCount(0);
        
        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof RecepientOrganization){
                for(Person person:organization.getPersonDirectory().getPersonList()){
                    Recepient recepient = (Recepient)person;
                    System.out.println("House Type is: "+recepient.getHouseType());
                    if(recepient.getHouseType()!=null){
                        Object[] object = new Object[15];
                        object[0] = recepient;
                        object[1] = recepient.getLastName();
                        object[2] = recepient.getNationalId();
                        object[3] = recepient.getCountry();
                        object[4] = recepient.getRegion();
                        object[5] = recepient.getAddress();
                        object[6] = recepient.getIncome();
                        object[7] = recepient.getGender();
                        object[8] = recepient.getLattitude();
                        object[9] = recepient.getLongitude();
                        object[10] = recepient.getHouseType();
                        object[11] = recepient.getAccountBalance();
                        object[12] = recepient.getRecipientId();
                        object[13] = recepient.getPincode();
                        object[14] = recepient.isApproved();
                        model.addRow(object);
                    }
                }
            }
        }
    }
    
    private boolean isUserNamePresent(String name)
    {
        if(system.getUserAccountDirectory().userNameIsPresent(name)){
            return true;
        }
        for(Network network: system.getNetworkList()){
            System.out.println("Network: "+network);
            for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList())
            {
                if(enterprise.getUserAccountDirectory().userNameIsPresent(name) ){
                    return true; 
                }  
                for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                    if(organization.getUserAccountDirectory().userNameIsPresent(name)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        requestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        validateJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        recepientJTable = new javax.swing.JTable();
        approveJButton = new javax.swing.JButton();
        viewDataJButton = new javax.swing.JButton();
        userNameJLabel = new javax.swing.JLabel();
        passwordJLabel = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        passwordJTextField = new javax.swing.JTextField();
        createUserJButton = new javax.swing.JButton();

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

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

        validateJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        validateJLabel.setText("Validate Recepient");

        recepientJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "National ID", "Country", "Region", "Address", "Income", "Gender", "Lattitude", "Longitude", "House Type", "Account Balance", "Recepient Id", "Pincode", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(recepientJTable);

        approveJButton.setText("Approve");
        approveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveJButtonActionPerformed(evt);
            }
        });

        viewDataJButton.setText("View Data");
        viewDataJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDataJButtonActionPerformed(evt);
            }
        });

        userNameJLabel.setText("User Name");

        passwordJLabel.setText("Password");

        createUserJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createUserJButton.setText("Create Account");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(338, 338, 338)
                                .addComponent(validateJLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userNameJLabel)
                                    .addComponent(passwordJLabel))
                                .addGap(198, 198, 198)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(assignJButton)
                                        .addGap(92, 92, 92)
                                        .addComponent(submitJButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(viewDataJButton))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(approveJButton)))
                        .addGap(0, 315, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(createUserJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(validateJLabel)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitJButton)
                    .addComponent(assignJButton)
                    .addComponent(viewDataJButton))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(approveJButton))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameJLabel)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordJLabel)
                    .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(createUserJButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

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

        RecepientApprovalWorkRequest request = (RecepientApprovalWorkRequest)requestJTable.getValueAt(selectedRow, 0);
        request.setStatus("Completed");
        request.setApprovalResult("Approved");
        request.setResolveDate(new Date());
        populateTable();
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void approveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = recepientJTable.getSelectedRow();
        if(selectedRow < 0 )
        {
            JOptionPane.showMessageDialog(null, "Please select a row!!!");
            return;
        }
        Recepient recepient = (Recepient)recepientJTable.getValueAt(selectedRow, 0);
        recepient.setApproved(true);
        populateRecepientData();
    }//GEN-LAST:event_approveJButtonActionPerformed

    private void viewDataJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDataJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestJTable.getSelectedRow();
        if(selectedRow < 0 )
        {
            JOptionPane.showMessageDialog(null, "Please select a row to view data!!!");
            return;
        }
        if(requestJTable.getValueAt(selectedRow,3).equals("Sent")){
            JOptionPane.showMessageDialog(null, "Request is not yet assigned!!!");
            return;
        }
        if(requestJTable.getValueAt(selectedRow,3).equals("Pending")){
            JOptionPane.showMessageDialog(null, "Request is not yet approved!!!");
            return;
        }
        populateRecepientData();
    }//GEN-LAST:event_viewDataJButtonActionPerformed

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
        int selectedRow = recepientJTable.getSelectedRow();
        if(selectedRow < 0 )
        {
            JOptionPane.showMessageDialog(null, "Please select a row!!!");
        }
        else if (nameJTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the User name!!!");
            nameJTextField.setText("");
            nameJTextField.requestFocus();
        }
        else if (passwordJTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the password!!!");
            passwordJTextField.setText("");
            passwordJTextField.requestFocus();
        }
        else{
            if(isUserNamePresent(nameJTextField.getText().trim())){
                JOptionPane.showMessageDialog(null,"Account Name Already Exists!!");
                nameJTextField.setText("");
                nameJTextField.requestFocus();
                return;
            }
            String userName = nameJTextField.getText().trim();
            String password = passwordJTextField.getText().trim();
            Recepient recepient = (Recepient)recepientJTable.getValueAt(selectedRow, 0);
            if(recepient.isApproved()){
                Organization org = null;
                for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList())
                {
                    if(organization instanceof RecepientOrganization)
                    {
                        org = organization;
                        break;
                    }
                }
                if(org!= null)
                {
                    org.getUserAccountDirectory().createUserAccount(userName, password, recepient, new RecepientRole());
                    JOptionPane.showMessageDialog(null, "User Account created successfully!!!");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "User Account cannot be created. Please check!!!");
            }
        }
    }//GEN-LAST:event_createUserJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveJButton;
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JTable recepientJTable;
    private javax.swing.JTable requestJTable;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel userNameJLabel;
    private javax.swing.JLabel validateJLabel;
    private javax.swing.JButton viewDataJButton;
    // End of variables declaration//GEN-END:variables
}
