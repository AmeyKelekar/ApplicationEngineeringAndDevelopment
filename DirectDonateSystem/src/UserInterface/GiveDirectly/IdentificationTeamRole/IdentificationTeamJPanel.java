/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GiveDirectly.IdentificationTeamRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Amey
 */
public class IdentificationTeamJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    /**
     * Creates new form IdentificationTeamJPanel
     */
    public IdentificationTeamJPanel(JPanel userJPanel, Enterprise enterprise, 
            Organization organization,UserAccount account,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userJPanel;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userAccount = account;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestCensusDataJButton = new javax.swing.JButton();
        identificationTeamWorkAreaJLabel = new javax.swing.JLabel();

        requestCensusDataJButton.setText("Request Census Data");
        requestCensusDataJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestCensusDataJButtonActionPerformed(evt);
            }
        });

        identificationTeamWorkAreaJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        identificationTeamWorkAreaJLabel.setText("Identification Team WorkArea");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(identificationTeamWorkAreaJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(requestCensusDataJButton)))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(identificationTeamWorkAreaJLabel)
                .addGap(47, 47, 47)
                .addComponent(requestCensusDataJButton)
                .addContainerGap(409, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestCensusDataJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestCensusDataJButtonActionPerformed
        // TODO add your handling code here:
        RequestCensusDataJPanel requestCensusDataJPanel = new RequestCensusDataJPanel(
                userProcessContainer,enterprise,userAccount, organization,system);
        userProcessContainer.add("RequestCensusDataJPanel", requestCensusDataJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestCensusDataJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel identificationTeamWorkAreaJLabel;
    private javax.swing.JButton requestCensusDataJButton;
    // End of variables declaration//GEN-END:variables
}
