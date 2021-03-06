/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GiveDirectly.AdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.GiveDirectly.RecepientOrganization;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amey
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel container;
    private Enterprise enterprise;
    private EcoSystem system;

    public ManageUserAccountJPanel(JPanel container, Enterprise enterprise,EcoSystem system) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;
        this.system =system;
        
        popOrganizationComboBox();
        personJComboBox.removeAllItems();
        popData();
    }

    private void popOrganizationComboBox() {
        organizationJComboBox.removeAllItems();
        for (Organization organization : enterprise.getOrganizationDirectory().
                getOrganizationList()) {
            if(!(organization instanceof RecepientOrganization)){
                organizationJComboBox.addItem(organization);
            }
        }
    }
    
    private void populatePersonComboBox(Organization organization){
        personJComboBox.removeAllItems(); 
        for (Person person : organization.getPersonDirectory().getPersonList()){
            personJComboBox.addItem(person);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        roleJComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            roleJComboBox.addItem(role);
        }
    }

    private void popData() {
        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();
        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().
                getOrganizationList()) {
            for (UserAccount userAccount :organization.
                    getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = userAccount.getUsername();
                row[1] = userAccount.getRole();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
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
            for(Enterprise enterprise: network.getEnterpriseDirectory().
                    getEnterpriseList())
            {
                if(enterprise.getUserAccountDirectory().userNameIsPresent(name))
                {
                    return true; 
                }  
                for(Organization organization:enterprise.
                        getOrganizationDirectory().getOrganizationList()){
                    if(organization.getUserAccountDirectory().userNameIsPresent(name))
                    {
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

        createUserJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        userNameJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        passwordJLabel = new javax.swing.JLabel();
        passwordJTextField = new javax.swing.JTextField();
        personJLabel = new javax.swing.JLabel();
        personJComboBox = new javax.swing.JComboBox();
        backJButton = new javax.swing.JButton();
        organizationJLabel = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        roleJLabel = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        manageUserAccountJLabel = new javax.swing.JLabel();

        createUserJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createUserJButton.setText("Create");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });

        userNameJLabel.setText("User Name");

        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userJTable);
        if (userJTable.getColumnModel().getColumnCount() > 0) {
            userJTable.getColumnModel().getColumn(0).setResizable(false);
            userJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        passwordJLabel.setText("Password");

        personJLabel.setText("Person");

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        organizationJLabel.setText("Organization");

        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        roleJLabel.setText("Role");

        manageUserAccountJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageUserAccountJLabel.setText("Manage UserAccount");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(createUserJButton)))
                .addGap(0, 211, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordJLabel)
                    .addComponent(userNameJLabel)
                    .addComponent(roleJLabel)
                    .addComponent(personJLabel)
                    .addComponent(organizationJLabel))
                .addGap(165, 165, 165)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(manageUserAccountJLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(manageUserAccountJLabel)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organizationJLabel))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personJLabel))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleJLabel))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameJLabel))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordJLabel))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createUserJButton)
                    .addComponent(backJButton))
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
//        int totalRow = userJTable.getRowCount();
        if (nameJTextField.getText().trim().equals("")) {
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
//            for(int i=0; i<totalRow;i++){
//                if(userJTable.getValueAt(i,0).equals(nameJTextField.getText().trim())){
//                    JOptionPane.showMessageDialog(null,"User Name Already Exists!!");
//                    nameJTextField.setText("");
//                    nameJTextField.requestFocus();
//                    return;
//                }
//            }
            String userName = nameJTextField.getText().trim();
            String password = passwordJTextField.getText().trim();
        
            Person person = (Person) personJComboBox.getSelectedItem();
            Role role = (Role) roleJComboBox.getSelectedItem();
            Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        
            organization.getUserAccountDirectory().createUserAccount(userName, password, person, role);
            JOptionPane.showMessageDialog(null, "User Account created successfully!!!");
            popData();
        }
    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populatePersonComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageUserAccountJLabel;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JLabel organizationJLabel;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JComboBox personJComboBox;
    private javax.swing.JLabel personJLabel;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JLabel roleJLabel;
    private javax.swing.JTable userJTable;
    private javax.swing.JLabel userNameJLabel;
    // End of variables declaration//GEN-END:variables
}
