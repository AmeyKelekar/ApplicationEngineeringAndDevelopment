/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.GiveDirectly.SupervisorRole.SupervisorJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Amey
 */
public class SupervisorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        return new SupervisorJPanel(userProcessContainer,enterprise,organization,account,ecoSystem);
    }
    
}
