/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GiveDirectly.RecepientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.GiveDirectly.RecepientOrganization;
import Business.Organization.MobileMoneyTransfer.VendorOrganization;
import Business.Organization.Organization;
import Business.Person.Recepient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ProvideMoneyWorkRequest;
import Business.WorkQueue.RecepientApprovalWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amey
 */
public class RequestMoneyJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private RecepientOrganization recepientOrganization;
    private Enterprise enterprise;
    private EcoSystem system;
    /**
     * Creates new form RequestMoneyJPanel
     */
    public RequestMoneyJPanel(JPanel userJPanel, Enterprise enterprise, 
           RecepientOrganization organization,UserAccount account,EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userJPanel;
        this.enterprise = enterprise;
        this.recepientOrganization = organization;
        this.userAccount = account;
        this.system = ecoSystem;
        populateRequestTable();
    }

    private void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((ProvideMoneyWorkRequest) request).getProvideFunds();
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

        requestMoneyJLabel = new javax.swing.JLabel();
        refreshTestJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        requestMoneyJButton = new javax.swing.JButton();
        messageJLabel = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();

        requestMoneyJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        requestMoneyJLabel.setText("Request Money");

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

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

        requestMoneyJButton.setText("Request Money");
        requestMoneyJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestMoneyJButtonActionPerformed(evt);
            }
        });

        messageJLabel.setText("Message");

        messageJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                messageJTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                messageJTextFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(431, 431, 431)
                .addComponent(requestMoneyJLabel)
                .addGap(380, 380, 380))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(requestMoneyJButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(messageJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(refreshTestJButton)))
                .addGap(289, 289, 289))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(requestMoneyJLabel)
                .addGap(38, 38, 38)
                .addComponent(refreshTestJButton)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageJLabel)
                    .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestMoneyJButton)
                    .addComponent(backJButton))
                .addContainerGap(179, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
        populateRequestTable();
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestMoneyJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestMoneyJButtonActionPerformed
        if (messageJTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the message!!!");
            messageJTextField.setText("");
            messageJTextField.requestFocus();
        }
        else{
            try{
                Float message = Float.parseFloat(messageJTextField.getText());
                System.out.println("Recepient is: "+userAccount.getPerson());
                Recepient recepient = (Recepient)userAccount.getPerson();
                if(message > recepient.getAccountBalance()){
                    JOptionPane.showMessageDialog(null, "Amount exceeded the limit set for you!!!");
                    messageJTextField.setText("");
                    messageJTextField.requestFocus();
                    return;
                }
                ProvideMoneyWorkRequest request = new ProvideMoneyWorkRequest();
                request.setMessage(String.valueOf(message));
                request.setSender(userAccount);
                request.setStatus("Sent");
                request.setRequestDate(new Date());

                System.out.println("enterprise is " + enterprise);
                System.out.println("size " + enterprise.getOrganizationDirectory().getOrganizationList());

                for(Network network: system.getNetworkList()){
                    for(Enterprise ent: network.getEnterpriseDirectory().getEnterpriseList()){
                        for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()){
                            System.out.println(organization);
                            if (organization instanceof VendorOrganization){
                                System.out.println("HELLO");
                                organization.getWorkQueue().getWorkRequestList().add(request);
                                userAccount.getWorkQueue().getWorkRequestList().add(request);
                                break;
                            }
                        }
                    }
                }
                populateRequestTable();
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,
                    "Please insert valid number value!!!");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,
                    "There's some error with database,please try again later!!");
            }
        }
    }//GEN-LAST:event_requestMoneyJButtonActionPerformed

    private void messageJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_messageJTextFieldKeyTyped
        // TODO add your handling code here:
        char character = evt.getKeyChar();
        if(!(Character.isDigit(character) || character == KeyEvent.VK_BACK_SPACE || character == KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_messageJTextFieldKeyTyped

    private void messageJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_messageJTextFieldKeyPressed
        // TODO add your handling code here:
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_C) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "You cannot copy code from this field!!!");
        } 
        else if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_X) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "You cannot cut code from this field!!!");
        } 
        else if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_V) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "You cannot paste code into this field!!!");
        }
    }//GEN-LAST:event_messageJTextFieldKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel messageJLabel;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestMoneyJButton;
    private javax.swing.JLabel requestMoneyJLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
