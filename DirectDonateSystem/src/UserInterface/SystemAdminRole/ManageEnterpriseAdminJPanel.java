/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminRole;

import Business.EcoSystem;
import Business.Person.Person;
import Business.Enterprise.Enterprise;
import Business.Enterprise.GiveDirectlyEnterprise;
import Business.Enterprise.GovernmentEnterprise;
import Business.Enterprise.MobileMoneyTransferEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.GiveDirectlyAdminRole;
import Business.Role.GovernmentAdminRole;
import Business.Role.MobileMoneyTransferAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amey
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseAdminJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    public ManageEnterpriseAdminJPanel(JPanel userJPanel,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userJPanel;
        this.system = system;
        populateTable();
        populateNetworkComboBox();
    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) enterpriseAdminJTable.getModel();
        model.setRowCount(0);
        
        for(Network network : system.getNetworkList()){
            for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
                for(UserAccount userAccount:enterprise.getUserAccountDirectory().getUserAccountList()){
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount.getUsername();
                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox(){
        networkJComboBox.removeAllItems();
        
        for(Network network:system.getNetworkList()){
            networkJComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseCombobox(Network network){
        enterpriseJComboBox.removeAllItems();
        
        for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
            enterpriseJComboBox.addItem(enterprise);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseAdminJTable = new javax.swing.JTable();
        networkJLabel = new javax.swing.JLabel();
        enterpriseJLabel = new javax.swing.JLabel();
        userNameJLabel = new javax.swing.JLabel();
        passwordJLabel = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        enterpriseJComboBox = new javax.swing.JComboBox();
        userNameJTextField = new javax.swing.JTextField();
        nameJLabel = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        passwordJTextField = new javax.swing.JTextField();
        manageEnterpriseAdminJLabel = new javax.swing.JLabel();

        enterpriseAdminJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network Name", "UserName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseAdminJTable);

        networkJLabel.setText("Network");

        enterpriseJLabel.setText("Enterprise");

        userNameJLabel.setText("UserName");

        passwordJLabel.setText("Password");

        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        nameJLabel.setText("Name");

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

        passwordJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordJTextFieldActionPerformed(evt);
            }
        });

        manageEnterpriseAdminJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageEnterpriseAdminJLabel.setText("Manage Enterprise Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(88, 88, 88)
                .addComponent(submitJButton)
                .addGap(428, 428, 428))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordJLabel)
                                    .addComponent(nameJLabel))
                                .addGap(146, 146, 146)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(nameJTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(networkJLabel)
                                    .addComponent(enterpriseJLabel)
                                    .addComponent(userNameJLabel))
                                .addGap(142, 142, 142)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(networkJComboBox, 0, 160, Short.MAX_VALUE)
                                    .addComponent(enterpriseJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(userNameJTextField)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(manageEnterpriseAdminJLabel)))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(manageEnterpriseAdminJLabel)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkJLabel)
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseJLabel)
                    .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameJLabel)
                    .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordJLabel)
                    .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameJLabel)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitJButton)
                    .addComponent(backJButton))
                .addContainerGap(87, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // TODO add your handling code here:
        int totalRow = enterpriseAdminJTable.getRowCount();
        Network network = (Network)networkJComboBox.getSelectedItem();
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        if (userNameJTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the User name!!!");
            userNameJTextField.setText("");
            userNameJTextField.requestFocus();
        } 
        else if (passwordJTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the password!!!");
            passwordJTextField.setText("");
            passwordJTextField.requestFocus();
        } 
        else if (nameJTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the name!!!");
            nameJTextField.setText("");
            nameJTextField.requestFocus();
        } 
        else{
            if(isUserNamePresent(userNameJTextField.getText().trim())){
                JOptionPane.showMessageDialog(null,"Account Name Already Exists!!");
                userNameJTextField.setText("");
                userNameJTextField.requestFocus();
                return;
            }
            for(int i=0; i< totalRow;i++){
                if(enterpriseAdminJTable.getValueAt(i,2).equals(userNameJTextField.getText().trim()) ){
                    JOptionPane.showMessageDialog(null,"User Name Already Exists!!");
                    userNameJTextField.setText("");
                    userNameJTextField.requestFocus();
                    return;
                }
            }
            
            for(int i=0; i< totalRow;i++){
                if(enterpriseAdminJTable.getValueAt(i,0).equals(enterprise.getName()) 
                        && enterpriseAdminJTable.getValueAt(i, 1).equals(network.getName()) ){
                    JOptionPane.showMessageDialog(null,"Respective Enterprise admin already exists!!");
                    userNameJTextField.setText("");
                    passwordJTextField.setText("");
                    nameJTextField.setText("");
                    userNameJTextField.requestFocus();
                    return;
                }
            }
            String userName = userNameJTextField.getText().trim();
            String password = passwordJTextField.getText().trim();
            String name = nameJTextField.getText().trim();
      
            if(enterprise instanceof GiveDirectlyEnterprise){
                GiveDirectlyEnterprise giveDirectlyEnterprise = (GiveDirectlyEnterprise)enterprise;
                Person person = enterprise.getPersonDirectory().createPerson(name);
                UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(userName, password, person, new GiveDirectlyAdminRole());
            }

            else if(enterprise instanceof GovernmentEnterprise){
                GovernmentEnterprise governmentEnterprise = (GovernmentEnterprise)enterprise;
                Person person = enterprise.getPersonDirectory().createPerson(name);
                UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(userName, password, person, new GovernmentAdminRole());
            }

            else if(enterprise instanceof MobileMoneyTransferEnterprise){
                MobileMoneyTransferEnterprise mobileMoneyTransferEnterprise = (MobileMoneyTransferEnterprise)enterprise;
                Person person = enterprise.getPersonDirectory().createPerson(name);
                UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(userName, password, person, new MobileMoneyTransferAdminRole());
            }
            populateTable();
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
        Network network = (Network)networkJComboBox.getSelectedItem();
        if(network != null){
            populateEnterpriseCombobox(network);
        }
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void passwordJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordJTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable enterpriseAdminJTable;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JLabel enterpriseJLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageEnterpriseAdminJLabel;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JLabel networkJLabel;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel userNameJLabel;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}