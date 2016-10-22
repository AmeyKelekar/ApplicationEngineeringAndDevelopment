/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GiveDirectly.AdminRole;

import Business.Organization.GiveDirectly.DonorOrganization;
import Business.Organization.GiveDirectly.FieldTeamOrganization;
import Business.Organization.GiveDirectly.FinanceOrganization;
import Business.Organization.GiveDirectly.IdentificationTeamOrganization;
import Business.Organization.GiveDirectly.RecepientOrganization;
import Business.Organization.GiveDirectly.SupervisorOrganization;
import Business.Person.Person;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Person.Donor;
import Business.Person.FieldTeamPerson;
import Business.Person.FinancePerson;
import Business.Person.IdentificationTeamPerson;
import Business.Person.Supervisor;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amey
 */
public class ManagePersonJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private static final String EMAIL_PATTERN = 
    "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManagePersonJPanel(JPanel userProcessContainer,OrganizationDirectory organizationDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
    }
    
    public void populateOrganizationComboBox(){
        organizationJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){       
                organizationJComboBox.addItem(organization);
        }
    }
    
    public void populateOrganizationEmpComboBox(){
        organizationPersonJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            if(!(organization instanceof RecepientOrganization)){
                organizationPersonJComboBox.addItem(organization);
            }
        }
    }

    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Person person : organization.getPersonDirectory().getPersonList()){
            Object[] row = new Object[2];
            row[0] = person.getId();
            row[1] = person.getFirstName();
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

        genderButtonGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        organizationJLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        firstNameJLabel = new javax.swing.JLabel();
        firstNameJTextField = new javax.swing.JTextField();
        organizationPersonJComboBox = new javax.swing.JComboBox();
        organizationPersonJLabel = new javax.swing.JLabel();
        managePersonJLabel = new javax.swing.JLabel();
        lastNameJLabel = new javax.swing.JLabel();
        genderJLabel = new javax.swing.JLabel();
        ageJLabel = new javax.swing.JLabel();
        addressJLabel = new javax.swing.JLabel();
        pincodeJLabel = new javax.swing.JLabel();
        emailIdJLabel = new javax.swing.JLabel();
        lastNameJTextField = new javax.swing.JTextField();
        maleJRadioButton = new javax.swing.JRadioButton();
        femaleJRadioButton = new javax.swing.JRadioButton();
        ageJTextField = new javax.swing.JTextField();
        addressJTextField = new javax.swing.JTextField();
        pinCodeJTextField = new javax.swing.JTextField();
        phoneNumberJTextField = new javax.swing.JTextField();
        emailIdJTextField = new javax.swing.JTextField();
        phoneNumberJLabel = new javax.swing.JLabel();

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        addJButton.setText("Create Person");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        organizationJLabel.setText("Organization");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        firstNameJLabel.setText("First Name");

        firstNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameJTextFieldActionPerformed(evt);
            }
        });

        organizationPersonJLabel.setText("Organization");

        managePersonJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        managePersonJLabel.setText("Manage Person");

        lastNameJLabel.setText("Last Name");

        genderJLabel.setText("Gender");

        ageJLabel.setText("Age");

        addressJLabel.setText("Address");

        pincodeJLabel.setText("Pincode");

        emailIdJLabel.setText("Email ID");

        maleJRadioButton.setText("Male");

        femaleJRadioButton.setText("Female");

        ageJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageJTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ageJTextFieldKeyTyped(evt);
            }
        });

        pinCodeJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pinCodeJTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pinCodeJTextFieldKeyTyped(evt);
            }
        });

        phoneNumberJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phoneNumberJTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneNumberJTextFieldKeyTyped(evt);
            }
        });

        phoneNumberJLabel.setText("Phone Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(managePersonJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(organizationJLabel)
                        .addGap(173, 173, 173)
                        .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(262, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailIdJLabel)
                            .addComponent(pincodeJLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(phoneNumberJLabel)
                                .addGap(161, 161, 161)
                                .addComponent(phoneNumberJTextField))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(51, 51, 51)
                                    .addComponent(backJButton)
                                    .addGap(93, 93, 93)
                                    .addComponent(addJButton))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(firstNameJLabel)
                                        .addGap(183, 183, 183)
                                        .addComponent(firstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lastNameJLabel)
                                            .addComponent(genderJLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(maleJRadioButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(femaleJRadioButton))
                                            .addComponent(lastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ageJLabel)
                                            .addComponent(addressJLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ageJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                            .addComponent(addressJTextField)
                                            .addComponent(pinCodeJTextField)
                                            .addComponent(emailIdJTextField))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(organizationPersonJLabel)
                                    .addGap(173, 173, 173)
                                    .addComponent(organizationPersonJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(managePersonJLabel)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationJLabel)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationPersonJLabel)
                    .addComponent(organizationPersonJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameJLabel)
                    .addComponent(firstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameJLabel))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderJLabel)
                    .addComponent(maleJRadioButton)
                    .addComponent(femaleJRadioButton))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageJLabel)
                    .addComponent(ageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressJLabel)
                    .addComponent(addressJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pincodeJLabel)
                    .addComponent(pinCodeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailIdJLabel)
                    .addComponent(emailIdJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberJLabel)
                    .addComponent(phoneNumberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(addJButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        if (firstNameJTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the name!!!");
            firstNameJTextField.setText("");
            firstNameJTextField.requestFocus();
        }
        else if (lastNameJTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null,"Please enter the Last Name!!!");
            lastNameJTextField.setText("");
            lastNameJTextField.requestFocus();
        }
        else if((maleJRadioButton.isSelected() == false) &&
                (femaleJRadioButton.isSelected() == false) ){
            JOptionPane.showMessageDialog(null, "Please select the gender!!!");
        } 
        else if (ageJTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the Age!!!");
            ageJTextField.setText("");
            ageJTextField.requestFocus();
        }
        else if (addressJTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the Address!!!");
            addressJTextField.setText("");
            addressJTextField.requestFocus();
        }
        else if (pinCodeJTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the Pin Code!!!");
            pinCodeJTextField.setText("");
            pinCodeJTextField.requestFocus();
        }
        else if (emailIdJTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the Email ID!!!");
            emailIdJTextField.setText("");
            emailIdJTextField.requestFocus();
        }
        else if (phoneNumberJTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null,"Please enter the Phone !!!");
            phoneNumberJTextField.setText("");
            phoneNumberJTextField.requestFocus();
        }
        else if(!(emailIdJTextField.getText().matches(EMAIL_PATTERN))){
            JOptionPane.showMessageDialog(null, "Please enter valid Email ID!");
            emailIdJTextField.setText("");
            emailIdJTextField.requestFocus();
        }
        else{
            try{
                Organization organization = (Organization) organizationPersonJComboBox.getSelectedItem();
                String gender = null;
                if(maleJRadioButton.isSelected()){
                    gender = "Male";
                }
                else{
                    gender = "Female";
                }
                if(organization instanceof DonorOrganization){
                    Donor donor = new Donor();
                    donor.setFirstName(firstNameJTextField.getText().trim());
                    donor.setLastName(lastNameJTextField.getText().trim());
                    donor.setGender(gender);
                    donor.setAge(Integer.parseInt(ageJTextField.getText().trim()));
                    donor.setAddress(addressJTextField.getText().trim());
                    donor.setPincode(Integer.parseInt(pinCodeJTextField.getText().trim()));
                    donor.setEmailId(emailIdJTextField.getText().trim());
                    donor.setPhoneNumber(Float.parseFloat(phoneNumberJTextField.getText()));
                    organization.getPersonDirectory().getPersonList().add(donor);
                    JOptionPane.showMessageDialog(null, "Donor created successfully!!!");
                }
                else if (organization instanceof SupervisorOrganization){
                    Supervisor supervisor = new Supervisor();
                    supervisor.setFirstName(firstNameJTextField.getText().trim());
                    supervisor.setLastName(lastNameJTextField.getText().trim());
                    supervisor.setGender(gender);
                    supervisor.setAge(Integer.parseInt(ageJTextField.getText().trim()));
                    supervisor.setAddress(addressJTextField.getText().trim());
                    supervisor.setPincode(Integer.parseInt(pinCodeJTextField.getText().trim()));
                    supervisor.setEmailId(emailIdJTextField.getText().trim());
                    supervisor.setPhoneNumber(Float.parseFloat(phoneNumberJTextField.getText()));
                    organization.getPersonDirectory().getPersonList().add(supervisor);
                    JOptionPane.showMessageDialog(null, "Supervisor created successfully!!!");
                }
                else if (organization instanceof FieldTeamOrganization){
                    FieldTeamPerson fieldTeamPerson = new FieldTeamPerson();
                    fieldTeamPerson.setFirstName(firstNameJTextField.getText().trim());
                    fieldTeamPerson.setLastName(lastNameJTextField.getText().trim());
                    fieldTeamPerson.setGender(gender);
                    fieldTeamPerson.setAge(Integer.parseInt(ageJTextField.getText().trim()));
                    fieldTeamPerson.setAddress(addressJTextField.getText().trim());
                    fieldTeamPerson.setPincode(Integer.parseInt(pinCodeJTextField.getText().trim()));
                    fieldTeamPerson.setEmailId(emailIdJTextField.getText().trim());
                    fieldTeamPerson.setPhoneNumber(Float.parseFloat(phoneNumberJTextField.getText()));
                    organization.getPersonDirectory().getPersonList().add(fieldTeamPerson);
                    JOptionPane.showMessageDialog(null, "FieldTeam Person created successfully!!!");
                }
                else if (organization instanceof IdentificationTeamOrganization){
                    IdentificationTeamPerson identificationTeamPerson = new IdentificationTeamPerson();
                    identificationTeamPerson.setFirstName(firstNameJTextField.getText().trim());
                    identificationTeamPerson.setLastName(lastNameJTextField.getText().trim());
                    identificationTeamPerson.setGender(gender);
                    identificationTeamPerson.setAge(Integer.parseInt(ageJTextField.getText().trim()));
                    identificationTeamPerson.setAddress(addressJTextField.getText().trim());
                    identificationTeamPerson.setPincode(Integer.parseInt(pinCodeJTextField.getText().trim()));
                    identificationTeamPerson.setEmailId(emailIdJTextField.getText().trim());
                    identificationTeamPerson.setPhoneNumber(Float.parseFloat(phoneNumberJTextField.getText()));
                    organization.getPersonDirectory().getPersonList().add(identificationTeamPerson);
                    JOptionPane.showMessageDialog(null, "IdentificationTeam Person created successfully!!!");
                }
                else if (organization instanceof FinanceOrganization){
                    FinancePerson financePerson = new FinancePerson();
                    financePerson.setFirstName(firstNameJTextField.getText().trim());
                    financePerson.setLastName(lastNameJTextField.getText().trim());
                    financePerson.setGender(gender);
                    financePerson.setAge(Integer.parseInt(ageJTextField.getText().trim()));
                    financePerson.setAddress(addressJTextField.getText().trim());
                    financePerson.setPincode(Integer.parseInt(pinCodeJTextField.getText().trim()));
                    financePerson.setEmailId(emailIdJTextField.getText().trim());
                    financePerson.setPhoneNumber(Float.parseFloat(phoneNumberJTextField.getText()));
                    organization.getPersonDirectory().getPersonList().add(financePerson);
                    JOptionPane.showMessageDialog(null, "FinanceTeam Person created successfully!!!");
                }
                else{
                    String name = firstNameJTextField.getText().trim();
                    organization.getPersonDirectory().createPerson(name);
                    JOptionPane.showMessageDialog(null, "Person created successfully!!!");
                }
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
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateTable(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void ageJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageJTextFieldKeyPressed
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
    }//GEN-LAST:event_ageJTextFieldKeyPressed

    private void ageJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageJTextFieldKeyTyped
        // TODO add your handling code here:
        char character = evt.getKeyChar();
        int length = ageJTextField.getText().length();
        if(!(Character.isDigit(character) || character == KeyEvent.VK_BACK_SPACE || character == KeyEvent.VK_DELETE)
            || length >= 3){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_ageJTextFieldKeyTyped

    private void pinCodeJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinCodeJTextFieldKeyPressed
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
    }//GEN-LAST:event_pinCodeJTextFieldKeyPressed

    private void pinCodeJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinCodeJTextFieldKeyTyped
        // TODO add your handling code here:
        char character = evt.getKeyChar();
        int length = pinCodeJTextField.getText().length();
        if(!(Character.isDigit(character) || character == KeyEvent.VK_BACK_SPACE || character == KeyEvent.VK_DELETE)
            || length>=5){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_pinCodeJTextFieldKeyTyped

    private void phoneNumberJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumberJTextFieldKeyPressed
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
    }//GEN-LAST:event_phoneNumberJTextFieldKeyPressed

    private void phoneNumberJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumberJTextFieldKeyTyped
        // TODO add your handling code here:
        char character = evt.getKeyChar();
        int length = phoneNumberJTextField.getText().length();
        if(!(Character.isDigit(character) || character == KeyEvent.VK_BACK_SPACE || character == KeyEvent.VK_DELETE)
            || length>=10){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_phoneNumberJTextFieldKeyTyped

    private void firstNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameJTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JLabel addressJLabel;
    private javax.swing.JTextField addressJTextField;
    private javax.swing.JLabel ageJLabel;
    private javax.swing.JTextField ageJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel emailIdJLabel;
    private javax.swing.JTextField emailIdJTextField;
    private javax.swing.JRadioButton femaleJRadioButton;
    private javax.swing.JLabel firstNameJLabel;
    private javax.swing.JTextField firstNameJTextField;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel genderJLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameJLabel;
    private javax.swing.JTextField lastNameJTextField;
    private javax.swing.JRadioButton maleJRadioButton;
    private javax.swing.JLabel managePersonJLabel;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JLabel organizationJLabel;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JComboBox organizationPersonJComboBox;
    private javax.swing.JLabel organizationPersonJLabel;
    private javax.swing.JLabel phoneNumberJLabel;
    private javax.swing.JTextField phoneNumberJTextField;
    private javax.swing.JTextField pinCodeJTextField;
    private javax.swing.JLabel pincodeJLabel;
    // End of variables declaration//GEN-END:variables
}